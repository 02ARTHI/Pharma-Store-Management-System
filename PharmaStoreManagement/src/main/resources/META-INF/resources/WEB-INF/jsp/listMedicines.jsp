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
			<h1>Your Medicines</h1><br>
			<table class="table">
				<thead>
					<tr>
						<th>Medicine ID</th>
						<th>Company Name</th>
						<th>Medicine Name</th>
						<th>Description</th>
						<th>Batch Number</th>
						<th>Expiry Date</th>
						<th>Stock Count</th>
					</tr>
				</thead>
				<tbody>		
					<c:forEach items="${med}" var="med">
						<tr>
							
							<td>${med.mid}</td>
							<td>${med.company}</td>
							<td>${med.mname}</td>
							<td>${med.description}</td>
							<td>${med.batch}</td>
							<td>${med.validity}</td>
							<td>${med.count}</td>
							<td><a href="update-todo?id=${med.mid} " class="btn btn-success">UPDATE </a></td>
							<td><a href="delete-todo?id=${med.mid} " class="btn btn-warning">DELETE </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		  <a href="add-todo" class="btn btn-success"> Add medicines</a>
		</div>
		
		<%@ include file="common/footer.jspf" %>