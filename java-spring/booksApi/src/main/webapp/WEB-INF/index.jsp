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
<title>Title Here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
    <!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
    rel="stylesheet" 
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
    crossorigin="anonymous">

</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
        <h1>All Books</h1>

        <div class="box">
        <c:forEach  var="i" items="${allBooks}" >
        <p> 
            Id: <c:out value="${ i.id}"></c:out>
            <br>
            <a href="/books/<c:out value = "${ i.id}"/>"><c:out value = "${ i.title}"/></a>
            <br>
            Language: <c:out value="${ i.language}"></c:out> 
            <br>
            Pages: <c:out value="${ i.numberOfPages}"></c:out> 
        </p>
            
        </c:forEach>
        </div>


    </div> <!-- End of Container -->
</body>
</html>