<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Please sign in</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>
    <STYLE>
    .error{color:red;}
    </STYLE>
  </head>
  <body>
     <div class="container">
      <frm:form class="form-signin" method="post" action="${pageContext.request.contextPath}/authenticateTheUser">
        <h2 class="form-signin-heading">Kullanıcı Girişi</h2>
        <p>
          <label for="username" class="sr-only">Kullanıcı</label>
          <input type="text" id="username" name="username" class="form-control" placeholder="Username" required autofocus>
        </p>
        <p>
          <label for="password" class="sr-only">Şifre</label>
          <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
        </p>
		<c:if test="${param.error != null }">
			<b class="error">Hatalı kullanıcı adı veya şifre</b>
		</c:if>
		<c:if test="${param.logout != null}">
			<b class="error">Sistemden çıkış yaptınız</b>
		</c:if>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Giriş</button>
      </frm:form>
</div>
</body></html>