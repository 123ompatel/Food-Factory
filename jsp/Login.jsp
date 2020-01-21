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
				       <spring:url value="/submit" var="submitURL" />
			
				
				
				
		<div class="container">
			<div class="row">
					
<%-- 					<div class="col-md-12" >
                    
                    <div class="topnav">
                      <a class="active" href="${homeURL}">Home</a>
                      <a href="${menuURL}">Food Menu</a>
                      <a href="${booktableURL }">Book Table</a>
                      <a href="${aboutURL }">About</a>
                      <a href="${registURL }">Registration</a>
                      <a href="${loginURL }">Login</a>
                    </div>                   
                    
                    </div --%>
                
                <div style="height:550px">              
                 
                <div style="padding-left:320px;padding-top:160px">
                 <form method="post" action="${submitURL }">
                 <table bgcolor="lightgrey" align="center">

                 <tr>
                 <td colspan=2><center><font size=4><b>Log-in</b></font></center></td>
                 </tr>

                 <tr>
                 <td>Username:</td>
                 <td><input type="text" size=25 name="userid"></td>
                 </tr>

                 <tr>
                 <td>Password:</td>
                 <td><input type="Password" size=25 name="pwd"></td>
                 </tr>

                 <tr>
                 <td ><input type="Reset"></td>
                 <td><button type="submit" >Sign-In</button></td>
                 <td><button><a href="${registURL }">Sign-Up</a></button></td>
                 </tr>

                 </table>
                 </form>
					
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