<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
	<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
	<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
		<title>Manage your medicines</title>	
		<style>
		body {
		background-image: url("https://cdn.pixabay.com/photo/2016/09/16/19/15/drug-1674890_640.png");
		 background-size: cover; 
		 background-attachment: fixed;
  background-size: 100% 100%;
		  max-width: 100%;
		  width: 100%;
		 display: block;
  height: auto;
	}
		
		    label
		  {
		    display: inline-block;
		    width:200px;
		    margin:5px;
		    text-align:left;
		  }
		</style>
		</head>
	<body>
	<%@ include file="common/navigation.jspf" %>
		<div class="container">
			<h1>Enter Medicines details</h1>
			<form:form method="post" modelAttribute="med">
		
			<fieldset class="mb-3">
				<form:label path="mid">Medicine ID :</form:label>
				<form:input type="text" path="mid" required="required" />
				<form:errors path="mid" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="mb-3">
				<form:label path="mname">Medicine Name :</form:label>
				<form:input type="text" path="mname" required="required" />
				<form:errors path="mname" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="mb-3">
				<form:label path="description">Description :</form:label>
				<form:input type="text" path="description" required="required" />
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="mb-3">
				<form:label path="company">Company Name:</form:label>
				<form:input type="text" path="company" required="required" />
				<form:errors path="company" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="mb-3">
				<form:label path="batch">Batch Number :</form:label>
				<form:input type="text" path="batch" required="required" />
				<form:errors path="batch" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="mb-3">
				<form:label path="validity">Valid Till  :</form:label>
				<form:input type="text" path="validity" required="required" />
				<form:errors path="validity" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="mb-3">
				<form:label path="count">Stock Count :</form:label>
				<form:input type="text" path="count" required="required" />
				<form:errors path="count" cssClass="text-warning" />
			</fieldset>
			
			
			
			<input type="submit" class="btn btn-success"/>
			
			</form:form>
		</div>
		<%@ include file="common/footer.jspf" %>
		<script type="text/javascript">
		$('#validity').datepicker({
			format : 'yyyy-mm-dd'
		});
	</script>