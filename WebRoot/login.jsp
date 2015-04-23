<%@ page language="java" import="java.util.*"  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>用户登录</title>
	
  </head>
  
  <body>
    <form action="login">
    账户:<input type="text" name="id"/>
    <br>
     密码:<input type="password" name="password"/>
       <br>
 
      类型:
      <select name="type" >
      <option value="学生" >学生</option>
      <option value="老师" >老师</option>
      <option value="管理员" >管理员</option>
      </select>    
      <br>
      <button type="submit" value="登录">登录</button>
    </form>
  </body>
</html>
