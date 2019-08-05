<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StockMarket</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1 class="text-primary text-center">Registrations Page</h1>

<form:errors path="user.*" />

<div class="container">

<form action="register" method="POST">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="fname">First Name</label>
      <input type="text" class="form-control" id="fname" name="fname" placeholder="First Name">
    </div>
    <div class="form-group col-md-6">
      <label for="lname">Last name</label>
      <input type="text" class="form-control" id="lname" name="lname" placeholder="Last Name">
    </div>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="email">Email</label>
      <input type="text" class="form-control" id="email" name="email" placeholder="Email">
    </div>
    <div class="form-group col-md-6">
      <label for="password">Password</label>
      <input type="password" class="form-control" id="password" name="password" placeholder="Password">
    </div>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="age">Age</label>
      <input type="number" value="0" class="form-control" id="age" name="age" placeholder="Age">
    </div>
    <div class="form-group col-md-6">
      <label for="gender">Gender</label>
      <select id="gender" class="form-control" name="gender">
        <option selected>Choose...</option>
        <option>Male</option>
        <option>Female</option>
      </select>

    </div>
  </div>
  <div class="form-group">
    <label for="address">Address</label>
    <input type="text" class="form-control" id="address" name="address" placeholder="1234 Main St">
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="city">City</label>
      <input type="text" class="form-control" id="city" name="city">
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control" name="state">
        <option selected>Choose...</option>
        <option>Delhi</option>
        <option>UP</option>
        <option>Maharashtra</option>
        <option>Punjab</option>
        <option>Chennai</option>
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="zip">Zip</label>
      <input type="text" class="form-control" id="zip" name="zip">
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Create User</button>
</form>
</div>
</body>
</html>