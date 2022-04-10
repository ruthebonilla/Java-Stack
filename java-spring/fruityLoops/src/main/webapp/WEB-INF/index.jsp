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
<title>Fruity Looooops</title>

<link rel="stylesheet" type="text/css" href="/css/fruityLoops.css">
  <!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
      crossorigin="anonymous">

</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
        <h1>Come get your fruits!!</h1>
        <div class="table w-50">
	        <c:forEach var="oneFruit" items="${fruits}">
	        	<p><c:out value="${oneFruit.getName()}"></c:out>&nbsp; &nbsp; &nbsp;       	
	        	$<c:out value="${oneFruit.getPrice()}"></c:out></p>
	    	</c:forEach>
    	</div>
       
    </div> <!-- End of Container -->
</body>
</html>