<%-- 
    Document   : purchaseconfirm
    Created on : 2016-01-19, 23:21:28
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
        <h3>Potwierdź zamówienie:</h3>
        <c:url var="confirmAction" value="/purchase/confirm" ></c:url>
       
        <form:form action="${confirmAction}" method="post" commandName="purchase">
            <form:hidden path="id" />
            <form:label path="nettocost">
                <spring:message text="Koszt produktów"/>
            </form:label>
            <form:input path="nettocost" readonly="true" size="50"  disabled="true" /><br/>
            <form:hidden path="nettocost" />
            <form:label path="bruttocost">
                <spring:message text="Koszt z dostawą"/>
            </form:label>
             <form:input path="bruttocost" readonly="true" size="50"  disabled="true" /><br/>
             <form:hidden path="bruttocost" />
             <form:label path="stage">
                <spring:message text="Status"/>
            </form:label>
             <form:input path="stage" readonly="true" size="50"  disabled="true" /><br/>
            <form:label path="purchaseDt">
                <spring:message text="Data zamówienia"/>
            </form:label>
             <form:input path="purchaseDt" readonly="true" size="50"  disabled="true" /><br/>

                 <form:hidden path="purchaseDt" /><br/>
                              <form:hidden path="transport" /><br/>
                <input type="submit" name="dalej" value="<spring:message text="dalej"/>" class="success"/>
            <input type="submit" name="anuluj" value="<spring:message text="anuluj"/>" />
            
        </form:form>
    </jsp:body>
</t:layout>
