<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Users List</title>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body>
    <jsp:include page="_menu.jsp" />
     
    <h2>User Account Info List</h2>
 
    <b>This is protected page!</b>  
    
    <div class="generic-container">
        <div class="panel panel-default">
              <!-- Default panel contents -->
            <div class="panel-heading"><span class="lead">Account info for ${useracc.user.firstName} ${useracc.user.lastName} </span></div>
            
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Account</th>
                        <th>Account Login Id</th>
                        <th>Account Password</th>
                        <th>Account Mail Id</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${userAccList}" var="useracc">
                    <tr>
                       
                        <td>${useracc.accountType.accountTypeName}</td>
                        <td>${useracc.accountLoginName}</td>
                         <td>${useracc.accountPassword}</td>
                          <td>${useracc.accountMailId}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>