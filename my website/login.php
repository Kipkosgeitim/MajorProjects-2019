<?php 
$conn=mysqli_connect("localhost","root","","tester") or die("fail to connect");

$username=$_POST["username"];
$password=$_POST["password"];
$submit=$_POST["submit"];

$sql="INSERT INTO `testing`(`username`, `password`) VALUES ('$username','$password')";
$sql_con=mysqli_query($conn,$sql);
 ?>
