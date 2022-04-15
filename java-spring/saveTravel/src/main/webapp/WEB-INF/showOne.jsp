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
    <div class="container text-center"> <!-- Beginning of Container -->
        
        <h1 class="mb-3">Expense Details</h1>

        <h1 class="border mb-3"><c:out value="${expense.name}"/></h1>
        <h3>Expense Description:&nbsp; <c:out value="${expense.description}"/></h3>
        <h3>Vendor:&nbsp; <c:out value="${expense.vendor}"/></h3>
        <h3>Amount:&nbsp; $<c:out value="${expense.amount}"/></h3>
        <br>
        <br>
        <a class="btn btn-info" href="/SaveTravel/expenses">home page</a>
        <a class="btn btn-info" href="/SaveTravel/update/${expense.id}">update expense</a>
    </div> <!-- End of Container -->
</body>
</html>