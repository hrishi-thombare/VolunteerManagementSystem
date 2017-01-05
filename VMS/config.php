<?php
	$db_name = "vms_db";
	$server = "localhost";
	$user = "root";
	$password = "Inn0vate";
	$link = mysqli_connect($server, $user, $password, $db_name);

	if (!$link) {
	    die('Could not connect: ' . mysql_error());
	}
	
	echo 'Connected successfully!!';
	mysqli_close($link);
?>
