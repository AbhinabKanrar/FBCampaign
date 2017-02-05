//$(document).ready(function() {
//    $.ajax({
//        url: "http://localhost:8090/ajax"
//    }).then(function(data) {
//      console.log(data);
//    });
//});

var access_token="EAAGPpGSsCToBAAsZABFxlRAZAMNNtym9pXbIY5MsolZClZBiPNSzTbVVgAwCBpfNtRdl46JFdOttnFtYWniJL1ZCp9nwsmCHzZCYo5utgxZAaT19f0ZAyGDjSp7wguxKF2FidwxRrYp5fZBdwbHTpOJiR5ePzroGP3UZAyrSB3RRL91QZDZD";


function getAdAccounts() {	
    var URL="https://graph.facebook.com/v2.8/me/adaccounts?access_token="+access_token+" ";
	var obj=null;
	return $.ajax({
		type : "GET",
		contentType : "application/text",
		url :URL,
		dataType : 'text',
		timeout : 10000000,
		success : function(data) {
			obj=JSON.parse(data.replace('undefined',''));
									
		},
		error : function(e) {
			console.log("ERROR: ", e);
		},
		done : function(e) {
			console.log("DONE");
		}	
			
	});
}

function getAccountInsights(accountId){
	var URL="https://graph.facebook.com/v2.8/"+accountId+"/insights?fields=account_id,account_name,spend,clicks,total_action_value,total_actions,inline_link_clicks&access_token="+access_token+" ";
	var obj=null;
	return $.ajax({
		type : "GET",
		contentType : "application/text",
		url : URL,
		dataType : 'text',
		timeout : 100000,
		success : function(data) {
			obj=JSON.parse(data.replace('undefined',''));
			console.log(obj)			
		},
		error : function(e) {
			console.log("ERROR: ", e);
		},
		done : function(e) {
			console.log("DONE");
		}		
	});
}


function getCampaigns(accountId){
	var URL="https://graph.facebook.com/v2.8/"+accountId+"/campaigns?fields=id,account_id,name,objective&access_token="+access_token+" ";
	return $.ajax({
		type : "GET",
		contentType : "application/text",
		url : URL,
		dataType : 'text',
		timeout : 100000,
		success : function(data) {
			obj=JSON.parse(data.replace('undefined',''));
			console.log(obj)			
		},
		error : function(e) {
			console.log("ERROR: ", e);
		},
		done : function(e) {
			console.log("DONE");
		}		
	});
  
}

function getCampaignsInsight(accountId){
var URL="https://graph.facebook.com/v2.8/"+accountId+"/campaigns?fields=insights{account_id,account_name,spend,clicks,total_action_value,call_to_action_clicks},name,id&access_token="+access_token+" ";
	return $.ajax({
		type : "GET",
		contentType : "application/text",
		url : URL,
		dataType : 'text',
		timeout : 100000,
		success : function(data) {
			console.log("Success:  " ,data)			
		},
		error : function(e) {
			console.log("ERROR: ", e);
		},
		done : function(e) {
			console.log("DONE");
		}		
	});
}
	
function getDynamicCampaignsInsight(array,accountId){
	var str1="";
	   for(var i in array){
	    	  var str2= array[i]+",";
	    	  str1=str1.concat(str2);	
	    	  console.log(str1);
	    }
	  str1 = str1.substring(0, str1.length-1);
	
		var URL="https://graph.facebook.com/v2.8/"+accountId+"/campaigns?fields=insights{"+str1+"}&access_token="+access_token+" ";
			return $.ajax({
				type : "GET",
				contentType : "application/text",
				url : URL,
				dataType : 'text',
				timeout : 100000,
				success : function(data) {
					console.log("Success:  " ,data)			
				},
				error : function(e) {
					console.log("ERROR: ", e);
				},
				done : function(e) {
					console.log("DONE");
				}		
			});
   
}

    