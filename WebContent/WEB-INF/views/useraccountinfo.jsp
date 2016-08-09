<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User Account Info Form</title>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
 
<body>
 
    <div class="generic-container">
    <div class="well lead">User Account Info Form</div>
    <form:form method="POST" modelAttribute="command" class="form-horizontal">
        <form:input type="hidden" path="userAccId" id="userAccId"/>
         
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="accountType">Account Type Code</label>
                <div class="col-md-7">
                     <form:select path="accountType.id" cssStyle="width: 150px;">         
                    <option value="-1">Select Account Type</option>        
                    <c:forEach items="${accountType}" var="accountType">         
                    <option value="${accountType.id}">${accountType.accountTypeName}</option>        
                    </c:forEach>       
                    </form:select>
                    <div class="has-error">
                        <form:errors path="accountType.id" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="user">User Name</label>
                <div class="col-md-7">
                     <form:select path="user.id" cssStyle="width: 150px;">         
                    <option value="-1">Select a User</option>        
                    <c:forEach items="${users}" var="user">         
                    <option value="${user.id}">${user.firstName}</option>        
                    </c:forEach>       
                    </form:select>
                    <div class="has-error">
                        <form:errors path="accountLoginName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="accountLoginName">Account Login Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="accountLoginName" id="accountLoginName" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="accountLoginName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="accountPassword">Account Password</label>
                <div class="col-md-7">
                    <form:input type="password" path="accountPassword" id="accountPassword" class="form-control input-sm"
 
/>
                    <div class="has-error">
                        <form:errors path="accountPassword" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="accountMailId">Account Email</label>
                <div class="col-md-7">
                    <form:input type="text" path="accountMailId" id="accountMailId" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="accountMailId" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        
 
        <div class="row">
            <div class="form-actions floatRight">
                <c:choose>
                    <c:when test="${edit}">
                        <input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a
 
href="<c:url value='/useraccountinfo' />">Cancel</a>
                    </c:when>
                    <c:otherwise>
                        <input type="submit" value="Register" class="btn btn-primary btn-sm"/> or <a
 
href="<c:url value='/useraccountinfo' />">Cancel</a>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </form:form>
    </div>
</body>
</html>