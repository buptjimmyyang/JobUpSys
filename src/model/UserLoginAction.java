package model;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import bean.HibernateSessionFactory;
import bean.user;

public class UserLoginAction {
private int id;
private String password;

private String type;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}




public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String execute() throws UnsupportedEncodingException{
	System.out.println(type);
//	Session session=HibernateSessionFactory.getSession();
//	Criteria crit=session.createCriteria(user.class);
//	crit.add(Restrictions.eq("type", type));
//	List<user> u=crit.list();
//	for(user u1:u)
//	{
//		System.out.print(u1.getId()+" "+u1.getPassword()+u1.getType());
//	}
//	session.close();
	Session session=HibernateSessionFactory.getSession();
	String hql="from user where type like ?";
	Query query =session.createQuery(hql);
	query.setString(0,type);
	List<user> u=query.list();
	for(user u1:u)
	{
		System.out.print(u1.getId()+" "+u1.getPassword()+u1.getType());
	}
	session.close();
	return "success";
}
}
