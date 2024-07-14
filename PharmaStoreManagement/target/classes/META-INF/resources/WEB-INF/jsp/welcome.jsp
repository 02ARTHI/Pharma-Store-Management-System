<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
	<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
	<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
		<title>Manage your Todos</title>	
		<style>
		
		body {
		background-image: url("https://cdn.pixabay.com/photo/2019/05/25/23/38/doctor-4229348_1280.jpg");
		 background-size: cover; 
		 background-attachment: fixed;
  background-size: 100% 100%;
		  max-width: 100%;
		  width: 100%;
		 display: block;
  height: auto;
	}
	div.container {
  text-align: center;
  padding: 10px 20px;
}
		  
		</style>	
	</head>
	<body>
<%@ include file="common/navigation.jspf" %>
<div class="container">
  <h1>welcome to Boo's PharmaStore </h1>

  <hr>
   
  <a href="list-medicines">manage</a> your medicines
  </div>
<%@ include file="common/footer.jspf" %>