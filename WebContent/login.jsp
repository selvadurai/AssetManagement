<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
     <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
    
       <title>Login Page</title>
      	<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

		<!-- Optional theme -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</head>
<body>

<div class="container">
<h2>Welcome to Selva Financial </h2>
 
 <br>

 <img src="images/office.jpg" class="img-thumbnail" alt="Cinque Terre" width="700" height="50">

<br>
<br>

<form class="form-horizontal" action="login" method="post" role="form">
 <div class="form-group">
      <label class="control-label col-sm-2" for="username">USERNAME </label>
       <div class="col-sm-4">
           <input type="text" class="form-control" name="username" id="username">
       </div>
  </div>   
    <div class="form-group">
          <label class="control-label col-sm-2" for="password">PASSWORD </label>
           <div class="col-sm-4">
                <input type="password" class="form-control" name="password" id="password" >
          </div>
     </div>
     <br>
  <div class="form-group">
       <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-default">Submit</button>
       </div>
  </div>
</form> 

<br>
<br>
<br>
 
<footer>
  <p>Property of Selva's Enterprise Software </p>
</footer>

</div>



</body>
</html>