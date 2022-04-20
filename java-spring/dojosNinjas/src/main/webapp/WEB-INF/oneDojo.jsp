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
        <h1 class="mb-5">All Ninjas from <c:out value="${dojo.name}"/></h1>
        <a class="btn btn-outline-primary mb-3" href="/dashboard">Back to Dashboard</a>


        <table class="table table-striped table-hover w-75">
            <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Age</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="i" items="${dojo.ninjas}">
                    <tr>
                        <td><c:out value="${i.firstName}"></c:out></td>
                        <td><c:out value="${i.lastName}"></c:out></td>
                        <td><c:out value="${i.age}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>


    </div> <!-- End of Container -->
</body>
</html>