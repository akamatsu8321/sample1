<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
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
	<div>
		<p>以下の商品を購入します。</p>
		<s:form action="BuyItemConfirmAction">
			<span>商品名</span>
			<s:property value="session.buyItem_name" /><br>
			<s:hidden name="buyItemName" value='<s:property value="session.buyItem_name" />'/>
			<span>価格</span>
			<s:property value="session.buyItem_price"/><br>
			<s:hidden name="buyItemPrice" value='<s:property value="session.buyItem_price" />'/>
			<s:submit value="完了"/>
		</s:form>
	</div>
</body>
</html>