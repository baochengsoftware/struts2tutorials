<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<h1>Welcome To Struts 2!</h1>

<p><a href="<s:url action='hello' />" >Get your hello.</a></p>
<p><a href="<s:url action='register-input' />" > Register for the drawing.</a></p>


<h3>Debugging</h3>
<p><a href="<s:url action="index" namespace="config-browser" />">Launch the configuration browser</a></p>
</body>
</html>