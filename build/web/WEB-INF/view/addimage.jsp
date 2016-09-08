<%-- 
    Document   : addimage
    Created on : 2016-01-20, 00:20:48
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
        <h3>Dodaj obraz do produktu</h3>
        <c:url var="addImAction" value="/product/addimage?${_csrf.parameterName}=${_csrf.token}" ></c:url>
       
        <form action="${addImAction}" method="post" enctype="multipart/form-data" >
         <label>Obraz z dysku</label><br/><input type="file" name="image" size="50"/><br/>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input type="hidden" name="id" value="${product.id}"/>
            
         <input type="submit" value="<spring:message text="Dodaj"/>" class="success"/>
            
        </form>
    </jsp:body>
</t:layout>
