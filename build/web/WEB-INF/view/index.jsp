<%-- 
    Document   : index
    Created on : 2016-01-09, 16:45:08
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
        <h3>Witaj 
    <sec:authorize access="isAuthenticated()">
        <sec:authentication property="principal.username" />
    </sec:authorize></h3>
        <h4>Wszystkie produkty</h4>
           <c:if test="${!empty products}">
    <table>
    <tr>
         <th width="120"><h4>Nazwa</h4></th>
        <th width="120"><h4>Opis</h4></th>
        <th width="50"></th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td><h5>${product.title}</h5></td>
            <td>${product.description}</td>
            <td><a href="<c:url value='/product/details/${product.id}' />" >Szczegóły</a></td>
            <td><hr/></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
    </jsp:body>

</t:layout>