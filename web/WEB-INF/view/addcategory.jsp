<%-- 
    Document   : addcategory
    Created on : 2016-01-11, 00:29:40
    Author     : Joanna667
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<t:layout>
    <jsp:attribute name="header">
      <jsp:include page="menu.jsp"/>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright by Joanna Sosnowska</p>
    </jsp:attribute>
    <jsp:body>
        <c:url var="addAction" value="/category/add" ></c:url>
        <h3>Dodaj kategorię</h3>
        <form:form action="${addAction}" method="post" commandName="category">
            <form:errors path="title" class="errorlist"/><br/>
            <form:label path="title"> <spring:message text="Nazwa"/></form:label><br/><form:input type="text" path="title" size="50"/><br/>
            <form:errors path="description" class="errorlist"/><br/>
            <form:label path="description"><spring:message text="Opis"/></form:label><br/><form:input type="text" path="description" size="50"/><br/>
             <input type="submit" value="<spring:message text="Dodaj"/>" class="success"/>            
        </form:form>
    </jsp:body>
</t:layout>
