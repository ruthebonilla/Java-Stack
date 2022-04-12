<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!-- c:out ; c:forEach ; c:if -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <!-- Formatting (like dates) -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
   <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
   <!-- for rendering errors on PUT routes -->
 <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>

<link rel="stylesheet" type="text/css" href="/css/style.css">
  <!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
      crossorigin="anonymous">

</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
        <h1>This is the form page!!</h1>
        
        <form  action="/display" method="post">
        
        <div>
        <label>Pick any number from 5 to 25:</label>
        <input class="w-25 m-2" type="number" name="number">
        </div>
        
        <div>
        <label>Enter name of any city:</label>
        <input class="w-50 m-2" type="text" name="city">
        </div>
        
        <div>
        <label>Enter the name of any real person:</label>
        <input class="w-50 m-2" type="text" name="name">
        </div>
        
        <div>
        <label>Enter professional endeavor or hobby:</label>
        <input class="w-50 m-2" type="text" name="hobby">
        </div>
        
        <div>
        <label>Enter any type of living thing:</label>
        <input class="w-50 m-2" type="text" name="livingThing">
        </div>
        
        <div>
        <label>Say something nice to someone:</label>
        <textarea class="form-control w-50 m-2" rows="3" name="niceMessage"></textarea>
        </div>
        
        <input class="btn btn-info" type="submit" value="Send">

		</form>
       
    </div> <!-- End of Container -->
</body>
</html>