<%-- 
    Document   : profile
    Created on : 2016-01-09, 16:46:26
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
        <h3>Mój profil</h3>
        <table>
            <tr><td><h5>Nazwa użytkownika: </h5></td><td>${user.nick}</td></tr>
            <tr><td><h5>Email: </h5></td><td>${user.email}</td></tr>
            <tr><td><h5>Imię: </h5></td><td>${user.firstN}</td></tr>
            <tr><td><h5>Nazwisko: </h5></td><td>${user.lastN}</td></tr>
            <tr><td><h5>Adres: </h5></td><td>${user.address}</td></tr>
            <tr><td></td><td>${user.zipCode} ${user.city}</td></tr>
            <tr><td></td><td>${user.st}/${user.country}</td></tr>
        </table>
        <br/>
     |   <a href="<c:url value='/user/edit/${user.nick}' />">Edytuj mój profil</a> |
   <a href="<c:url value='/purchase/history/${user.nick}' />">Historia zamówień</a> |
   
    </jsp:body>
</t:layout>