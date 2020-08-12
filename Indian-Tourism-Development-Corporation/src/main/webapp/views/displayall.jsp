<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
                    <style>
                    table, tr, td
                    {
                         border: 4px solid black;
                         width : 40%;
                         text-align: center; 
                         border-collapse: collapse;
                    }
                    table.center 
                    {
                          margin-left: auto;
                          margin-right: auto;
                          
                    }
  
                  </style>

<meta charset="ISO-8859-1">

<title>List of Hotels</title>
</head>
<body style="background-color:oldlace;">
    <center><h1>List of Hotels</h1></center>
    
             <table class="center">
                                
                                <tr>
                                    <td>Hotel id</td>
                                    <td>Hotel name</td>
                                    <td>Hotel phno</td>
                                    <td>Hotel address</td>
                                    <td>Rooms</td>
                                    
                                    <td> cost per day</td>
                                 </tr>
    
      <c:forEach var="s" items="${list}">
                                
                            <tr>
                                    <td>${s.hid}</td>
                                    <td>${s.hname}</td>
                                    <td>${s.hphno}</td>
                                    <td>${s.haddress}</td>
                                    <td>${s.rooms}</td>
                                    <td>${s.cost}</td>
                                    
                            </tr>
                            
                    </c:forEach>        
                    </table>
                     

</body>
</html>