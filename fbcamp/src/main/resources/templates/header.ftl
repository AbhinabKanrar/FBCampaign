<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Fixed Top Navbar Example for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/css/navbar-fixed-top.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <link href="/css/custom.css" rel="stylesheet">
    
    
     <!-- Dynamic Select -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/css/bootstrap-multiselect.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/js/bootstrap-multiselect.js"></script>
    </head>

  <body>

    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#"><img src="https://www.clickfunnels.com/images/badge.png" class="logo img-responsive" width="235" ></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
         <ul class="nav navbar-nav navbar-right">
         
         
         	<li class="dropdown" onclick="loadAccounts()">
              <a href="#" class="dropdown-toggle nav-right-text" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Ad Accounts <span class="caret"></span></a>
              <ul class="dropdown-menu" id="accounts">              
                <li><a  href="#">temp</a></li>                            
              </ul>
            </li>
            
            <li class="nav-right-text"><a>Integration</a></li>          
            
            
            <li class="dropdown" >
              <a href="#" class="dropdown-toggle nav-right-text" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Campaign <span class="caret"></span></a>
              <ul id="campaignList" class="dropdown-menu ">
                
              </ul>
            </li>
             <li class="nav-right-text"><a >Help</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    
    
    
    
