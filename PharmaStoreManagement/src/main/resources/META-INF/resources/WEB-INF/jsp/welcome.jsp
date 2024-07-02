<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
	<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
	<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
		<title>Manage your Todos</title>	
		<style>
		  .container
		  {
		    width: 2000px;
		    height: 2000px;
		    padding: 20px;
		    margin: 100px auto;
		    background-image: url(pharmacy.jpg);
		    background-size: cover;
		    text-align: center;
		  }
		</style>	
	</head>
	<body>
<%@ include file="common/navigation.jspf" %>
<div class="container">
  <h1>welcome to boo's web page</h1>

  <hr>
   <h3>welcome ${name}!!</h3>
  <a href="list-medicines">manage</a> your medicines
  </div>
<%@ include file="common/footer.jspf" %>