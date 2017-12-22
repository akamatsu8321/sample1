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
h1{
	color: black;
	}

/* "#"はidに対応した効果をつける */
</style>
</head>

<body>
<jsp:include page="header.jsp" />
<br><br><br><br>
ここから<br>

<!-- Actionクラスへ情報を送信します。 -->
<s:form action="BuyItemAction" method="post">

<s:property value="loginUserId"/>
<s:hidden name="loginUserId" value='<s:property value="loginUserId"/>'/>
<s:property value="loginPassword"/>
<s:hidden name="loginPassword" value='<s:property value="loginPassword"/>'/>


	<s:hidden name="id" value='<s:property value="session.id" />'/>
	<span>商品名</span>
	<s:property value="session.buyItem_name" /><br>
	<s:hidden name="buyItemName" value='<s:property value="session.buyItem_name" />'/>
	<span>価格</span>
	<s:property value="session.buyItem_price"/><br>
	<s:hidden name="buyItemPrice" value='<s:property value="session.buyItem_price" />'/>
	<s:submit value="購入"></s:submit>
</s:form>
</body>
</html>