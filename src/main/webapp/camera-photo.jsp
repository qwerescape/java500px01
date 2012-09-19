<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resource/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
<link href="<c:url value="/resource/camera-photo.css"/>" rel="stylesheet" type="text/css">
<script src="<c:url value="/resource/ext-core.js"/>"></script>
<script type="text/javascript">
	photoJsonUrl = '<c:url value="/photos.json"/>';
</script>
<title>500px Camera</title>
</head>
<body id="main-page">
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<p class="brand" style="color:white;margin-left:30px;">Better gear means better photos?</p>
			<p style="margin-top:10px;">-- photos taken from the top 100 fav'ed from the Editor's Choice pool of <a href="http://www.500px.com">500px</a></p> 
		</div>
	</div>	
	<div class="container" id="photo-container">
	</div>
	<div id="loading-mask"><p class="lead">Getting photos and camera from 500px...</p><div class="progress progress-striped active">
  <div class="bar" style="width: 100%;"></div>
</div></div>
<script src="<c:url value="/resource/camera-photo.js"/>"></script>
</body>
</html>