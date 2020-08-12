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
    <center><h1>Show Bookings</h1></center>
    
             <table class="center">
                                
                                <tr>
                                    <td>Bookingid</td>
                                    <td>Noofrooms</td>
                                    <td>days</td>
                                    <td>fromdate</td>
                                    <td>Todate</td>
                                    <td>Totalamount</td>
                                    <td>HotelName</td>
                                    <td>HotelId</td>
                                    <td>Hoteladdress</td>
                                    <td>customername</td>
                                    <td>customerphonenumber</td>
                                    <td>status</td>
                                 </tr>
    
      <c:forEach var="s" items="${list}">
                                
                            <tr>
                                    <td>${s.bookingid}</td>
                                    <td>${s.noofrooms}</td>
                                    <td>${s.days}</td>
                                    <td>${s.fromdate}</td>
                                    <td>${s.todate}</td>
                                    <td>${s.totalamount}</td>
                                    <td>${s.hname}</td>
                                    <td>${s.hid}</td>
                                    <td>${s.haddress}</td>
                                    <td>${s.name}</td>
                                    <td>${s.cphno}</td>
                                    <td>${s.status}</td>
                            </tr>
                            
                    </c:forEach>        
                    </table>
                     

</body>
</html>