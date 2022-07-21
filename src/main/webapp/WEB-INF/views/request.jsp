<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Сергей
  Date: 15.07.2022
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request</title>
    <!--
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
    -->
</head>
<body>
<div class="form-container">
    <form:form method="POST" modelAttribute="request" class="form-horizontal">
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-label" for="studyGroup">Study Group</label>
                <div class="col-md-7">
                    <form:input type="text" path="studyGroup" id="studyGroup" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="studyGroup" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-label" for="discipline">Disciplines</label>
                <div class="col-md-7">
                    <form:select path="discipline" id="disciplines" items="${disciplines}" multiple="false" class="form-control"/>
                    <div class="has-error">
                        <form:errors path="discipline" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-label" for="numberOfClasses">Number Of Classes</label>
                <div class="col-md-7">
                    <form:input type="text" path="numberOfClasses" id="numberOfClasses" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="numberOfClasses" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="Send" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form:form>
</div>
</body>
</html>
