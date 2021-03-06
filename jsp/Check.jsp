<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Food Junctions</title>
<!-- add icon link -->
<!--  <link rel = "icon" href ="resources/images/bake.png">
 <link href="resources/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
 <link href="resources/css/style.css" rel="stylesheet" type="text/css">
  -->
   <link rel = "icon" href ="resources/images/bake.png">
  <link href="resources/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
  <link href="resources/css/style.css" rel="stylesheet" type="text/css">
 
</head>
<body>
								
				       <spring:url value="/home" var="homeURL" />
				       <spring:url value="/booktable" var="booktableURL" />
				       <spring:url value="/check" var="checkURL" />
				       <spring:url value="/menu" var="menuURL" />
				       <spring:url value="/about" var="aboutURL" />
				       <spring:url value="/register" var="registURL" />
				       <spring:url value="/logins" var="loginURL" />				


		<div class="container">
			<div class="row">
					
					<div class="col-md-12" >
                    
                    <div class="topnav">
                      <a class="active" href="${homeURL}">Home</a>
                      <a href="${menuURL}">Food Menu</a>
                      <a href="${booktableURL }">Book Table</a>
                      <a href="${aboutURL }">About</a>
                     <%--  <a href="${registURL }">Registration</a>
                      <a href="${loginURL }">Login</a>  --%>                   </div>
                    <!-- <div style="padding-left:16px">
                      <h2>Top Navigation Example</h2>
                      <p>Some content..</p>
                    </div>-->        
                    
                </div>
                
                <div style="height:550px">              
                
                         
<%--                           <spring:url value="/add" var="addURL" /> --%>
                          <%-- <a href="${addURL}">Add new Customer</a> --%>
                         

						<h2 style="padding-left:359px;padding-top:100px"><font><strong>Table Availability History</strong></font></h2>
						
						<div style="padding-left:350px">
						<table align="center" cellpadding="5" cellspacing="5" border="1" >
						
						
						<tr bgcolor="lightblue">
						<td><b>Sr.No</b></td>
						<td><b>Booked Date</b></td>
						<td><b>Booked Time</b></td>
						<td colspan="2"><b>Action</b></td>
						</tr>						
						
						<c:forEach items="${list }" var="customer" >
						   <tr>
						    <td>${customer.id }</td>
						    <td>${customer.bookdate }</td>
						    <td>${customer.booktime }</td>
						
						    <td>
						     <spring:url value="/updatebook/${customer.id }" var="updateURL" />
						     <a href="${updateURL }">Update Order</a>
						    </td>
						    <td>
						     <spring:url value="/deletebook/${customer.id }" var="deleteURL" />
						     <a href="${deleteURL }">Cancel Order</a>
						    </td>
						   </tr>
						  </c:forEach>					
						
						</table>
                             
               </div> 
                </div>                         
                                                                          
                                
                <div class="col-md-12" style="height: 45px;background-color: black;text-align:center;padding-top: 15px;color: white" >
                    <h6>@ompatel</h6>
                </div>
                 <div class="col-md-12" style="height: 45px;background-color: lightgrey;" >
                 </div>
					<div class="col-md-12" style="height: 45px;background-color: lightgrey;" >
                 </div>
					
			</div>
		</div>
		


        <script src="resources/bootstrap/bootstrap.min.js"></script>
        <script src="resources/bootstrap/jquery.js"></script>
</body>
</html>