<?php
	require 'config.php';
	if(isset($_POST['username']) && isset($_POST['password'])){
		$username = trim($_POST['username']);
		
		$password = trim($_POST['password']);
		$query = "SELECT * FROM user_data WHERE username = '" . $username . "' AND password = '" . $password . "'";
					
		$result = mysqli_query($link, $query);
		
		if(mysqli_num_rows($result) > 0) {
			echo "Login successful !!";
		} else {
			echo "Login failed";
		}
	}
?>
