<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>

h1{
color:#ff3333;

font-family: "Times New Roman", Times, serif;
}


</style>
</head>
<body>
<div align ="center">
   
  <h1>Register Here </h1>
  
  <form action="<%=request.getContextPath() %>/EmployeeServlet" method="post">
  <table style="width:80">
    <tr>
   <td>Emp Id: </td>
   <td><input type="text" name="id" placeholder="enter first name"/></td>
   </tr>
   
   <tr>
   <td>First Name: </td>
   <td><input type="text" name="fname" placeholder="enter first name" id="fname"/></td>
   </tr>
   
   <tr>
    <td>Last Name </td>
   <td><input type="text" name="lname" placeholder="enter last name"id="lname"></td>
   </tr>
   
   <tr>
    <td>Username: </td>
   <td><input type="text" name="uname" placeholder="enter User  name" id="uname"></td>
   </tr>
   
   <tr>
    <td>Password: </td>
   <td><input type="password" name="password" placeholder="enter Password"/></td>
   </tr>
   
    <tr>
    <td>Address: </td>
   <td><input type="text" name="address" placeholder="enter Password"/></td>
   </tr>
   <tr>
    <td>Contact: </td>
   <td><input type="text" name="contact" placeholder="enter contact here"/></td>
   </tr>
   
  </table>
  <br>
  
   <button type="submit">Submit</button> &nbsp;   &nbsp; <button type="reset">Reset</button>
    </form>
    <br>
    <form action"<%=request.getContextPath() %>/EmployeeServlet" method="get">
    <input type="text" name="id" placeholder="enter id to delete"/>
    <button type="submit" >delete</button>
    </form>
  </div>
</body>
</html>