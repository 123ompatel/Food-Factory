<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Book Table</title>
<!-- add icon link -->
  <link rel = "icon" href ="resources/images/bake.png">
  <link href="resources//bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
  <link href="resources/css/style.css" rel="stylesheet" type="text/css">
  <link href="resources/jquery/jquery-ui.min.css" type="text/css" rel="stylesheet">
  <script src="resources/jquery/jquery-3.4.1.min.js"></script>
  <script src="resources/jquery/jquery-ui.min.js"></script>

<script>

$(document).ready(function(){
	$("#date").datepicker();
});


</script>
</head>
<body>

          			   <spring:url value="/home" var="homeURL" />
				       <spring:url value="/booktable" var="booktableURL" />
				       <spring:url value="/checkbook" var="checkURL" />
				       <spring:url value="/menu" var="menuURL" />
				       <spring:url value="/about" var="aboutURL" />
				       <spring:url value="/register" var="registURL" />
				       <spring:url value="/logins" var="loginURL" />         
                       <spring:url value="/save" var="saveURL" />

		<div class="container">
			<div class="row">
					
					<div class="col-md-12" >
                    
                    <div class="topnav">
                      <a class="active" href="${homeURL}">Home</a>
                      <a href="${menuURL}">Food Menu</a>
                      <a href="${booktableURL }">Book Table</a>
                      <a href="${aboutURL }">About</a>
                      <%-- <a href="${registURL }">Registration</a>
                      <a href="${loginURL }">Login</a> --%>

                    </div>
                    <!-- <div style="padding-left:16px">
                      <h2>Top Navigation Example</h2>
                      <p>Some content..</p>
                    </div>-->        
                    
                </div>
                
               <div  class="col-md-12" style="height:550px">              
                
                              
	            <form:form action="${saveURL}" method="POST" modelAttribute="customer" style="padding-top: 150px">
				
				  <form:hidden path="id"/>
					<table width="50%" bgcolor="lightgrey" align="center">

						<tr>
							<td colspan=2>
							<center>
									<font size=4><b>Table Booking</b></font>
							</center>
						   </td>
						</tr>

						<tr>
							<td>Date:</td>
							<td><form:input path="bookdate" id="date"/></td>
						</tr>

						<tr>
							<td>Time:</td>
							<td><form:input path="booktime" type="time"/></td>
						</tr>

						<tr>
							<td><button type="Reset">Reset</td>
							<td><button type="submit" >Save</button></td>
							<td><a href="${checkURL }">Check Availability</a></td>
						</tr>

					</table>
				</form:form>
               
               
			                        
                
                </div>                         
                                                                          
                                
                <div class="col-md-12" style="height: 45px;background-color: black;text-align:center;padding-top: 15px;color: white" >
                    <h6>@ompatel</h6>
                </div>
                 <div class="col-md-12" style="height: 45px;background-color: lightgrey;" >
                 </div>
					<div class="col-md-12" style="height: 60px;background-color: lightgrey;" >
                 </div>
					
			</div>
		</div>
		


        <script src="resources/bootstrap/bootstrap.min.js"></script>
        <script src="resources/bootstrap/jquery.js"></script>
</body>
</html>