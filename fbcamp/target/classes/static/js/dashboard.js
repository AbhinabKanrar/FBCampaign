function loadAccounts()
    {
    getAdAccounts().done(function(data) {
    if (data) {
          var temp=JSON.parse(data.replace('undefined',''));
          jQuery('#accounts').html('');
           $.each(temp.data, function(key,value) {        	  
        	  jQuery('#accounts').append('<li id="'+value.id+'" onclick="loadAllDashBoardData(this)"><a>'+value.id+'</a></li>');
        	}); 
    } else {
         console.log("Error getting account");
    }
   })
     .fail(function(x) {
    	 console.log("Error getting account deffered");
    });
}


function loadCampaignDropDown(accountId)
{
	getCampaigns(accountId).done(function(data) {
	    if (data) {
	          var temp=JSON.parse(data.replace('undefined',''));
	          jQuery('#campaignList').html('');
	          console.log(temp);
	           $.each(temp.data, function(key,value) {        	  
	        	  jQuery('#campaignList').append('<li id="'+value.id+'" onclick=""><a>'+value.name+'</a></li>');
	        	}); 
	    } else {
	         console.log("Error loading campaignList");
	    }
	   })
	     .fail(function(x) {
	    	 console.log("Error getting campaignList deffered");
	    });

}

function loadAccountInsight(accountId)
{
	getAccountInsights(accountId).done(function(data) {
	    if (data) {
	          var temp=JSON.parse(data.replace('undefined',''));
	          var source   = $("#account-insight-template").html();
	          var template = Handlebars.compile(source);  	          
	          if(!(temp.data.length==0))
	          {
	        	  var context = {adAmountSpend: temp.data[0].spend, adClicks: temp.data[0].clicks ,adConversions:" TBD ",adAmountEarned:" TBD ",adRoi:"TBD "};		          	          
	          }
	          else
	          {  var context = {adAmountSpend: "N/A", adClicks: "N/A" ,adConversions:" N/A ",adAmountEarned:" N/A ",adRoi:"N/A "};	             
	        	 }
	          var accountInsighthtml    = template(context);		         
         	  jQuery('#accountInsight').html(accountInsighthtml);	
	    } else {
	         console.log("Error loading campaignList");
	    }
	   })
	     .fail(function(x) {
	    	 console.log("Error getting campaignList deffered");
	    });

}

function loadCampaignsInsight(accountId)
{
	getCampaignsInsight(accountId).done(function(data) {
		jQuery('#campaignInsightList').html('');
	    if (data) {
	          var temp=JSON.parse(data.replace('undefined',''));
	          var source   = $("#campaign-insight-template").html();
	          console.log(source);
	          var template = Handlebars.compile(source);  
	                                
	          $.each(temp.data, function(key,value) { 	        	          	  
		        	  if(!(value.insights==null)){
		        		  $.each(value.insights, function(key,value1) { 
		        			  if(value1[0]!=undefined)
		        		      {					        			 
		        		      console.log(value1[0].account_id);
		        		      var context = {campaignAmountSpent: value1[0].spend , campaignClicks: value1[0].clicks , campaignConversion:" N/A ", campaignAmountEarned:" N/A ", campaignROI:"N/A" ,campaignId:value.id, accountId:'act_'+value1[0].account_id ,campaignName:value.name};
				        	  console.log(context);
				        	  var campaignInsighthtml = template(context);	
				        	  //console.log(campaignInsighthtml);
				         	  jQuery('#campaignInsightList').append(campaignInsighthtml);		        		      
		        		      }		        			  
			        	});
		        	  }
		        
	        	}); 
	          
	    } else {
	         console.log("Error loading campaignList");    }
	   })
	     .fail(function(x) {
	    	 console.log("Error getting campaignList deffered");
	    });

}



function loadAllDashBoardData(account)
{
	accountId=$(account).attr("id");
	loadCampaignDropDown(accountId);
	loadAccountInsight(accountId);
	loadCampaignsInsight(accountId); 
}