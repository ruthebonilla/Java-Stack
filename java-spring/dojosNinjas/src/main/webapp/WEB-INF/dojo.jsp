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
<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
crossorigin="anonymous">

</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
        <h1 class="mb-3">New Dojo</h1>
        <a class="btn btn-outline-primary mb-5" href="/dashboard">Back to Dashboard</a>

        <form:form action="/create/dojo" method="post" modelAttribute="dojo">
            <p>
                <form:label path="name">Dojo Name:</form:label>
                <form:errors class="alert-danger" path="name"/>
                <form:input path="name"/>
            </p>
    
            <input class="btn btn-success" type="submit" value="Submit"/>
        </form:form>    
    </div> <!-- End of Container -->
</body>
</html>