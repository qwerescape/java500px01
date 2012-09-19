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
<title>500px Camera</title>
</head>
<body id="main-page">
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<p class="brand" style="color:white;margin-left:30px;">quality of photo vs quality of gear</p>
		</div>
	</div>	
	<div class="container">
			<c:forEach items="${gearPhotosMap}" var="entry">
		      	<c:forEach items="${entry.value }" var="url">
		      		<div class="photo-container">
		      			<div><a href="${url}"><img src="${url}"/></a></div>
		      			<div class="gear">${entry.key.camera }</div>
    				</div>
    				</c:forEach>
		    	
		</c:forEach>
	</div>
</body>
</html>