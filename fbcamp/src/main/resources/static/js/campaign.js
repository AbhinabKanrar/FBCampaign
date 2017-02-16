function loadDynamicCampaignsInsight(array,accountId)
{   
	
	getDynamicCampaignsInsight(array,accountId).done(function(data) {
		var str1="";
		jQuery('#dynamicCampaignInsight').html('');
	    if (data) {
	          var temp=JSON.parse(data.replace('undefined',''));
	          	                                
	          $.each(temp.data, function(key,value) { 	        	          	  
		        	  if(!(value.insights==null)){
		        		  $.each(value.insights, function(key,value1) { 
		        			  if(value1[0]!=undefined)
		        		      {			        	 
		        			 if(pageScopeCampaignId==value.id){
		        		       for(var i in value1[0]){
		        		    	  var str2= '<div class="col-md-2   text-center"><p>'+i+'</p><span><img src="https://maxcdn.icons8.com/Color/PNG/24/Very_Basic/services-24.png" title="Services" width="48"></span><p>'+value1[0][i]+'</p></div>';
		        		    	  str1=str1.concat(str2);		        		    	  
		        		    	}		        		      
		        		       str1=str1.concat('<div class="col-md-2  text-center"> <a href="/adset/'+value.id+'/'+pageScopeCampaignName+'/'+pageScopeAccountId+'">View</a>	</div>');
		        		       str1=str1.concat('<div class="col-md-2  text-center">	<a href="">Over Expense</a>	</div>');
		        			}
		        		  }		        			  
			        	});
		        	  }
		        
	        	}); 
	          jQuery('#dynamicCampaignInsight').html(str1);	
	    } else {
	         console.log("Error loading campaignList");
	    }
	   })
	     .fail(function(x) {
	    	 console.log("Error getting campaignList deffered");
	    });

}