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
				       <spring:url value="/itemmenu" var="menuURL" />
				       <spring:url value="/about" var="aboutURL" />
				       <spring:url value="/register" var="registURL" />
				       <spring:url value="/logins" var="loginURL" />
				       <spring:url value="/checkedItems" var="saveitemURL" />
					   <spring:url value="/checkorder" var="checkOrderURL" />
					
		<div class="container">
			<div class="row">
					
					<div class="col-md-12" >
                    
                    <div class="topnav">
                      <a class="active" href="${homeURL}">Home</a>
                      <a href="${menuURL}">Food Menu</a>
                      <a href="${booktableURL }">Book Table</a>
                      <a href="${aboutURL }">About</a>
                      <%-- <a href="${registURL }">Registration</a>
                      <a href="${loginURL }">Login</a>                       --%>
                   </div>
                    <!-- <div style="padding-left:16px">
                      <h2>Top Navigation Example</h2>
                      <p>Some content..</p>
                    </div>-->        
                    
                </div>            
             		
             	         <div style="height:550px">
             	             <form:form action="${saveitemURL}" method="GET" >
             	        
             <%-- 	        <c:forEach items = "${list}" var="item">
             	        	<input type = "checkbox" name="selectedItems" value="${item.itemid}"/>${item.itemname}<br>
             	        	
             	        </c:forEach> --%>
             	        
             	        
             	        
             	        <div style="padding-top:50px;padding-left:100px">
             	            <table border="1" >

							<tr bgcolor="lightblue">
							<td align="center">Item-Name</td>
							<td align="center">Quantity</td>
							<td align="center">Price</td>
<!-- 						<td>Action</td> -->
							</tr>
							
							<c:forEach var="lis" items="${list }">
									<tr bgcolor="lightpink">
								<td><input type = "checkbox" name="selectedItems" value="${lis.itemid}"/>${lis.itemname}<br></td>
								<td><input type = "number" name="qty" placeholder="0" value=0 /><br></td>
								<td> ${lis.price}<br></td>
									</tr>
							</c:forEach>
							
							</table>
             	        
             	        </div>
             	        
             	        
             
             	         <div style="padding-left:700px;padding-top:;">   
             		      
             		     	 <button  class="button" type="submit" onclick="myFunction()" >Order Now</button>  <br><br><br>          
                              
                              <%-- <td><a href="${checkOrderURL }">Order History</a></td> --%>
                              
                         </div> 
             	                       	      </form:form>   
             	      
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