<%-- 
    Document   : addproduct
    Created on : 2016-01-09, 16:47:39
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
        <h3>Dodaj nowy produkt</h3>
        <c:url var="addPAction" value="/product/add" ></c:url>
       
        <form:form action="${addPAction}" method="post" commandName="product">
            <form:errors path="title" class="errorlist"/><br/>
            <form:label path="title"><spring:message text="Nazwa"/></form:label><br/><form:input type="text" path="title" size="50"/><br/>
            
            <form:label path="description"><spring:message text="Opis"/></form:label><br/><form:input type="text" path="description" size="50"/><br/>
            
            <form:label path="categoryName"><spring:message text="Kategoria"/></form:label><br/>
            <form:select path="categoryName">
                    <form:options items="${categories}" />
            </form:select><br/>
            <form:errors path="unitPrice" class="errorlist"/><br/>
            <form:label path="unitPrice"><spring:message text="Cena jednostkowa"/></form:label><br/><form:input type="text" path="unitPrice" size="50"/><br/>
            <form:errors path="unit" class="errorlist"/><br/>
            
            <form:label path="unit">Jednostka</form:label><br/><form:input type="text" path="unit" size="50"/><br/>
            <input type="submit" value="<spring:message text="Dodaj"/>" class="success"/>
            
        </form:form>
    </jsp:body>
</t:layout>