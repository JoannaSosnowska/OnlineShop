<%-- 
    Document   : categories
    Created on : 2016-01-09, 16:26:51
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
        <h3>Lista kategorii</h3>
        <c:if test="${!empty listCategories}">
    <table class="tg">
    <tr>
        <th width="120">Nazwa</th>
        <th width="120">Opis</th>
        <th width="60"></th>
    </tr>
    <c:forEach items="${listCategories}" var="category">
        <tr>
            <td>${category.title}</td>
            <td>${category.description}</td>
            <td><a href="<c:url value='/category/details/${category.title}' />" >Zobacz produkty</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
        <sec:authorize access="isAuthenticated()">
            <sec:authorize access="hasAuthority('shopassistant')">
                <a href="<c:url value='/category/add' />">Dodaj nową kategorię</a>
            </sec:authorize>
        </sec:authorize>
        </jsp:body>
</t:layout>