    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <!DOCTYPE html>  
    <html>  
    <head>  
        <title></title>  
    </head>  
    <h3></h3>  
    <body>  
        <form:form action="insert" modelAttribute="employee">  
            name: <form:input path="empName" />         
            <br><br>  
            Salary: <form:input path="empSalary" />  
            <br><br>  
            Designation: <form:input path="empDesignation" />
            <input type="submit" value="Submit" />      
        </form:form>  
    </body>  
    </html>