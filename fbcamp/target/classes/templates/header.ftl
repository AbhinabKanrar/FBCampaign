<#--Get All adAccounts--> 
<#--Get All adInsights Respective of adAccount-->
<script src="js/jquery.js"></script>
<script>

console.log(" Users adAccounts");

var allAdAccounts=[<#list model["adAccount"] as adAccount>${adAccount.mAccountId},</#list>];

var arrayLength =  allAdAccounts.length;

for (var i = 0; i < arrayLength; i++) {
    console.log(allAdAccounts[i]);
}

function Insight(accountId, accountName) {
  this.accountId = accountId;
  this.accountName = accountName;
 }
 
 function Campaigns(accountId,name,id) {
  this.accountId = accountId;
  this.name = name;
  this.id=id;
 }
 function CampaignInsight(accountId, accountName) {
  this.accountId = accountId;
  this.accountName = accountName;
 }

var allAdInsights = [];
<#list model["accountInsights"] as adAccount>
<#if adAccount??>
   var temp=new Insight(${adAccount.mAccountId},'${adAccount.mAccountName}');
   allAdInsights.push(temp);
</#if> 
</#list>

var campaigns=[];
<#list model["campaigns"] as campaign>
<#if campaign??>
    var temp=new Campaigns(${campaign.mAccountId},'${campaign.mName?js_string}',${campaign.mId});
    campaigns.push(temp);
</#if> 
</#list>

var campaignInsight=[];
<#list model["campaignInsight"] as campaignInsight>
<#if campaignInsight??>
    var temp=new CampaignInsight(${campaignInsight.mAccountId},'${campaignInsight.mAccountName}');
    campaignInsight.push(temp);
</#if> 
</#list>
console.log(campaigns);
console.log(campaignInsight);
</script>


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
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/navbar-fixed-top.css" rel="stylesheet">

    <link href="css/custom.css" rel="stylesheet">
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
          <a class="navbar-brand" href="#"><img src="https://images.clickfunnels.com/uploads/digital_asset/file/176632/clickfunnels-dark-logo.svg" class="logo img-responsive" width="235" ></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
         <ul class="nav navbar-nav navbar-right">
         
         
         	<li class="dropdown">
              <a href="#" class="dropdown-toggle nav-right-text" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Ad Accounts <span class="caret"></span></a>
              <ul class="dropdown-menu">
              <#list model["adAccount"] as adAccount>
                <li><a class="${adAccount.mAccountId}" href="#">${adAccount.mAccountId}</a></li>
              </#list>                 
              </ul>
            </li>
            
            <li class="nav-right-text"><a>Integration</a></li>
            
            
            
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle nav-right-text" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Campaign <span class="caret"></span></a>
              <ul id="campaignList" class="dropdown-menu ">
                
              </ul>
            </li>
             <li><a  class="nav-right-text">Help</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    
    
    
    
<script>


var selectedAccount;
<#list model["adAccount"] as adAccount>
$('.${adAccount.mAccountId}').on('click', function() {
 selectedAccount=${adAccount.mAccountId};
 populateCampaignDropDown();
 populateAccountInsight();
});               
 
</#list> 


function populateCampaignDropDown(){
    $('#campaignList').html('');
<#list model["campaigns"] as campaign>
<#if campaign??>
   if(selectedAccount==${campaign.mAccountId}){
      $('#campaignList').append("<li><a href='#'>"+'${campaign.mName?js_string}'+"</a></li>");
    }
</#if> 
</#list>
} 

function populateAccountInsight(){
             $('#amountSpend').html('');
              $('#clicks').html('');
               $('#conversions').html('');
               $('#amountEarned').html('');
               $('#roi').html('');               
     // Check for this part           
	 <#list model["accountInsights"] as accountInsight>
	     <#if accountInsight??>
	       console.log(1);
            if(selectedAccount==${accountInsight.mAccountId}){
              $('#amountSpend').append(${accountInsight.mAccountId});
              $('#clicks').append(${accountInsight.mAccountId});
               $('#conversions').append(${accountInsight.mAccountId});
               $('#amountEarned').append(${accountInsight.mAccountId});
               $('#roi').append(${accountInsight.mAccountId});
               }
                         
         <#else>  
              console.log(2);
              $('#amountSpend').append("N/A");
              $('#clicks').append("N/A");
               $('#conversions').append("N/A");
               $('#amountEarned').append("N/A");
               $('#roi').append("N/A");
          </#if>       
               
               <#assign num = 1>
               ${num}
               
        </#list>
} 




</script>
