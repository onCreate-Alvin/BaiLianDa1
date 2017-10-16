<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
<head>
<base href="../">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="js/situ.js"></script>
<script type="text/javascript" src="js/laydate/laydate.js"></script>
<script type="text/javascript" src="js/layer/layer.js"></script>
<script type="text/javascript" src="js/H-ui.js"></script>
<script type="text/javascript" src="js/H-ui.admin.js"></script>

<style type="text/css">
ul {
	height: 35px;
	border-top: #999 1px solid;
	border-bottom: #999 1px solid;
}

ul {
	list-style: none;
}

li {
	display: inline;
	line-height: 35px;
	padding-left: 3px;
}

.col {
	width: 186px;
	height: 25px;
}

.math {
	width: 70px;
	height: 25px;
}

.val {
	width: 150px;
	height: 25px;
}

.andro {
	width: 50px;
	height: 25px;
}

.bts {
	position: absolute;
	top: 230px;
	border: #999 solid 1px;
	padding-top: 2px;
	padding-bottom: 2px;
	width: 98%;
	margin-left: 3px;
}

button {
	width: 80px;
	border: solid 1px #444;
	height: 25px;
	margin-left: 10px;
}
</style>


</head>


<body style="min-width: 480px;background-color:#eef;" >
	<div style="min-height: 230px;overflow:auto;">

		<ul class="seach" style="height: 100%;">

		</ul>
<script type="text/javascript" src="../SeachFramework/seach.js"></script>
	<script type="text/javascript">
		var my;
		$.getJSON("../allsearch?name=${requestScope.name}", {}, function(json){
			my = new ullist($(".seach"), json.data);
			my.init();
		});
	</script>
	

</body>
</html>
