<%-- 
    Document   : categoryproducts
    Created on : 2016-01-09, 16:48:32
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
        <p class="breadcrumbs"> <a href="<c:url value='/category/all/' />" >Powrót do listy kategorii</a> </p>
       
        <h3>Produkty w kategorii: ${category.title}</h3>
        <p>${category.description}</p>
          <c:if test="${!empty category.products}">
    <table>
    <tr>
        <th width="120"><h4>Nazwa</h4></th>
        <th width="120"><h4>Opis</h4></th>
        <th width="60"></th>
    </tr>
    <c:forEach items="${category.products}" var="product">
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