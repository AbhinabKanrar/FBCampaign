<#include "header.ftl">
 <div class="container">
        <div class="row well ">
                 <div class="col-md-4   text-center">
                     <h2>${campaignName}</h2>                    
                  </div> 
                 <div class="col-md-2">                    
                 </div> 
                 <div class="col-md-2   text-center">
                   	<button type="button" class="btn btn-primary">Conversion</button>
                 </div> 
                <div class="col-md-2   text-center">
                    <button type="button" class="btn btn-primary">Last 7 days</button>
               </div> 
                 <div class="col-md-2   text-center">
                    <button type="button" class="btn btn-primary">Set Conversion value</button>
                  </div>                
       </div>  
       <!-- /Upper row -->
          
        <div  class="row well ">
        	<div id="adsetInsightsTable">
        	</div>   
        </div>
    
   
 </div> 
    <!-- /container -->

<#include "footer.ftl">
<#include "adset-template.ftl">
<script type="text/javascript">
    $(document).ready(function() {
        loadDynamicAdsetInsight('23842553206960757');      
    });
</script>
