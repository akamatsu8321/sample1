<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
<title>エラーページ</title>
</head>
<body>
<jsp:include page="header.jsp" />
<br><br><br><br>
<h2>マイページはログインしてからご利用できます。</h2>
<br><br>
<span>新規ユーザー登録は<a href='<s:url action="UserCreateAction" />'>こちら</a></span>
<br>
<span>ログインは<a href='<s:url action="WelcomeAction"/>'>こちら</a></span>
</body>
</html>