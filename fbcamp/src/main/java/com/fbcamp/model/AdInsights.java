package com.fbcamp.model;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class AdInsights implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SerializedName("account_id")
	private String mAccountId;
	@SerializedName("account_name")
	private String mAccountName;
	@SerializedName("ad_id")
	private String mAdId;
	@SerializedName("ad_name")
	private String mAdName;
	@SerializedName("adset_id")
	private String mAdsetId;
	@SerializedName("adset_name")
	private String mAdsetName;
	@SerializedName("app_store_clicks")
	private String mAppStoreClicks;
	@SerializedName("buying_type")
	private String mBuyingType;
	@SerializedName("call_to_action_clicks")
	private String mCallToActionClicks;
	@SerializedName("campaign_id")
	private String mCampaignId;
	@SerializedName("campaign_name")
	private String mCampaignName;
	@SerializedName("canvas_avg_view_percent")
	private String mCanvasAvgViewPercent;
	@SerializedName("canvas_avg_view_time")
	private String mCanvasAvgViewTime;
	@SerializedName("clicks")
	private String mClicks;
	@SerializedName("cost_per_estimated_ad_recallers")
	private String mCostPerEstimatedAdRecallers;
	@SerializedName("cost_per_inline_link_click")
	private String mCostPerInlineLinkClick;
	@SerializedName("cost_per_inline_post_engagement")
	private String mCostPerInlinePostEngagement;
	@SerializedName("cost_per_total_action")
	private String mCostPerTotalAction;
	@SerializedName("cost_per_unique_click")
	private String mCostPerUniqueClick;
	@SerializedName("cost_per_unique_inline_link_click")
	private String mCostPerUniqueInlineLinkClick;
	@SerializedName("cpc")
	private String mCpc;
	@SerializedName("cpm")
	private String mCpm;
	@SerializedName("cpp")
	private String mCpp;
	@SerializedName("ctr")
	private String mCtr;
	@SerializedName("date_start")
	private String mDateStart;
	@SerializedName("date_stop")
	private String mDateStop;
	@SerializedName("deeplink_clicks")
	private String mDeeplinkClicks;
	@SerializedName("estimated_ad_recall_rate")
	private String mEstimatedAdRecallRate;
	@SerializedName("estimated_ad_recallers")
	private String mEstimatedAdRecallers;
	@SerializedName("frequency")
	private String mFrequency;
	@SerializedName("impressions")
	private String mImpressions;
	@SerializedName("inline_link_click_ctr")
	private String mInlineLinkClickCtr;
	@SerializedName("inline_link_clicks")
	private String mInlineLinkClicks;
	@SerializedName("inline_post_engagement")
	private String mInlinePostEngagement;
	@SerializedName("newsfeed_avg_position")
	private String mNewsfeedAvgPosition;
	@SerializedName("newsfeed_clicks")
	private String mNewsfeedClicks;
	@SerializedName("newsfeed_impressions")
	private String mNewsfeedImpressions;
	@SerializedName("objective")
	private String mObjective;
	@SerializedName("place_page_name")
	private String mPlacePageName;
	@SerializedName("reach")
	private String mReach;
	@SerializedName("social_clicks")
	private String mSocialClicks;
	@SerializedName("social_impressions")
	private String mSocialImpressions;
	@SerializedName("social_reach")
	private String mSocialReach;
	@SerializedName("social_spend")
	private String mSocialSpend;
	@SerializedName("spend")
	private String mSpend;
	@SerializedName("total_action_value")
	private String mTotalActionValue;
	@SerializedName("total_actions")
	private String mTotalActions;
	@SerializedName("total_unique_actions")
	private String mTotalUniqueActions;
	@SerializedName("unique_clicks")
	private String mUniqueClicks;
	@SerializedName("unique_ctr")
	private String mUniqueCtr;
	@SerializedName("unique_impressions")
	private String mUniqueImpressions;
	@SerializedName("unique_inline_link_click_ctr")
	private String mUniqueInlineLinkClickCtr;
	@SerializedName("unique_inline_link_clicks")
	private String mUniqueInlineLinkClicks;
	@SerializedName("unique_link_clicks_ctr")
	private String mUniqueLinkClicksCtr;
	@SerializedName("unique_social_clicks")
	private String mUniqueSocialClicks;
	@SerializedName("unique_social_impressions")
	private String mUniqueSocialImpressions;
	@SerializedName("website_clicks")
	private String mWebsiteClicks;

	public AdInsights() {
		super();
	}

	public String getmAccountId() {
		return mAccountId;
	}

	public void setmAccountId(String mAccountId) {
		this.mAccountId = mAccountId;
	}

	public String getmAccountName() {
		return mAccountName;
	}

	public void setmAccountName(String mAccountName) {
		this.mAccountName = mAccountName;
	}

	public String getmAdId() {
		return mAdId;
	}

	public void setmAdId(String mAdId) {
		this.mAdId = mAdId;
	}

	public String getmAdName() {
		return mAdName;
	}

	public void setmAdName(String mAdName) {
		this.mAdName = mAdName;
	}

	public String getmAdsetId() {
		return mAdsetId;
	}

	public void setmAdsetId(String mAdsetId) {
		this.mAdsetId = mAdsetId;
	}

	public String getmAdsetName() {
		return mAdsetName;
	}

	public void setmAdsetName(String mAdsetName) {
		this.mAdsetName = mAdsetName;
	}

	public String getmAppStoreClicks() {
		return mAppStoreClicks;
	}

	public void setmAppStoreClicks(String mAppStoreClicks) {
		this.mAppStoreClicks = mAppStoreClicks;
	}

	public String getmBuyingType() {
		return mBuyingType;
	}

	public void setmBuyingType(String mBuyingType) {
		this.mBuyingType = mBuyingType;
	}

	public String getmCallToActionClicks() {
		return mCallToActionClicks;
	}

	public void setmCallToActionClicks(String mCallToActionClicks) {
		this.mCallToActionClicks = mCallToActionClicks;
	}

	public String getmCampaignId() {
		return mCampaignId;
	}

	public void setmCampaignId(String mCampaignId) {
		this.mCampaignId = mCampaignId;
	}

	public String getmCampaignName() {
		return mCampaignName;
	}

	public void setmCampaignName(String mCampaignName) {
		this.mCampaignName = mCampaignName;
	}

	public String getmCanvasAvgViewPercent() {
		return mCanvasAvgViewPercent;
	}

	public void setmCanvasAvgViewPercent(String mCanvasAvgViewPercent) {
		this.mCanvasAvgViewPercent = mCanvasAvgViewPercent;
	}

	public String getmCanvasAvgViewTime() {
		return mCanvasAvgViewTime;
	}

	public void setmCanvasAvgViewTime(String mCanvasAvgViewTime) {
		this.mCanvasAvgViewTime = mCanvasAvgViewTime;
	}

	public String getmClicks() {
		return mClicks;
	}

	public void setmClicks(String mClicks) {
		this.mClicks = mClicks;
	}

	public String getmCostPerEstimatedAdRecallers() {
		return mCostPerEstimatedAdRecallers;
	}

	public void setmCostPerEstimatedAdRecallers(String mCostPerEstimatedAdRecallers) {
		this.mCostPerEstimatedAdRecallers = mCostPerEstimatedAdRecallers;
	}

	public String getmCostPerInlineLinkClick() {
		return mCostPerInlineLinkClick;
	}

	public void setmCostPerInlineLinkClick(String mCostPerInlineLinkClick) {
		this.mCostPerInlineLinkClick = mCostPerInlineLinkClick;
	}

	public String getmCostPerInlinePostEngagement() {
		return mCostPerInlinePostEngagement;
	}

	public void setmCostPerInlinePostEngagement(String mCostPerInlinePostEngagement) {
		this.mCostPerInlinePostEngagement = mCostPerInlinePostEngagement;
	}

	public String getmCostPerTotalAction() {
		return mCostPerTotalAction;
	}

	public void setmCostPerTotalAction(String mCostPerTotalAction) {
		this.mCostPerTotalAction = mCostPerTotalAction;
	}

	public String getmCostPerUniqueClick() {
		return mCostPerUniqueClick;
	}

	public void setmCostPerUniqueClick(String mCostPerUniqueClick) {
		this.mCostPerUniqueClick = mCostPerUniqueClick;
	}

	public String getmCostPerUniqueInlineLinkClick() {
		return mCostPerUniqueInlineLinkClick;
	}

	public void setmCostPerUniqueInlineLinkClick(String mCostPerUniqueInlineLinkClick) {
		this.mCostPerUniqueInlineLinkClick = mCostPerUniqueInlineLinkClick;
	}

	public String getmCpc() {
		return mCpc;
	}

	public void setmCpc(String mCpc) {
		this.mCpc = mCpc;
	}

	public String getmCpm() {
		return mCpm;
	}

	public void setmCpm(String mCpm) {
		this.mCpm = mCpm;
	}

	public String getmCpp() {
		return mCpp;
	}

	public void setmCpp(String mCpp) {
		this.mCpp = mCpp;
	}

	public String getmCtr() {
		return mCtr;
	}

	public void setmCtr(String mCtr) {
		this.mCtr = mCtr;
	}

	public String getmDateStart() {
		return mDateStart;
	}

	public void setmDateStart(String mDateStart) {
		this.mDateStart = mDateStart;
	}

	public String getmDateStop() {
		return mDateStop;
	}

	public void setmDateStop(String mDateStop) {
		this.mDateStop = mDateStop;
	}

	public String getmDeeplinkClicks() {
		return mDeeplinkClicks;
	}

	public void setmDeeplinkClicks(String mDeeplinkClicks) {
		this.mDeeplinkClicks = mDeeplinkClicks;
	}

	public String getmEstimatedAdRecallRate() {
		return mEstimatedAdRecallRate;
	}

	public void setmEstimatedAdRecallRate(String mEstimatedAdRecallRate) {
		this.mEstimatedAdRecallRate = mEstimatedAdRecallRate;
	}

	public String getmEstimatedAdRecallers() {
		return mEstimatedAdRecallers;
	}

	public void setmEstimatedAdRecallers(String mEstimatedAdRecallers) {
		this.mEstimatedAdRecallers = mEstimatedAdRecallers;
	}

	public String getmFrequency() {
		return mFrequency;
	}

	public void setmFrequency(String mFrequency) {
		this.mFrequency = mFrequency;
	}

	public String getmImpressions() {
		return mImpressions;
	}

	public void setmImpressions(String mImpressions) {
		this.mImpressions = mImpressions;
	}

	public String getmInlineLinkClickCtr() {
		return mInlineLinkClickCtr;
	}

	public void setmInlineLinkClickCtr(String mInlineLinkClickCtr) {
		this.mInlineLinkClickCtr = mInlineLinkClickCtr;
	}

	public String getmInlineLinkClicks() {
		return mInlineLinkClicks;
	}

	public void setmInlineLinkClicks(String mInlineLinkClicks) {
		this.mInlineLinkClicks = mInlineLinkClicks;
	}

	public String getmInlinePostEngagement() {
		return mInlinePostEngagement;
	}

	public void setmInlinePostEngagement(String mInlinePostEngagement) {
		this.mInlinePostEngagement = mInlinePostEngagement;
	}

	public String getmNewsfeedAvgPosition() {
		return mNewsfeedAvgPosition;
	}

	public void setmNewsfeedAvgPosition(String mNewsfeedAvgPosition) {
		this.mNewsfeedAvgPosition = mNewsfeedAvgPosition;
	}

	public String getmNewsfeedClicks() {
		return mNewsfeedClicks;
	}

	public void setmNewsfeedClicks(String mNewsfeedClicks) {
		this.mNewsfeedClicks = mNewsfeedClicks;
	}

	public String getmNewsfeedImpressions() {
		return mNewsfeedImpressions;
	}

	public void setmNewsfeedImpressions(String mNewsfeedImpressions) {
		this.mNewsfeedImpressions = mNewsfeedImpressions;
	}

	public String getmObjective() {
		return mObjective;
	}

	public void setmObjective(String mObjective) {
		this.mObjective = mObjective;
	}

	public String getmPlacePageName() {
		return mPlacePageName;
	}

	public void setmPlacePageName(String mPlacePageName) {
		this.mPlacePageName = mPlacePageName;
	}

	public String getmReach() {
		return mReach;
	}

	public void setmReach(String mReach) {
		this.mReach = mReach;
	}

	public String getmSocialClicks() {
		return mSocialClicks;
	}

	public void setmSocialClicks(String mSocialClicks) {
		this.mSocialClicks = mSocialClicks;
	}

	public String getmSocialImpressions() {
		return mSocialImpressions;
	}

	public void setmSocialImpressions(String mSocialImpressions) {
		this.mSocialImpressions = mSocialImpressions;
	}

	public String getmSocialReach() {
		return mSocialReach;
	}

	public void setmSocialReach(String mSocialReach) {
		this.mSocialReach = mSocialReach;
	}

	public String getmSocialSpend() {
		return mSocialSpend;
	}

	public void setmSocialSpend(String mSocialSpend) {
		this.mSocialSpend = mSocialSpend;
	}

	public String getmSpend() {
		return mSpend;
	}

	public void setmSpend(String mSpend) {
		this.mSpend = mSpend;
	}

	public String getmTotalActionValue() {
		return mTotalActionValue;
	}

	public void setmTotalActionValue(String mTotalActionValue) {
		this.mTotalActionValue = mTotalActionValue;
	}

	public String getmTotalActions() {
		return mTotalActions;
	}

	public void setmTotalActions(String mTotalActions) {
		this.mTotalActions = mTotalActions;
	}

	public String getmTotalUniqueActions() {
		return mTotalUniqueActions;
	}

	public void setmTotalUniqueActions(String mTotalUniqueActions) {
		this.mTotalUniqueActions = mTotalUniqueActions;
	}

	public String getmUniqueClicks() {
		return mUniqueClicks;
	}

	public void setmUniqueClicks(String mUniqueClicks) {
		this.mUniqueClicks = mUniqueClicks;
	}

	public String getmUniqueCtr() {
		return mUniqueCtr;
	}

	public void setmUniqueCtr(String mUniqueCtr) {
		this.mUniqueCtr = mUniqueCtr;
	}

	public String getmUniqueImpressions() {
		return mUniqueImpressions;
	}

	public void setmUniqueImpressions(String mUniqueImpressions) {
		this.mUniqueImpressions = mUniqueImpressions;
	}

	public String getmUniqueInlineLinkClickCtr() {
		return mUniqueInlineLinkClickCtr;
	}

	public void setmUniqueInlineLinkClickCtr(String mUniqueInlineLinkClickCtr) {
		this.mUniqueInlineLinkClickCtr = mUniqueInlineLinkClickCtr;
	}

	public String getmUniqueInlineLinkClicks() {
		return mUniqueInlineLinkClicks;
	}

	public void setmUniqueInlineLinkClicks(String mUniqueInlineLinkClicks) {
		this.mUniqueInlineLinkClicks = mUniqueInlineLinkClicks;
	}

	public String getmUniqueLinkClicksCtr() {
		return mUniqueLinkClicksCtr;
	}

	public void setmUniqueLinkClicksCtr(String mUniqueLinkClicksCtr) {
		this.mUniqueLinkClicksCtr = mUniqueLinkClicksCtr;
	}

	public String getmUniqueSocialClicks() {
		return mUniqueSocialClicks;
	}

	public void setmUniqueSocialClicks(String mUniqueSocialClicks) {
		this.mUniqueSocialClicks = mUniqueSocialClicks;
	}

	public String getmUniqueSocialImpressions() {
		return mUniqueSocialImpressions;
	}

	public void setmUniqueSocialImpressions(String mUniqueSocialImpressions) {
		this.mUniqueSocialImpressions = mUniqueSocialImpressions;
	}

	public String getmWebsiteClicks() {
		return mWebsiteClicks;
	}

	public void setmWebsiteClicks(String mWebsiteClicks) {
		this.mWebsiteClicks = mWebsiteClicks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mAccountId == null) ? 0 : mAccountId.hashCode());
		result = prime * result + ((mAccountName == null) ? 0 : mAccountName.hashCode());
		result = prime * result + ((mAdId == null) ? 0 : mAdId.hashCode());
		result = prime * result + ((mAdName == null) ? 0 : mAdName.hashCode());
		result = prime * result + ((mAdsetId == null) ? 0 : mAdsetId.hashCode());
		result = prime * result + ((mAdsetName == null) ? 0 : mAdsetName.hashCode());
		result = prime * result + ((mCampaignId == null) ? 0 : mCampaignId.hashCode());
		result = prime * result + ((mCampaignName == null) ? 0 : mCampaignName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdInsights other = (AdInsights) obj;
		if (mAccountId == null) {
			if (other.mAccountId != null)
				return false;
		} else if (!mAccountId.equals(other.mAccountId))
			return false;
		if (mAccountName == null) {
			if (other.mAccountName != null)
				return false;
		} else if (!mAccountName.equals(other.mAccountName))
			return false;
		if (mAdId == null) {
			if (other.mAdId != null)
				return false;
		} else if (!mAdId.equals(other.mAdId))
			return false;
		if (mAdName == null) {
			if (other.mAdName != null)
				return false;
		} else if (!mAdName.equals(other.mAdName))
			return false;
		if (mAdsetId == null) {
			if (other.mAdsetId != null)
				return false;
		} else if (!mAdsetId.equals(other.mAdsetId))
			return false;
		if (mAdsetName == null) {
			if (other.mAdsetName != null)
				return false;
		} else if (!mAdsetName.equals(other.mAdsetName))
			return false;
		if (mCampaignId == null) {
			if (other.mCampaignId != null)
				return false;
		} else if (!mCampaignId.equals(other.mCampaignId))
			return false;
		if (mCampaignName == null) {
			if (other.mCampaignName != null)
				return false;
		} else if (!mCampaignName.equals(other.mCampaignName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AdInsights [mAccountId=" + mAccountId + ", mAccountName=" + mAccountName + ", mAdId=" + mAdId
				+ ", mAdName=" + mAdName + ", mAdsetId=" + mAdsetId + ", mAdsetName=" + mAdsetName
				+ ", mAppStoreClicks=" + mAppStoreClicks + ", mBuyingType=" + mBuyingType + ", mCallToActionClicks="
				+ mCallToActionClicks + ", mCampaignId=" + mCampaignId + ", mCampaignName=" + mCampaignName
				+ ", mCanvasAvgViewPercent=" + mCanvasAvgViewPercent + ", mCanvasAvgViewTime=" + mCanvasAvgViewTime
				+ ", mClicks=" + mClicks + ", mCostPerEstimatedAdRecallers=" + mCostPerEstimatedAdRecallers
				+ ", mCostPerInlineLinkClick=" + mCostPerInlineLinkClick + ", mCostPerInlinePostEngagement="
				+ mCostPerInlinePostEngagement + ", mCostPerTotalAction=" + mCostPerTotalAction
				+ ", mCostPerUniqueClick=" + mCostPerUniqueClick + ", mCostPerUniqueInlineLinkClick="
				+ mCostPerUniqueInlineLinkClick + ", mCpc=" + mCpc + ", mCpm=" + mCpm + ", mCpp=" + mCpp + ", mCtr="
				+ mCtr + ", mDateStart=" + mDateStart + ", mDateStop=" + mDateStop + ", mDeeplinkClicks="
				+ mDeeplinkClicks + ", mEstimatedAdRecallRate=" + mEstimatedAdRecallRate + ", mEstimatedAdRecallers="
				+ mEstimatedAdRecallers + ", mFrequency=" + mFrequency + ", mImpressions=" + mImpressions
				+ ", mInlineLinkClickCtr=" + mInlineLinkClickCtr + ", mInlineLinkClicks=" + mInlineLinkClicks
				+ ", mInlinePostEngagement=" + mInlinePostEngagement + ", mNewsfeedAvgPosition=" + mNewsfeedAvgPosition
				+ ", mNewsfeedClicks=" + mNewsfeedClicks + ", mNewsfeedImpressions=" + mNewsfeedImpressions
				+ ", mObjective=" + mObjective + ", mPlacePageName=" + mPlacePageName + ", mReach=" + mReach
				+ ", mSocialClicks=" + mSocialClicks + ", mSocialImpressions=" + mSocialImpressions + ", mSocialReach="
				+ mSocialReach + ", mSocialSpend=" + mSocialSpend + ", mSpend=" + mSpend + ", mTotalActionValue="
				+ mTotalActionValue + ", mTotalActions=" + mTotalActions + ", mTotalUniqueActions="
				+ mTotalUniqueActions + ", mUniqueClicks=" + mUniqueClicks + ", mUniqueCtr=" + mUniqueCtr
				+ ", mUniqueImpressions=" + mUniqueImpressions + ", mUniqueInlineLinkClickCtr="
				+ mUniqueInlineLinkClickCtr + ", mUniqueInlineLinkClicks=" + mUniqueInlineLinkClicks
				+ ", mUniqueLinkClicksCtr=" + mUniqueLinkClicksCtr + ", mUniqueSocialClicks=" + mUniqueSocialClicks
				+ ", mUniqueSocialImpressions=" + mUniqueSocialImpressions + ", mWebsiteClicks=" + mWebsiteClicks + "]";
	}
	
	
}
