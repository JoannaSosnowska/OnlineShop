<%-- 
    Document   : menu
    Created on : 2016-01-09, 19:09:39
    Author     : Joanna667
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h2><a href="<c:url value='/'/>">Drogeria internetowa</a></h2>
<nav class="span-4 last">
            <br />
            <br>
            <ul id="menu">
            <!--wszyscy -->
            <li>  <a href="<c:url value='/category/all/'/>">Oferta</a></li>
            <sec:authorize access="isAnonymous()">
           
            <li>    <a href="<c:url value='/user/login/'/>">Zaloguj się</a></li>
            <li>    <a href="<c:url value='/user/register/'/>">Załóż konto</a></li>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
            <sec:authentication var="user" property="principal" />
            <sec:authorize access="hasAuthority('customer')">
            <li>    <a href="<c:url value='/user/cart/${user.username}'/>">Koszyk</a></li>
            </sec:authorize>
            <li>     <a href="<c:url value='/user/profile/${user.username}'/>">Mój profil</a></li>
            <sec:authorize access="hasAuthority('shopassistant')">
            <li>    <a href="<c:url value='/product/add/'/>">Dodaj towar</a></li>
            <li><a href="<c:url value='/purchases/new'/>">Najnowsze zamówienia</a></li>
            </sec:authorize>
            </sec:authorize>
            </ul>
            </br>
        </nav>