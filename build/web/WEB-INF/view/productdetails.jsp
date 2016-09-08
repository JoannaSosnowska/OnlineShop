<%-- 
    Document   : productdetails
    Created on : 2016-01-09, 16:26:32
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
        <p class="breadcrumbs">   <a href="<c:url value='/' />" >Oferta</a> -
            <a href="<c:url value='/category/all' />" >Kategorie</a> --
            <a href="<c:url value='/category/details/${product.category.title}' />" >${product.category.title}</a> </p>
        <h3>Podgląd produktu</h3>
        <img src="<c:url value='${product.imageP}'/>" alt='${product.title}' height="200" width="200"/>
        <table>
             <tr><td><h5>${product.title}</h5></td></tr>
            <tr><td>${product.description}</td></tr>
            <tr><td>${product.unitPrice} PLN -  ${product.unit}</td></tr>       
        </table>
        <sec:authorize access="isAuthenticated()">
        <sec:authorize access="hasAuthority('shopassistant')">
        <div>
         <a href="<c:url value='/product/edit/${product.id}'/>">Edytuj</a> |
         <!--<a href="<c:url value='/product/addimage/${product.id}'/>">Dodaj obraz</a> |
      
         <a href="<c:url value='/product/remove/${product.id}'/>">Usuń</a>-->
        </div>
        </sec:authorize>
        <sec:authorize access="hasAuthority('customer')">
        <div>   
            <sec:authentication var="user" property="principal" />
            <c:url var="tocartAction" value="/product/addtocart" ></c:url>
        
            <form:form action="${tocartAction}" method="POST" commandName="cartModel">
                <form:hidden path="id"/>
                <form:label path="username">
                    <spring:message text="Nazwa użytkownika"/>
                </form:label>
                <form:input path="username" readonly="true" size="50"  disabled="true" />
               <form:hidden path="username"/>
                <form:label path="quantity"><spring:message text="Ilość"/></form:label> <form:input path="quantity" type="text"/>
                <input type="submit" value="<spring:message text="Dodaj do koszyka"/>" class="success"/>
            </form:form>
        </div>
        </sec:authorize>
        </sec:authorize>
     </jsp:body>
</t:layout>