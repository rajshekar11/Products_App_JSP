<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List, com.jsp.entity.Category" %>
<HTML>
	<HEAD><TITLE>This is my first program</TITLE></HEAD>
	<BODY>
		<hr />
		<% List<Category> myList = (List<Category>)request.getAttribute("categoryList"); %>
		
		<fieldset>
			<legend><strong><big>Category List</big></strong></legend>
			<table width="100%" border="1" cellpadding="4" cellspacing="4">
				<tr>
					<th align="right">Category No.</th>
					<th align="left">Name</th>
				</tr>
				
				<% for(Category ct: myList){
				%>
				<tr>
					<td align="right"><%= ct.getCat_id() %></td>
					<td align="left"><%= ct.getCat_name() %></td>
				</tr>
				<%
				} %>
				
			</table>
		</fieldset>
	</BODY>
</HTML>