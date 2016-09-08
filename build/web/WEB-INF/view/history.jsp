<%-- 
    Document   : history
    Created on : 2016-01-09, 16:44:14
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
        <h3>Historia zamówień ${name}</h3>
                <table>
    <tr>
        <th width="200"> </th>
        <th width="10"> </th>
        <th width="120">Status</th>
        <th width="10"> </th>
        <th width="120">Koszt produktów</th>
        <th width="10"> </th>
        <th width="100">Koszt z dostawą</th>
        <th width="10"> </th>
        <th width="50">Data</th>
    </tr>
    <c:forEach items="${userHistory}" var="purchase">
        <tr>
            <td class="text">Id zamówienia: <h5>${purchase.id}</h5></td>
            <td></td>
            <td class="text"><h5>${purchase.stage}</h5></td>
            <td></td>
            <td class="number">${purchase.nettocost}</td>
            <td></td>
            <td class="number">${purchase.bruttocost}</td>
            <td></td>
            <td class="number">${purchase.purchaseDt}</td>
        </tr>
        <tr>
            <td colspan="9">
                      <hr style="color: #92cae4"/>
                <table>
                    <tr>
                        <th width="120">Nazwa produktu</th>
                        <th width="10"> </th>
                        <th width="120">Kategoria</th>
                        <th width="10"> </th>
                        <th width="100">Cena</th>
                        <th width="10"> </th>
                        <th width="50">Ilość</th>
                        <th width="10"> </th>
                        <th width="50">Koszt</th>
                    </tr>
                <c:forEach items="${purchase.products}" var="pr">
                    <tr>
                    <td class="text">${pr.product.title} </td>
                    <td></td>
                    <td class="text">${pr.product.category.title}</td>
                    <td></td>
                    <td class="text">${pr.product.unitPrice} PLN / ${pr.product.unit}</td>
                    <td></td>
                    <td class="number">${pr.quantity}</td>
                    <td></td>
                    <td class="number">${pr.quantity*pr.product.unitPrice}</td>
                </tr>
                    </c:forEach>
                    </table>
          
            </td>
        </tr>

    </c:forEach>
                </table>
    </jsp:body>
</t:layout>