<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta charset="UTF-8">
<title>Home画面</title>
<style type="text/css">
/* "."も"#"も無い場合はタグに対応した効果をつける */
header {
	position: absolute;
	top: 0px;
	left: 0px;
	width: 100%;
	height: 90px;
	background-color: white;
	border-bottom:2px solid #333333;

}
/* "."はclassに対応した効果をつける */
.logo {
	float: left;
	width: 700x;
	padding-left: 70px;
	padding-top: 0px;
	color: #000099;
	font-size: 30px;
	line-heght: 90px;

}

header ul {
	float: right;
	line-height: 90px;
}



header ul li {
	float: left;
	list-style: none;
	padding-right: 30px;
	color: #333333;
	font-size: 18px;

}
body{
	background-color:#EEEEEE;}



/* "#"はidに対応した効果をつける */
</style>
</head>

<body>
	<header>
		<div class="logo"><s:form action="HomeAction"><h3><s:submit value="ページ名"/></h3></s:form></div>
		<ul>
			<li><s:form action="WelcomeAction">
				<s:submit value="ログイン"/>
			</s:form></li>
			<li><s:form action="UserCreateAction">
				<s:submit value="ユーザー登録"/>
			</s:form></li>
			<li><s:form action="MypageAction">
				<s:submit value="マイページ"/>
			</s:form></li>
			<li><s:form action="CartAction">
				<s:submit value="カート"/>
			</s:form></li>
		</ul>

	</header>




</body>
</html>