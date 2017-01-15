package com.fbcamp.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Campaign implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SerializedName("account_id")
	private String mAccountId;
	@SerializedName("budget_rebalance_flag")
	private Boolean mBudgetRebalanceFlag;
	@SerializedName("buying_type")
	private String mBuyingType;
	@SerializedName("can_use_spend_cap")
	private Boolean mCanUseSpendCap;
	@SerializedName("created_time")
	private String mCreatedTime;
	@SerializedName("id")
	private String mId;
	@SerializedName("name")
	private String mName;
	@SerializedName("objective")
	private String mObjective;
	@SerializedName("spend_cap")
	private String mSpendCap;
	@SerializedName("start_time")
	private String mStartTime;
	@SerializedName("stop_time")
	private String mStopTime;
	@SerializedName("updated_time")
	private String mUpdatedTime;

	public Campaign() {
		super();
	}

	public String getmAccountId() {
		return mAccountId;
	}

	public void setmAccountId(String mAccountId) {
		this.mAccountId = mAccountId;
	}

	public Boolean getmBudgetRebalanceFlag() {
		return mBudgetRebalanceFlag;
	}

	public void setmBudgetRebalanceFlag(Boolean mBudgetRebalanceFlag) {
		this.mBudgetRebalanceFlag = mBudgetRebalanceFlag;
	}

	public String getmBuyingType() {
		return mBuyingType;
	}

	public void setmBuyingType(String mBuyingType) {
		this.mBuyingType = mBuyingType;
	}

	public Boolean getmCanUseSpendCap() {
		return mCanUseSpendCap;
	}

	public void setmCanUseSpendCap(Boolean mCanUseSpendCap) {
		this.mCanUseSpendCap = mCanUseSpendCap;
	}

	public String getmCreatedTime() {
		return mCreatedTime;
	}

	public void setmCreatedTime(String mCreatedTime) {
		this.mCreatedTime = mCreatedTime;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmObjective() {
		return mObjective;
	}

	public void setmObjective(String mObjective) {
		this.mObjective = mObjective;
	}

	public String getmSpendCap() {
		return mSpendCap;
	}

	public void setmSpendCap(String mSpendCap) {
		this.mSpendCap = mSpendCap;
	}

	public String getmStartTime() {
		return mStartTime;
	}

	public void setmStartTime(String mStartTime) {
		this.mStartTime = mStartTime;
	}

	public String getmStopTime() {
		return mStopTime;
	}

	public void setmStopTime(String mStopTime) {
		this.mStopTime = mStopTime;
	}

	public String getmUpdatedTime() {
		return mUpdatedTime;
	}

	public void setmUpdatedTime(String mUpdatedTime) {
		this.mUpdatedTime = mUpdatedTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mAccountId == null) ? 0 : mAccountId.hashCode());
		result = prime * result + ((mId == null) ? 0 : mId.hashCode());
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		result = prime * result + ((mObjective == null) ? 0 : mObjective.hashCode());
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
		Campaign other = (Campaign) obj;
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
		if (mObjective == null) {
			if (other.mObjective != null)
				return false;
		} else if (!mObjective.equals(other.mObjective))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Campaign [mAccountId=" + mAccountId + ", mBudgetRebalanceFlag=" + mBudgetRebalanceFlag
				+ ", mBuyingType=" + mBuyingType + ", mCanUseSpendCap=" + mCanUseSpendCap + ", mCreatedTime="
				+ mCreatedTime + ", mId=" + mId + ", mName=" + mName + ", mObjective=" + mObjective + ", mSpendCap="
				+ mSpendCap + ", mStartTime=" + mStartTime + ", mStopTime=" + mStopTime + ", mUpdatedTime="
				+ mUpdatedTime + "]";
	}
	
	

}
