<%-- 
    Document   : checkout
    Created on : 2016-01-09, 16:43:06
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
       <jsp:include page="menu.jsp" />
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright by Joanna Sosnowska</p>
    </jsp:attribute>
    <jsp:body>
        <h3>Wybierz formę dostawy:</h3>
        <table>
            <tr>
        <th width="120">Nazwa</th>
        <th width="120">Opis</th>
        <th width="50">Cena </th>
        <th width="60">Ilość</th>
         <th width="60">Należność</th>
    </tr>
        <c:forEach items="${purchase.products}" var="pr">
        <tr>
            <td class="text"><h5>${pr.product.title}</h5></td>
            <td class="text">${pr.product.description}</td>
            <td class="text">${pr.product.unitPrice} PLN / ${pr.product.unit}</td>
            <td class="number">${pr.quantity}</td>
           <td class="number">${pr.quantity*pr.product.unitPrice}</td>
        </tr>
        </c:forEach>
        <tr><td colspan="2">Koszt bez dostawy: </td><td colspan="2">${purchase.nettocost}</td></tr>
   
        </table>
        <c:url var="checkoutAction" value="/purchase/create" ></c:url>
       
        <form:form action="${checkoutAction}" method="post" commandName="purchase">
            <form:hidden path="id" />
            <form:hidden path="stage" />
            <form:hidden path="nettocost" />
            <form:hidden path="bruttocost" />
              <form:hidden path="purchaseDt" />
            <form:select path="transport">
                <c:forEach items="${transportOptions}" var="item">
                    <form:option value="${item.value}"><spring:message text="${item.name}"/></form:option>
                </c:forEach>
            </form:select><br/>
                            <input type="submit" name="dalej" value="<spring:message text="dalej"/>" class="success"/>
            <input type="submit" name="anuluj" value="<spring:message text="anuluj"/>"/>
        </form:form>
    </jsp:body>
</t:layout>