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
    <form action=addProcessdeItem>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Product Id</label>
      <input type="number" class="form-control" name="pid" placeholder="Email">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Product Name</label>
      <input type="text" class="form-control" name="proname" placeholder="">
    </div>
  </div>
  <div class="form-group col-md-6">
      <label for="inputPassword4">Quantity</label>
      <input type="text" class="form-control" name="pquantity" placeholder="">
    </div>
  <div class="form-group col-md-6">
      <label for="inputPassword4">Unit</label>
      <input type="number" class="form-control" name="punit" placeholder="">
    </div>
<div class="form-group col-md-6">
      <label for="inputPassword4">Cost</label>
      <input type="number" class="form-control" name="pcost" placeholder="">
    </div>    
  </div>
  
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>