<%@page import="com.mvc.Inventory.Model.ProcessedItem"%>
<%@page import="com.mvc.Inventory.Model.RawMaterial"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  
<div class="container">
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="dashboard">Add Raw Material <span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link" href="viewRaw">View Raw Material</a>
      <a class="nav-item nav-link" href="dashboard123">Add Processed Item</a>
       <a class="nav-item nav-link" href="viewProcessed">View Processed Item</a>
        <a class="nav-item nav-link" href="issueRaw">Issue Raw Material</a>
         <a class="nav-item nav-link" href="issueProcessed">Issue Processed Item</a>
          <a class="nav-item nav-link" href="viewIssueRaw">Raw Logs</a>
           <a class="nav-item nav-link" href="viewIssueProcessed">Processed Logs</a>
            <a class="nav-item nav-link" href="unavailableitems">Unavailable</a>
    </div>
  </div>
</nav>
<table class="table table-striped">
    <thead>
      <tr>
        
        <th scope="col">Product Id</th>
        <th scope="col">Product Name</th>
        <th scope="col">Quantity</th>
        <th scope="col">Unit</th>
        <th scope="col">Cost</th>
        <th scope="col">Action</th>

      </tr>
    </thead>
    <% 
    List<RawMaterial> rawMaterial =(List<RawMaterial>) request.getAttribute("rawMaterial");
     for(RawMaterial r : rawMaterial)
     {
    	 if(r.getQuantity()==0)
    	 {
 %>
    <tbody>
      <tr>
        <td><%= r.getId() %></td>
        <td><%= r.getPname() %></td>
        <td><%= r.getQuantity()%></td>
        <td> <%= r.getUnit() %></td>
        <td> <%= r.getCost() %></td>
        <td> <a href="delete/<%= r.getId() %>">Delete</a> </td>
        <td> <a href="update?id=<%= r.getId() %>">Update</a> </td>
        <td> <a href="issueRawMaterial?id=<%= r.getId() %>">Issue</a> </td>
      </tr>
      <tr>
        
    </tbody>

    <% }} %>
     <% 
    List<ProcessedItem> processedItem =(List<ProcessedItem>) request.getAttribute("processedItem");	
   for( ProcessedItem ra : processedItem)
   {
	   if(ra.getPquantity()==0)
	   {
 %>
    <tbody>
      <tr>
        <td><%= ra.getPid() %></td>
        <td><%= ra.getProname() %></td>
        <td><%= ra.getPquantity()%></td>
        <td> <%= ra.getPunit() %></td>
        <td> <%= ra.getPcost() %></td>
        <td> <a href="deleteItem/<%= ra.getPid() %>">Delete</a> </td>
        <td> <a href="updateItem?id=<%= ra.getPid() %>">Update</a> </td>
         <td> <a href="issueProcessedItem?id=<%=ra.getPid()%>">Issue</a> </td>
    
      </tr>
      <tr>
        
    </tbody>

    <% } 
    }%>
  </table>

</div>
                       
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
s