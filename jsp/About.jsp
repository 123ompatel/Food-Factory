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
<%--                       <a href="${registURL }">Registration</a>
                      <a href="${loginURL }">Login</a> --%>
                    </div>
                    <!-- <div style="padding-left:16px">
                      <h2>Top Navigation Example</h2>
                      <p>Some content..</p>
                    </div>-->        
                    
                </div>
                
                <div style="height:550px">              
                 
                 <div style="padding-top:150px; padding-left:350px";>
                 <h1 >::::  <b>About Us</b>  ::::</h1><br><br>
                 <p style="padding-left:52px">
                 
		           ompatelniit@gmail.com<br>
			       BTM Layout,<br>
			       7 Fanshawe Street<br>
			       Bangalore, (KA).
                 
                 
                 </p>
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