<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %> 
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Beowulf Struts Frontend - Welcome</title>
</head>
<body>
<h1 id="title">Hello, World!</h1>
<p>Welcome.jsp forward.</p>
<html:form action="/SomeAction" focus="food">
	<table>
		<tr>
			<td>Food: </td>
			<td><html:text property="food" size="16"/></td>
		</tr>
		<tr>
			<td>Drink: </td>
			<td><html:text property="drink" size="16"/></td>
		</tr>
	</table>
	<p><html:submit>Submit</html:submit>&nbsp;<html:reset>Reset</html:reset></p>
</html:form>
</body>
</html:html>
