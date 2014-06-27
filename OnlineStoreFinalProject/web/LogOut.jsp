<%-- 
    Document   : LogOut
    Created on : Jun 19, 2014, 7:41:39 PM
    Author     : Marc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
  <title>Olympic Store</title>
  <link rel="stylesheet" type="text/css" href="olympic.css"/>
  
  <script type="text/javascript" src="utils.js"> </script>
</head> 

<body>

<script type="text/javascript">
	header();
</script>
        <h1>You Have Successfully Logged Out</h1>
        <% session.invalidate();
        %>
    <script type="text/javascript">
	footer();
</script>
  
</body>
</html>