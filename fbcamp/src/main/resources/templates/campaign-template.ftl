<script id="campaignPage-name-template" type="text/x-handlebars-template">
  <div class="row well ">
                 <div class="col-md-3  text-center">
                     <h2>Campaign Name</h2>                    
                  </div> 
               <div class="col-md-1"></div>
                 <div class="col-md-2   text-center">
                     <p>Setup</p>
                 </div> 
                <div class="col-md-2   text-center">
                    <p>Download</p>
               </div> 
                 <div class="col-md-2   text-center">
                     <p>Customize coloumn</p>                     
                  </div> 
                <div class="col-md-2   text-center">
                    <p>Last 7 days</p>
              </div> 
   </div>   
</script>


<script id="dynamic-campaign-insight-template" type="text/x-handlebars-template">
		        <div class="col-md-1   text-center">
                     <p>Campaign Icon</p>
                     <span class="glyphicon glyphicon-usd" aria-hidden="true"></span>
                     <p> :)</p>
                </div> 
       		   <div class="col-md-2   text-center">
                     <p>Amount Spent</p>
                     <span><img src="https://maxcdn.icons8.com/Color/PNG/48/Finance/USD-48.png" title="US Dollar" width="48"></span>
                     <p id="campaignAmountSpent">{{campaignAmountSpent}}</p>
               </div> 
               <div class="col-md-2   text-center">
                    <p>Clicks</p>
                     <span><img src="https://maxcdn.icons8.com/office/PNG/60/Computer_Hardware/generic_mouse-60.png" title="Generic Mouse" width="48"></span>
                     <p id="campaignClicks">{{campaignClicks}}</p>
               </div> 
                <div class="col-md-2   text-center">
                     <p>Conversions</p>
                     <span><img src="https://maxcdn.icons8.com/office/PNG/60/User_Interface/task-60.png" title="Tasks" width="48"></span>
                     <p id="campaignConversion">{{campaignConversion}}</p>
               </div> 
                <div class="col-md-2   text-center">
                    <p>Amount Earned</p>
                     <span><img src="https://maxcdn.icons8.com/office/PNG/60/User_Interface/idea_bank-60.png" title="Idea Bank" width="48"></span>
                     <p id="campaignAmountEarned">{{campaignAmountEarned}}</p>
                </div> 
                 <div class="col-md-2   text-center">                     
                     <p>ROI</p>
                     <span><img src="https://maxcdn.icons8.com/office/PNG/60/Messaging/filled_star-60.png" title="Star Filled" width="38"></span>
					 <p id="campaignROI">{{campaignROI}}</p>
                 </div> 
                <div class="col-md-1   text-center">
                 <a href="/campaign/{{campaignId}}"> <div class="btn-info view-button"> View</div></a>
                  </div>
            </div>
</script>