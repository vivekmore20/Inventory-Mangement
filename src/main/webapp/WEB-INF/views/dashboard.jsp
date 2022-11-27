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
        <a class="nav-item nav-link" href="viewIssueRaw">Processed Logs</a>
           <a class="nav-item nav-link" href="unavailableitems">Unavailable</a>
      
    </div>
  </div>
</nav>
		 <form action = "addRawMaterial" >
  						<centre>
  						
                        <div class="form-floating mb-3">
                        <label for="id">Product Id</label><br>
                            <input type="number" class="form-control" id="id" placeholder="Enter Id" name="id">
                            
                        </div>
                        <div class="form-floating mb-3">
                        <label for="pname"> Product Name</label><br>
                            <input type="text" class="form-control" id="pname" placeholder="Enter Product Name" name="pname">
                            
                        </div>
                       
                        <div class="form-floating mb-4">
                        <label for="quantity">Quantity</label><br>
                            <input type="text" class="form-control" id="quantity" placeholder="Enter Quantity" name="quantity">
                        
                       <div class="form-floating mb-3">
                       <label for="unit">Unit</label><br>
                            <input type="text" class="form-control" id="unit" placeholder="unit in pcs,kg,ltr" name="unit">
                            
                        </div>
                        <div class="form-floating mb-3">
                         <label for="cost">Cost</label><br>
                            <input type="number" class="form-control" id="cost" placeholder="cost" name="cost">
                           <br>
                        </div>
                        <button type="submit" class="btn btn-primary py-3 w-100 mb-4">Add Raw Material</button>
                       </div>
                       </centre>
                        </form>
		
		</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
