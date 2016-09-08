<%-- 
    Document   : register
    Created on : 2016-01-09, 16:25:37
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
        <h3>Załóż konto</h3>
        <c:url var="registerAction" value="/user/register" ></c:url>
       
        <form:form action="${registerAction}" method="post" commandName="user">
            <form:errors path="nick" class="errorlist"/><br/>
            <form:label path="nick">Login</form:label><br/><form:input type="text" path="nick" size="50"/><br/>           
            <form:errors path="pass" class="errorlist"/><br/>
            <form:label path="pass">Hasło</form:label><br/><form:input type="password" path="pass" size="50"/><br/>
            <form:errors path="firstN" class="errorlist"/><br/>
            <form:label path="firstN">Imie</form:label><br/><form:input type="text" path="firstN" size="50"/><br/>
            <form:errors path="lastN" class="errorlist"/><br/>
            <form:label path="lastN">Nazwisko</form:label><br/><form:input type="text" path="lastN" size="50"/><br/>
            <form:errors path="email" class="errorlist"/><br/>
            <form:label path="email">Email</form:label><br/><form:input type="text" path="email" size="50"/><br/>            
            <form:errors path="address" class="errorlist"/><br/>
            <form:label path="address">Adres</form:label><br/><form:input type="text" path="address" size="50"/><br/>
            <form:errors path="zipCode" class="errorlist"/><br/>
            <form:label path="zipCode">Kod pocztowy</form:label><br/><form:input type="text" path="zipCode" size="50"/><br/>
            <form:errors path="city" class="errorlist"/><br/>
            <form:label path="city">Miasto</form:label><br/><form:input type="text" path="city" size="50"/><br/>
            <form:label path="st">Województwo</form:label><br/><form:input type="text" path="st" size="50"/><br/>
            <form:errors path="country" class="errorlist"/><br/>
            <form:label path="country">Kraj</form:label><br/><form:input type="text" path="country" size="50"/><br/>           
            <input type="submit" value="<spring:message text="Załóż konto"/>" class="success"/>
            
        </form:form>
    </jsp:body>
</t:layout>
