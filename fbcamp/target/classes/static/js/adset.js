
function loadDynamicAdsetInsight(campaignId)
{   
	
	getAdSetInsights(campaignId).done(function(data) {
	    if (data) {
	          var temp=JSON.parse(data.replace('undefined',''));
	          
	          //Fetch data in order to format the content.
	          var date={};
	          $.each(temp.data, function(key,value) {        	      
	        	  date[value.date_start] = true;	        	  
	        	}); 
	          console.log(date);
	          
	          var adset_name = {};
	          $.each(temp.data, function(key,value) {        	      
	        	  adset_name[value.adset_name] = true;	        	  
	        	}); 
	           
	          console.log(adset_name);     
	          var variable={};
	         
	          $.each(adset_name, function(key_name,value_name) {  
	        	   variable[key_name] = new Array();
	        	  $.each(temp.data, function(key_data,value_data) {	     
	        		   if(key_name==value_data.adset_name){
		        		  variable[key_name].push(value_data.clicks);		        		  
		        	  } 		
		        	  
		        	});	
	        	         	  
	        	});
	          console.log(variable);
	          
	          var data_1='<table class="table table-sm"><thead>';
	          var data_2='';
	          
         	 
	          
	          
	          
	          
	          
	          
	    } else {
	         console.log("Error getting account");
	    }
	   })
	   
	     .fail(function(x) {
	    	 console.log("Error getting account deffered");
	    });
	
	
	
}