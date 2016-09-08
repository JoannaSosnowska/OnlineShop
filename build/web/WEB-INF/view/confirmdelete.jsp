<%-- 
    Document   : confirmdelete
    Created on : 2016-01-09, 16:48:01
    Author     : Joanna667
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<t:layout>
    <jsp:attribute name="header">
      <jsp:include page="menu.jsp"/>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright by Joanna Sosnowska</p>
    </jsp:attribute>
    <jsp:body>
        <c:url var="deleteAction" value="/product/remove" ></c:url>
       <table>
             <tr><td><h5>${product.title}</h5></td></tr>
            <tr><td>${product.description}</td></tr>
            <tr><td>${product.unitPrice} PLN -  ${product.unit}</td></tr>       
        </table>
        <h3>Czy na pewno chcesz usunąć produkt?</h3>
        <form:form action="${deleteAction}" method="POST" commandName="product"> 
            <form:hidden path="id" /><br/>
            <form:hidden path="title" /><br/>
            <form:hidden path="description" /><br/>
            <form:hidden path="unitPrice" /><br/>
            <form:hidden path="unit" /><br/>
            <form:hidden path="imageP" /><br/>
            <input type="submit" value="<spring:message text="Usuń"/>" class="success"/>
        </form:form>
    </jsp:body>
</t:layout>