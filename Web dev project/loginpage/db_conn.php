<?php

    $sname  = "localhost";
    $unmae  = "root";
    $password = "";

    $db_name = "test_db";

    $conn = mysqli_connect($sname, $unmae, $password);

    if(!$conn){
        echo "Connection Failed";
    }

