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
        <h1>Here's your Omikuji!</h1>
        
        <div class=box>
        <h3>
        In <c:out value="${numberToJSP}"></c:out> years, you will live in
        <c:out value="${cityToJSP}"></c:out> with
        <c:out value="${nameToJSP}"></c:out> as your roommate,
        <c:out value="${hobbyToJSP}"></c:out> for a living. The next time you see a
        <c:out value="${livingThingToJSP}"></c:out> , you will have good luck. Also, 
        <c:out value="${niceMessageToJSP}"></c:out>.
        </h3>
        </div>
    	
    	<a href="/home">Go Back</a>
       
    </div> <!-- End of Container -->
</body>
</html>