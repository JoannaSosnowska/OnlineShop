<%-- 
    Document   : login
    Created on : 2016-01-09, 16:25:44
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
        <h3>Zaloguj się</h3>
        <p class="errorlist">${error}</p>
         <c:set var="loginAction"><c:url value="/j_spring_security_check"/></c:set>
        <form action="${loginAction}" method="post">
            <label>Login</label><input type="text" name="name" size="50"/><br/>
            <label>Hasło</label><input type="password" name="password" size="50"/><br/>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input type="submit" value="Zaloguj" class="success"/>
            
        </form>
    </jsp:body>
</t:layout>
