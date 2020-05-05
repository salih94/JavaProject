<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<h2>ANA SAYFA</h2>
<hr/>
<p>
		<security:authentication property="principal.authorities" var="authorities"/>
		<security:authentication property="principal.username" var="user" />

	Kullanıcı: ${user}
   , Role(s) : ${authorities}
	</p>
<hr/>

<c:if test="${fn:contains(authorities,'ROLE_ADMIN')}">
<a href="google.com.tr">Link</a>
</c:if>
<frm:form action="${pageContext.request.contextPath}/logout"
		method="POST">

		<input type="submit" value="Logout" />

	</frm:form>
</body>
</html>