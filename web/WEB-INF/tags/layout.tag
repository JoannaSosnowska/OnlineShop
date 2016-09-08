<%-- 
    Document   : layout
    Created on : 2016-01-10, 00:11:24
    Author     : Joanna667
--%>

<%@tag description="layout" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Drogeria internetowa</title>
        <style>
            html {
          margin:0;
          padding:0;
          border:0;
        }
        body, div, span, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, code, del, dfn, em, img, q, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, dialog, figure, footer, header, hgroup, nav, section {margin:0;padding:0;border:0;font-weight:inherit;font-style:inherit;font-size:100%;font-family:inherit;vertical-align:baseline;}
article, aside, dialog, figure, footer, header, hgroup, nav, section {display:inline-block;}

        body{
          font-size:75%;
          color:#222;
          background:#fff;
          font-family:"Helvetica Neue", Arial, Helvetica, sans-serif;
        }
        #header {
          border-bottom: 1px solid lightgray;
          text-align:center;
          padding-right:24px;
          margin-right:25px;
          width:100%;
        }
        #copyright{
            font-size: 10px;
            font-style: italic;
            color:#89a820;
        }
        #footer{
          text-align:left; 
          margin-left: 50px;
        }
        #empty{
            width:30%;
            height:100%;
            float:left;
        }
        #main{
            width:70%;
            height:100%; 
            float:left;
        }
        h1, h2, h3, h4, h5, h6 {font-weight:normal;color:#89a820; }

        h1 {font-size:3em;line-height:1;margin-bottom:0.5em;}
        h2 {font-size:2em;margin-bottom:0.75em;}
        h3 {font-size:1.5em;line-height:1;margin-bottom:1em;}
        h4 {font-size:1.2em;line-height:1.25;margin-bottom:1.25em;}
        h5 {font-size:1em;font-weight:bold;margin-bottom:1.5em;}
        h6 {font-size:1em;font-weight:bold;}
        a {
          color:#89a820;
          text-decoration:underline;
          margin-left: 20px;
        }
        
        #content-wrapper{
          padding-right:24px;
          margin-right:25px;
          margin-top: 30px;
          width:100%;
          min-height:500px;
          border-bottom: 1px solid lightgray;
        }
        ul#menu li{
            display:inline-block;
            list-style-type: none;
            padding-right: 20px;
            float: left;
        }
        ul#menu li a{
            color: #89a820;
            font-size: 20px;
            text-decoration: none;
        }
        ul#menu li a:hover{
            font-weight: bold;
            font-style: italic;
        }
        .alert, .error{
          padding:0.8em;
          margin-bottom:1em;
          border:2px solid #ddd;
          font-weight:bold;

        }
        .alert{
           background:#acc262;
           color:#0f0f0f;
           border-color:#89a820;
        }
        .error{
          background:#fbe3e4;
          color:#8a1f11;
          border-color:#fbc2c4;
        }
        .errorlist { color: red; }
        .breadcrumbs{
          color:#89a820;
          font-weight: bold;
          font-size:1.1em;
          margin-bottom: 15px;
        }
        .small {
          font-size:.8em;
          margin-bottom:1.875em;
          line-height:1.875em;
        }
        .large {
          font-size:1.2em;
          line-height:2.5em;
          margin-bottom:1.25em;
        }
        /* LISTY */
        li ul, li ol {margin:0;}
        ul {
          list-style-type:none;
          margin:0 1.5em 1.5em 0;
          padding-left:1.5em;
        }
        /* TABELKI */
        table tr td{
          text-align: left;
          padding-top:10px;
          font-size: 1.2em;
        }
        table tr td.text{
          text-align: left;
          padding-top:5px;
        }
        table tr td.number{
          text-align: right;
          padding-top:5px;
        }
        table th{
            text-align: center;
            font-size: 1.5em;
        }
        /* FORMULARZE */
        label {font-weight:bold;}
        input[type=text], input[type=password], input.text, input.title, textarea, select {margin:0.5em 0;}
        input[type=text], input[type=password], input.text, input.title, textarea {background-color:#fff;border:1px solid #bbb;}
        input[type=text]:focus, input[type=password]:focus, input.text:focus, input.title:focus, textarea:focus {border-color:#666;}
        select {background-color:#fff;border-width:1px;border-style:solid;}
        input[type=text], input[type=password], input.text, input.title, textarea, select {margin:0.5em 0;}
        input.text, input.title {width:300px;padding:5px;}
        input.title {font-size:1.5em;}
        textarea {width:390px;height:250px;padding:5px;}
        form.inline {line-height:3;}
        form.inline p {margin-bottom:0;}
        .error, .alert, .notice, .success, .info {padding:0.8em;margin-bottom:1em;border:2px solid #ddd;}
        .error{background:#fbe3e4;color:#8a1f11;border-color:#fbc2c4;}
        .alert{background:#acc262; color:#0f0f0f; border-color:#89a820;}
        .notice {background:#fff6bf;color:#514721;border-color:#ffd324;}
        .success {background:#e6efc2;color:#264409;border-color:#c6d880;}
        .info {background:#d5edf8;color:#205791;border-color:#92cae4;}
        .error a{color:#8a1f11;}
        .alert a{color:#444d27;}
        .notice a {color:#514721;}
        .success a {color:#264409;}
        .info a {color:#205791;}
        </style>
    </head>
    <body>
        <br />
        <div id="header">
           <jsp:invoke fragment="header"/>
        </div>        
        <div id="content-wrapper">
         
            <div id="empty">
                <sec:authorize access="isAuthenticated()">
                    <c:set var="logoutAction"><c:url value="/j_spring_security_logout"/></c:set>
      
                    <form action="${logoutAction}" method="post"> 
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <input type="submit" value="Wyloguj" class="success"/>
                    </form>
                    </sec:authorize>
            </div>
        <div id="main">
           <jsp:doBody/>        
        </div>
        </div>
        <div id="footer">
           <jsp:invoke fragment="footer"/>
        </div>
    </body>
</html>
