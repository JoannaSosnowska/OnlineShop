<%-- 
    Document   : basket
    Created on : 2016-01-09, 16:27:41
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
        <h3>Mój koszyk</h3>
        <table>
    <tr>
        <th width="120">Nazwa</th>
        <th width="120">Opis</th>
        <th width="50">Cena jednostkowa</th>
        <th width="60">Jednostka</th>
        <th width="60">Ilość</th>
         <th width="60">Należność</th>
    </tr>
    <c:forEach items="${cart.products}" var="pr">
        <tr>
            <td class="text"><h5>${pr.product.title}</h5></td>
            <td class="text">${pr.product.description}</td>
            <td class="number">${pr.product.unitPrice}</td>
            <td class="number">${pr.product.unit}</td>
            <td class="number">${pr.quantity}</td>
            <td class="number">${pr.quantity*pr.product.unitPrice}</td>
        </tr>

    </c:forEach>
        <tr><td colspan="6"><hr/></td></tr>
        <tr><td colspan="3" class="text">Koszt: </td><td colspan="3" class="number">${cart.cost}</td></tr>
        <tr><td colspan="3"><a href="<c:url value='/purchase/create/${cart.id}' />" class="success">Do kasy</a> |
                <a href="<c:url value='/product/clearcart/${cart.id}' />">Wyczyść</a> 
      </td><td colspan="3"></td></tr>
        <tr><td colspan="6"></td></tr>
    </table>
       <hr/>
     
    </jsp:body>
        </t:layout>