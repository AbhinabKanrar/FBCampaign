<#include "header.ftl">

<script>
var pageScopeCampaignId=${campaignId};
console.log(pageScopeCampaignId);
</script>
<div class="container">
	<div class="row well ">
		<div class="col-md-3  text-center">
			<h2>${campaignName}</h2>
		</div>
		<div class="col-md-1"></div>
		<div class="col-md-2   text-center">

			<button type="button" class="btn btn-primary">Setup</button>
		</div>
		<div class="col-md-2   text-center">
			<button type="button" class="btn btn-success">Download</button>
		</div>
		<div class="col-md-2   text-center">
			<button class="btn btn-default" data-toggle="modal" data-target="#example-modal-modal">Customize coloumn</button>
			<div class="modal fade" id="example-modal-modal">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">
								<span aria-hidden="true">×</span><span class="sr-only">Close</span>
							</button>
							<h4 class="modal-title">Bootstrap Multiselect</h4>
						</div>
						<div class="modal-body">
							<select id="example-modal" multiple="multiple">
								<optgroup label="PERFORMANCE">
									<option value="reach">Reach</option>
									<option value="relevance_score">RelevanceScope</option>
									<option value="spend">Spend</option>
									<option value="campaign_name">Campaign Name</option>
									<option value="clicks">clicks</option>
									<option value="objective">Objective</option>
									<option value="campaign_id">Campaign Id</option>
								</optgroup>
								<optgroup label="COST">
									<option value="">DUMMY</option>
									<option value="">Cost per 1,000 People
										Reached</option>
									<option value="">Cost per All
										Actions</option>
								</optgroup>
							</select>
						</div>
						
						 <div class="modal-footer">
						<button type="button" onclick="hello()" class="btn-success" data-dismiss="modal">
								Submit
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-2   text-center">
			<button type="button" class="btn btn-danger">Last 7 Days</button>
		</div>
	</div>	
	<!-- /Upper row -->
 <div class="container-fluid container-scroll">   
	<div id="dynamicCampaignInsight" class="row well text-center">			
			<div class="col-md-2 text-center">
				<p>Dynamic Columns Here</p>
			</div>			
	</div>
</div>
	<!-- /Lower row -->
	
	<div class="container well ">
		<div class="row text-center"><b>Graph Here</b></div>
	</div>


</div>


<script type="text/javascript">
    $(document).ready(function() {
        $('#example-modal').multiselect({ 
        numberDisplayed: 6
        });       
    });
</script>

<script type="text/javascript">

function hello() {
var array=[];
$('#example-modal option:selected').map(function(a, item){
array.push(item.value);
});
console.log(array);
loadDynamicCampaignsInsight(array,"${accountId}");
}
</script>
<script src="/js/campaign.js"></script>
<#include "footer.ftl">
