<?php
session_start();
include "db_conn.php";

if(isset($_POST['uname']) && isset($_POST['password'])){
    function validate($data){
        $data =trim($data);
        $data =stripslashes($data);
        $data =htmlspecialchars($data);
        return $data;
    }
}

$uname =validate($_POST['uname']);
$pass =validate($_POST['password']);

if(empty($uname)){
    header ("Location: index.php?erro=User Name is required");
    exit();
}

else if(empty($pass)){
    header("Location: index.php?error=Password is required"); 
    exit();
}

$sql ="SELECT * FROM users WHERE user_name='$uname' AND password='$pass' ";
$result= mysqli_query($conn,$sql);