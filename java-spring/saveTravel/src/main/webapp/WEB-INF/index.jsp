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
    <title>Save Travel</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
        rel="stylesheet" 
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
        crossorigin="anonymous">
</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
        
        <h1>Travel Expenses</h1>

        <table class="table table-striped table-hover">
            <thead>
                <tr>
                    <th>Expense</th>
                    <th>Vendor</th>
                    <th>Amount</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="i" items="${allExpenses}">
                    <tr>
                        <td>
                            <a href="/SaveTravel/expense/${i.id}">
                                <c:out value="${i.name}"></c:out> 
                            </a>
                        </td>
                        <td> <c:out value="${i.vendor}"></c:out> </td>
                        <td> $<c:out value="${i.amount}"></c:out> </td>
                        <td> 
                            <a class="btn btn-outline-dark" href="/SaveTravel/update/${i.id}">Update</a>
                            <a class="btn btn-outline-danger" href="/delete/${i.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        
        <h1>Add An Expense</h1>
        <form:form action="/create" method="post" modelAttribute="expense">
            <p>
                <form:label path="name">Expense Name:</form:label>
                <form:errors class="alert-danger" path="name"/>
                <form:input path="name"/>
            </p>
            <p>
                <form:label path="vendor">Vendor:</form:label>
                <form:errors class="alert-danger" path="vendor"/>
                <form:input path="vendor"/>
            </p>
            <p>
                <form:label path="amount">Amount:</form:label>
                <form:errors class="alert-danger" path="amount"/>
                <form:input type="number" path="amount"/>
            </p>
            <p>
                <form:label path="description">Description:</form:label>
                <form:errors class="alert-danger" path="description"/>     
                <form:textarea path="description"/>
            </p>    
            <input class="btn btn-success" type="submit" value="Submit"/>
        </form:form>    
        
    </div> <!-- End of Container -->
</body>
</html>