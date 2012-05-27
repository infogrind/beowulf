<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %> 
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html>
	<head>
		<title>FoodInfo</title>
	</head>
	<body>
		<p>Hello, this is the foodInfo.</p>
		<p id="foodinfo">Your favorite food is <bean:write name="SomeForm" property="food"/>; your favorite drink is <bean:write name="SomeForm" property="drink"/></p>
		<p id="message">The message is "<bean:write name="SomeForm" property="message"/>".</p>
	</body>
</html:html>