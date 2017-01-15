package com.fbcamp.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class AdAccount implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SerializedName("account_id")
	private String mAccountId;
	@SerializedName("account_status")
	private Long mAccountStatus;
	@SerializedName("age")
	private Double mAge;
	/*
	 * @SerializedName("agency_client_declaration") private
	 * AgencyClientDeclaration mAgencyClientDeclaration;
	 */
	@SerializedName("amount_spent")
	private String mAmountSpent;
	@SerializedName("balance")
	private String mBalance;
	/*
	 * @SerializedName("business") private Business mBusiness;
	 */
	@SerializedName("business_city")
	private String mBusinessCity;
	@SerializedName("business_country_code")
	private String mBusinessCountryCode;
	@SerializedName("business_name")
	private String mBusinessName;
	@SerializedName("business_state")
	private String mBusinessState;
	@SerializedName("business_street")
	private String mBusinessStreet;
	@SerializedName("business_street2")
	private String mBusinessStreet2;
	@SerializedName("business_zip")
	private String mBusinessZip;
	@SerializedName("can_create_brand_lift_study")
	private Boolean mCanCreateBrandLiftStudy;
	@SerializedName("capabilities")
	private List<String> mCapabilities;
	@SerializedName("created_time")
	private String mCreatedTime;
	@SerializedName("currency")
	private String mCurrency;
	@SerializedName("disable_reason")
	private Long mDisableReason;
	@SerializedName("end_advertiser")
	private String mEndAdvertiser;
	@SerializedName("end_advertiser_name")
	private String mEndAdvertiserName;
	/*
	 * @SerializedName("failed_delivery_checks") private List<DeliveryCheck>
	 * mFailedDeliveryChecks;
	 */
	@SerializedName("funding_source")
	private String mFundingSource;
	/*
	 * @SerializedName("funding_source_details") private FundingSourceDetails
	 * mFundingSourceDetails;
	 */
	@SerializedName("has_migrated_permissions")
	private Boolean mHasMigratedPermissions;
	@SerializedName("id")
	private String mId;
	@SerializedName("io_number")
	private String mIoNumber;
	@SerializedName("is_notifications_enabled")
	private Boolean mIsNotificationsEnabled;
	@SerializedName("is_personal")
	private Long mIsPersonal;
	@SerializedName("is_prepay_account")
	private Boolean mIsPrepayAccount;
	@SerializedName("is_tax_id_required")
	private Boolean mIsTaxIdRequired;
	@SerializedName("line_numbers")
	private List<Long> mLineNumbers;
	@SerializedName("media_agency")
	private String mMediaAgency;
	@SerializedName("min_campaign_group_spend_cap")
	private String mMinCampaignGroupSpendCap;
	@SerializedName("min_daily_budget")
	private Long mMinDailyBudget;
	@SerializedName("name")
	private String mName;
	@SerializedName("offsite_pixels_tos_accepted")
	private Boolean mOffsitePixelsTosAccepted;
	@SerializedName("owner")
	private String mOwner;
	@SerializedName("partner")
	private String mPartner;
	/*
	 * @SerializedName("rf_spec") private ReachFrequencySpec mRfSpec;
	 */
	@SerializedName("spend_cap")
	private String mSpendCap;
	@SerializedName("tax_id")
	private String mTaxId;
	@SerializedName("tax_id_status")
	private Long mTaxIdStatus;
	@SerializedName("tax_id_type")
	private String mTaxIdType;
	@SerializedName("timezone_id")
	private Long mTimezoneId;
	@SerializedName("timezone_name")
	private String mTimezoneName;
	@SerializedName("timezone_offset_hours_utc")
	private Double mTimezoneOffsetHoursUtc;
	@SerializedName("tos_accepted")
	private Map<String, Long> mTosAccepted;
	@SerializedName("user_role")
	private String mUserRole;

	public AdAccount() {
		super();
	}

	public String getmAccountId() {
		return mAccountId;
	}

	public void setmAccountId(String mAccountId) {
		this.mAccountId = mAccountId;
	}

	public Long getmAccountStatus() {
		return mAccountStatus;
	}

	public void setmAccountStatus(Long mAccountStatus) {
		this.mAccountStatus = mAccountStatus;
	}

	public Double getmAge() {
		return mAge;
	}

	public void setmAge(Double mAge) {
		this.mAge = mAge;
	}

	public String getmAmountSpent() {
		return mAmountSpent;
	}

	public void setmAmountSpent(String mAmountSpent) {
		this.mAmountSpent = mAmountSpent;
	}

	public String getmBalance() {
		return mBalance;
	}

	public void setmBalance(String mBalance) {
		this.mBalance = mBalance;
	}

	public String getmBusinessCity() {
		return mBusinessCity;
	}

	public void setmBusinessCity(String mBusinessCity) {
		this.mBusinessCity = mBusinessCity;
	}

	public String getmBusinessCountryCode() {
		return mBusinessCountryCode;
	}

	public void setmBusinessCountryCode(String mBusinessCountryCode) {
		this.mBusinessCountryCode = mBusinessCountryCode;
	}

	public String getmBusinessName() {
		return mBusinessName;
	}

	public void setmBusinessName(String mBusinessName) {
		this.mBusinessName = mBusinessName;
	}

	public String getmBusinessState() {
		return mBusinessState;
	}

	public void setmBusinessState(String mBusinessState) {
		this.mBusinessState = mBusinessState;
	}

	public String getmBusinessStreet() {
		return mBusinessStreet;
	}

	public void setmBusinessStreet(String mBusinessStreet) {
		this.mBusinessStreet = mBusinessStreet;
	}

	public String getmBusinessStreet2() {
		return mBusinessStreet2;
	}

	public void setmBusinessStreet2(String mBusinessStreet2) {
		this.mBusinessStreet2 = mBusinessStreet2;
	}

	public String getmBusinessZip() {
		return mBusinessZip;
	}

	public void setmBusinessZip(String mBusinessZip) {
		this.mBusinessZip = mBusinessZip;
	}

	public Boolean getmCanCreateBrandLiftStudy() {
		return mCanCreateBrandLiftStudy;
	}

	public void setmCanCreateBrandLiftStudy(Boolean mCanCreateBrandLiftStudy) {
		this.mCanCreateBrandLiftStudy = mCanCreateBrandLiftStudy;
	}

	public List<String> getmCapabilities() {
		return mCapabilities;
	}

	public void setmCapabilities(List<String> mCapabilities) {
		this.mCapabilities = mCapabilities;
	}

	public String getmCreatedTime() {
		return mCreatedTime;
	}

	public void setmCreatedTime(String mCreatedTime) {
		this.mCreatedTime = mCreatedTime;
	}

	public String getmCurrency() {
		return mCurrency;
	}

	public void setmCurrency(String mCurrency) {
		this.mCurrency = mCurrency;
	}

	public Long getmDisableReason() {
		return mDisableReason;
	}

	public void setmDisableReason(Long mDisableReason) {
		this.mDisableReason = mDisableReason;
	}

	public String getmEndAdvertiser() {
		return mEndAdvertiser;
	}

	public void setmEndAdvertiser(String mEndAdvertiser) {
		this.mEndAdvertiser = mEndAdvertiser;
	}

	public String getmEndAdvertiserName() {
		return mEndAdvertiserName;
	}

	public void setmEndAdvertiserName(String mEndAdvertiserName) {
		this.mEndAdvertiserName = mEndAdvertiserName;
	}

	public String getmFundingSource() {
		return mFundingSource;
	}

	public void setmFundingSource(String mFundingSource) {
		this.mFundingSource = mFundingSource;
	}

	public Boolean getmHasMigratedPermissions() {
		return mHasMigratedPermissions;
	}

	public void setmHasMigratedPermissions(Boolean mHasMigratedPermissions) {
		this.mHasMigratedPermissions = mHasMigratedPermissions;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmIoNumber() {
		return mIoNumber;
	}

	public void setmIoNumber(String mIoNumber) {
		this.mIoNumber = mIoNumber;
	}

	public Boolean getmIsNotificationsEnabled() {
		return mIsNotificationsEnabled;
	}

	public void setmIsNotificationsEnabled(Boolean mIsNotificationsEnabled) {
		this.mIsNotificationsEnabled = mIsNotificationsEnabled;
	}

	public Long getmIsPersonal() {
		return mIsPersonal;
	}

	public void setmIsPersonal(Long mIsPersonal) {
		this.mIsPersonal = mIsPersonal;
	}

	public Boolean getmIsPrepayAccount() {
		return mIsPrepayAccount;
	}

	public void setmIsPrepayAccount(Boolean mIsPrepayAccount) {
		this.mIsPrepayAccount = mIsPrepayAccount;
	}

	public Boolean getmIsTaxIdRequired() {
		return mIsTaxIdRequired;
	}

	public void setmIsTaxIdRequired(Boolean mIsTaxIdRequired) {
		this.mIsTaxIdRequired = mIsTaxIdRequired;
	}

	public List<Long> getmLineNumbers() {
		return mLineNumbers;
	}

	public void setmLineNumbers(List<Long> mLineNumbers) {
		this.mLineNumbers = mLineNumbers;
	}

	public String getmMediaAgency() {
		return mMediaAgency;
	}

	public void setmMediaAgency(String mMediaAgency) {
		this.mMediaAgency = mMediaAgency;
	}

	public String getmMinCampaignGroupSpendCap() {
		return mMinCampaignGroupSpendCap;
	}

	public void setmMinCampaignGroupSpendCap(String mMinCampaignGroupSpendCap) {
		this.mMinCampaignGroupSpendCap = mMinCampaignGroupSpendCap;
	}

	public Long getmMinDailyBudget() {
		return mMinDailyBudget;
	}

	public void setmMinDailyBudget(Long mMinDailyBudget) {
		this.mMinDailyBudget = mMinDailyBudget;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Boolean getmOffsitePixelsTosAccepted() {
		return mOffsitePixelsTosAccepted;
	}

	public void setmOffsitePixelsTosAccepted(Boolean mOffsitePixelsTosAccepted) {
		this.mOffsitePixelsTosAccepted = mOffsitePixelsTosAccepted;
	}

	public String getmOwner() {
		return mOwner;
	}

	public void setmOwner(String mOwner) {
		this.mOwner = mOwner;
	}

	public String getmPartner() {
		return mPartner;
	}

	public void setmPartner(String mPartner) {
		this.mPartner = mPartner;
	}

	public String getmSpendCap() {
		return mSpendCap;
	}

	public void setmSpendCap(String mSpendCap) {
		this.mSpendCap = mSpendCap;
	}

	public String getmTaxId() {
		return mTaxId;
	}

	public void setmTaxId(String mTaxId) {
		this.mTaxId = mTaxId;
	}

	public Long getmTaxIdStatus() {
		return mTaxIdStatus;
	}

	public void setmTaxIdStatus(Long mTaxIdStatus) {
		this.mTaxIdStatus = mTaxIdStatus;
	}

	public String getmTaxIdType() {
		return mTaxIdType;
	}

	public void setmTaxIdType(String mTaxIdType) {
		this.mTaxIdType = mTaxIdType;
	}

	public Long getmTimezoneId() {
		return mTimezoneId;
	}

	public void setmTimezoneId(Long mTimezoneId) {
		this.mTimezoneId = mTimezoneId;
	}

	public String getmTimezoneName() {
		return mTimezoneName;
	}

	public void setmTimezoneName(String mTimezoneName) {
		this.mTimezoneName = mTimezoneName;
	}

	public Double getmTimezoneOffsetHoursUtc() {
		return mTimezoneOffsetHoursUtc;
	}

	public void setmTimezoneOffsetHoursUtc(Double mTimezoneOffsetHoursUtc) {
		this.mTimezoneOffsetHoursUtc = mTimezoneOffsetHoursUtc;
	}

	public Map<String, Long> getmTosAccepted() {
		return mTosAccepted;
	}

	public void setmTosAccepted(Map<String, Long> mTosAccepted) {
		this.mTosAccepted = mTosAccepted;
	}

	public String getmUserRole() {
		return mUserRole;
	}

	public void setmUserRole(String mUserRole) {
		this.mUserRole = mUserRole;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mAccountId == null) ? 0 : mAccountId.hashCode());
		result = prime * result + ((mId == null) ? 0 : mId.hashCode());
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
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
		AdAccount other = (AdAccount) obj;
		if (mAccountId == null) {
			if (other.mAccountId != null)
				return false;
		} else if (!mAccountId.equals(other.mAccountId))
			return false;
		if (mId == null) {
			if (other.mId != null)
				return false;
		} else if (!mId.equals(other.mId))
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AdAccount [mAccountId=" + mAccountId + ", mAccountStatus=" + mAccountStatus + ", mAge=" + mAge
				+ ", mAmountSpent=" + mAmountSpent + ", mBalance=" + mBalance + ", mBusinessCity=" + mBusinessCity
				+ ", mBusinessCountryCode=" + mBusinessCountryCode + ", mBusinessName=" + mBusinessName
				+ ", mBusinessState=" + mBusinessState + ", mBusinessStreet=" + mBusinessStreet + ", mBusinessStreet2="
				+ mBusinessStreet2 + ", mBusinessZip=" + mBusinessZip + ", mCanCreateBrandLiftStudy="
				+ mCanCreateBrandLiftStudy + ", mCapabilities=" + mCapabilities + ", mCreatedTime=" + mCreatedTime
				+ ", mCurrency=" + mCurrency + ", mDisableReason=" + mDisableReason + ", mEndAdvertiser="
				+ mEndAdvertiser + ", mEndAdvertiserName=" + mEndAdvertiserName + ", mFundingSource=" + mFundingSource
				+ ", mHasMigratedPermissions=" + mHasMigratedPermissions + ", mId=" + mId + ", mIoNumber=" + mIoNumber
				+ ", mIsNotificationsEnabled=" + mIsNotificationsEnabled + ", mIsPersonal=" + mIsPersonal
				+ ", mIsPrepayAccount=" + mIsPrepayAccount + ", mIsTaxIdRequired=" + mIsTaxIdRequired
				+ ", mLineNumbers=" + mLineNumbers + ", mMediaAgency=" + mMediaAgency + ", mMinCampaignGroupSpendCap="
				+ mMinCampaignGroupSpendCap + ", mMinDailyBudget=" + mMinDailyBudget + ", mName=" + mName
				+ ", mOffsitePixelsTosAccepted=" + mOffsitePixelsTosAccepted + ", mOwner=" + mOwner + ", mPartner="
				+ mPartner + ", mSpendCap=" + mSpendCap + ", mTaxId=" + mTaxId + ", mTaxIdStatus=" + mTaxIdStatus
				+ ", mTaxIdType=" + mTaxIdType + ", mTimezoneId=" + mTimezoneId + ", mTimezoneName=" + mTimezoneName
				+ ", mTimezoneOffsetHoursUtc=" + mTimezoneOffsetHoursUtc + ", mTosAccepted=" + mTosAccepted
				+ ", mUserRole=" + mUserRole + "]";
	}
	
	

}
