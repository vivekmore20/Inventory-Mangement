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

    <title>Add Quantity</title>
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
    <form action="issueRawMat" >
  <div class="form-group">
    <label for="exampleInputEmail1">Quantity</label>
    <input type="number" class="form-control" name="quantity" aria-describedby="emailHelp" placeholder="Enter Quantity">
    <label for="exampleInputEmail1">Quantity</label>
    <input type="text" class="form-control" name="name" aria-describedby="emailHelp" placeholder="Enter Name">

    <small id="quantity" class="form-text text-muted"></small>
    <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
  </div>
  
 
	  <button type="submit" class="btn btn-primary">Issue Quantity</button>
	</form>
    
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>