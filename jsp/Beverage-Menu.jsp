<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
<!-- add icon link -->
 <link rel = "icon" href ="resources/images/bake.png">
 <link href="resources/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
  <link href="resources/css/style.css" rel="stylesheet" type="text/css">
  <link href="resources/css/album.css" rel="stylesheet" type="text/css">
  
  <style type="text/css"> 
  
  .button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
  </style>
  
  <script>
function myFunction() {
  alert("Thanks for choosing us...\nYour Order is placed")
}
</script>
  
</head>
<body>
					
					   <spring:url value="/home" var="homeURL" />
				       <spring:url value="/booktable" var="booktableURL" />
				       <spring:url value="/check" var="checkURL" />
				       <spring:url value="/menu" var="menuURL" />
				       <spring:url value="/about" var="aboutURL" />
				       <spring:url value="/register" var="registURL" />
				       <spring:url value="/logins" var="loginURL" />
				       <spring:url value="/saveme" var="savemeURL" />
					
					
		<div class="container">
			<div class="row">
					
					<div class="col-md-12" >
                    
                    <div class="topnav">
                      <a class="active" href="${homeURL}">Home</a>
                      <a href="${menuURL}">Food Menu</a>
                      <a href="${booktableURL }">Book Table</a>
                      <a href="${aboutURL }">About</a>
                      <a href="${registURL }">Registration</a>
                      <a href="${loginURL }">Login</a>                      
                   </div>
                    <!-- <div style="padding-left:16px">
                      <h2>Top Navigation Example</h2>
                      <p>Some content..</p>
                    </div>-->        
                    
                </div>            
             		
             	
           
             		
         
        <div class="container" style="background-color:lightgrey ;padding-top:10px">
			
			
          <div class="row">
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="resources/foodimage/food30.jpeg" alt="Card image cap">
                <div class="card-body">
                  <h4 class="card-text">Details</h4>
                  <h6 class="card-text">Chicken Burger</h6>
                  <p class="card-text">Price : 175 Rs.</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <input type="checkbox">
                    </div>
                    <small class="text-muted">...</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="resources/foodimage/food35.jpeg" alt="Card image cap">
                <div class="card-body">                  
                  <h4 class="card-text">Details</h4>
                  <h6 class="card-text">Cheese With Spinch</h6>
                  <p class="card-text">Price : 199 Rs.</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <input type="checkbox">
                    </div>
                    <small class="text-muted">...</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="resources/foodimage/food12.jpeg" alt="Card image cap">
                <div class="card-body">
                  <h4 class="card-text">Details</h4>
                  <h6 class="card-text">Fried Fish</h6>
                  <p class="card-text">Price : 220 Rs.</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <input type="checkbox">
                    </div>
                    <small class="text-muted">...</small>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="resources/foodimage/food27.jpeg" alt="Card image cap">
                <div class="card-body">
                  <h4 class="card-text">Details</h4>
                  <h6 class="card-text">Boiled Egg</h6>
                  <p class="card-text">Price : 175 Rs.</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <input type="checkbox">
                    </div>
                    <small class="text-muted">...</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="resources/foodimage/food33.jpeg" alt="Card image cap">
                <div class="card-body">
                  <h4 class="card-text">Details</h4>
                  <h6 class="card-text">Spicy Patato</h6>
                  <p class="card-text">Price : 155 Rs.</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <input type="checkbox">
                    </div>
                    <small class="text-muted">...</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="resources/foodimage/food5.jpeg" alt="Card image cap">
                <div class="card-body">
                  <h4 class="card-text">Details</h4>
                   <h6 class="card-text">Veg Chowmein</h6>
                  <p class="card-text">Price : 170 Rs.</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <input type="checkbox">
                    </div>
                    <small class="text-muted">...</small>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="resources/foodimage/food8.jpeg" alt="Card image cap">
                <div class="card-body">
                  <h4 class="card-text">Details</h4>
                   <h6 class="card-text">Veg Kawab</h6>
                  <p class="card-text">Price : 199 Rs.</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <input type="checkbox">
                    </div>
                    <small class="text-muted">...</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="resources/foodimage/food34.jpeg" alt="Card image cap">
                <div class="card-body">
                  <h4 class="card-text">Details</h4>
                  <h6 class="card-text">Vanila Cake</h6>
                  <p class="card-text">Price : 255 Rs.</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <input type="checkbox">
                    </div>
                    <small class="text-muted">...</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" src="resources/foodimage/food14.jpg" alt="Card image cap">
                <div class="card-body">
                  <h4 class="card-text">Details</h4>
                  <h6 class="card-text">Tossed Green Salad</h6>
                  <p class="card-text">Price : 190 Rs.</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <input type="checkbox">
                    </div>
                    <small class="text-muted">...</small>
                  </div>
                </div>
              </div>
            </div>
          </div>
          
                           
          
        </div>
        
        
      
             		     <div style="padding-left:800px;padding-top:50px;">    
             		                   
                             <button  class="button" onclick="myFunction()">Order Now</button><br><br><br>
                                               		
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