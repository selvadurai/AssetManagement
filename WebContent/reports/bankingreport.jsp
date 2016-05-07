<!DOCTYPE html>
<html>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
	<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

		<!-- Optional theme -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="../index.jsp">Home</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Reports<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="reports/bankingreport.jsp">Banking Transaction Report</a></li>
          <li><a href="#">Asset and Liability Report</a></li>
        </ul>
      </li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
    
  </div>
</nav>


<div class="container">
<div ng-app="myApp" ng-controller="banktransactions"> 
  
 <table>
 <tr>
  <td>Search:</td>
  <td><input type = "text" ng-model = "search"></td>     
  <td> &nbsp; Ascending Order </td>  
  <td>
  	 <select id="asc"  ng-model = "order">
      <option value="key">key</option>
      <option value="date">date</option>
       <option value="desc">description</option>
       <option value="moneySpent">money Spent</option>
        <option value="moneyEarned">money Earned</option>
        </select>
    </td>
      <td>&nbsp; Descending Order </td>
      <td>
        <select id="asc"  ng-model = "order">
      		<option value="-key">key</option>
     		 <option value="-date">date</option>
       		<option value="-desc">description</option>
       		<option value="-moneySpent">money Spent</option>
        	<option value="-moneyEarned">money Earned</option>
        </select>
     </td>
    </tr>
 </table>
  
  
  
  
  <table class="table table-hover" >
    <tr>
    <td>Id           </td>
    <td>Date         </td> 
    <td>Description  </td> 
    <td>MoneySpent   </td>
    <td>MoneyEarned  </td>
   </tr>
   
   
    <tr ng-repeat="x in myData | filter: search | orderBy: order" ng-show="loading">
  
   
    <td>{{x.key}}      </td>
    <td>{{x.date}}     </td>
    <td>{{x.desc}}      </td>   
    <td>{{x.moneySpent}}</td>
    <td>{{x.moneyEarned}}</td>
   </tr>
    
  </table>

     <button ng-click="loadData()">Refresh</button>
</div>

<script>

 	 var app = angular.module('myApp', []);
 	 app.controller('banktransactions', function($scope, $http) {
 		 $scope.loading = true;
  	 		$http.get("http://localhost:8080/SOA_HOUSE/rs/api/money").then(function (response) {
     		 	 $scope.myData = response.data;
    			 $scope.loadData();
    			 $scope.loading = false;
     		 });	
	});
  
</script>


<footer>
<p> Propert of Selva Enterprise</p>
</footer>
</div>
</body>
</html>
