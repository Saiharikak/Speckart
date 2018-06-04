<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="rest/myresource/registrationform" method="post">
	 <div class="form-group">
      <label for="name">Name:</label>
      <input type="name" class="form-control" id="name" placeholder="Enter name" name="name"ngModel/>
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email"ngModel/>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password"ngModel/>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Re-Enter password" name="password"ngModel/>
    </div>
    <div class="form-group">
      <label for="phoneno">Phone No:</label>
      <input type="phoneno" class="form-control" id="phoneno" placeholder="phone no" name="phoneno"ngModel/>
    </div>
    <button type="submit"class="btn btn-primary">Submit</button>
	</form>
	<br/>
</body>
</html>

</form>
