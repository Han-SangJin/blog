<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
    .row.content {height: 1500px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height: auto;} 
    }
    label{
    	width : 100px;
    }
    
  </style>
</head>
<body>

<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav">
      <h4>블로그</h4>
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#section1">Home</a></li>
        <li><a href="#section2">중고도서거래(서비스준비중)</a></li>
        <li><a href="#section3">블로그 목록</a></li>
        <li><a href="#section3">내 블로그</a></li>
      </ul><br>
  
    </div>
 
    <div class="col-sm-9">
      <h4><small>blog</small></h4>
      <hr>
      <h2>I Love Login</h2>
     	<label>ID :</label>   <input type="text"> <br>
      	<label>PASS :</label> <input type="text"> <br>
      
      	<br><br><br><br>
      	<input type="button" class="btn btn-success" value="로그인">
      	<input type="button" class="btn btn-success" value="회원가입"><br><br><br><br><br><br><br>
      	 
      	<br><br><br><br><br><br><br>
      <h4><small>2020.10.21</small></h4>
     
     
      
      <hr>
        <input type="button" class="btn btn-success" value="관리자 로그인">
    </div>
  </div>
</div>

<footer class="container-fluid">
  <p>Footer Text</p>
</footer>

</body>
</html>
