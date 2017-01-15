package com.fbcamp.model;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class AdReportRun implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SerializedName("account_id")
	private String mAccountId;
	@SerializedName("async_percent_completion")
	private Long mAsyncPercentCompletion;
	@SerializedName("async_status")
	private String mAsyncStatus;
	@SerializedName("date_start")
	private String mDateStart;
	@SerializedName("date_stop")
	private String mDateStop;
	@SerializedName("emails")
	private List<String> mEmails;
	@SerializedName("friendly_name")
	private String mFriendlyName;
	@SerializedName("id")
	private String mId;
	@SerializedName("is_bookmarked")
	private Boolean mIsBookmarked;
	@SerializedName("is_running")
	private Boolean mIsRunning;
	@SerializedName("schedule_id")
	private String mScheduleId;
	@SerializedName("time_completed")
	private Long mTimeCompleted;
	@SerializedName("time_ref")
	private Long mTimeRef;
	@SerializedName("report_run_id")
	private Long mReportRunID;
	public String getmAccountId() {
		return mAccountId;
	}
	public void setmAccountId(String mAccountId) {
		this.mAccountId = mAccountId;
	}
	public Long getmAsyncPercentCompletion() {
		return mAsyncPercentCompletion;
	}
	public void setmAsyncPercentCompletion(Long mAsyncPercentCompletion) {
		this.mAsyncPercentCompletion = mAsyncPercentCompletion;
	}
	public String getmAsyncStatus() {
		return mAsyncStatus;
	}
	public void setmAsyncStatus(String mAsyncStatus) {
		this.mAsyncStatus = mAsyncStatus;
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
	public List<String> getmEmails() {
		return mEmails;
	}
	public void setmEmails(List<String> mEmails) {
		this.mEmails = mEmails;
	}
	public String getmFriendlyName() {
		return mFriendlyName;
	}
	public void setmFriendlyName(String mFriendlyName) {
		this.mFriendlyName = mFriendlyName;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public Boolean getmIsBookmarked() {
		return mIsBookmarked;
	}
	public void setmIsBookmarked(Boolean mIsBookmarked) {
		this.mIsBookmarked = mIsBookmarked;
	}
	public Boolean getmIsRunning() {
		return mIsRunning;
	}
	public void setmIsRunning(Boolean mIsRunning) {
		this.mIsRunning = mIsRunning;
	}
	public String getmScheduleId() {
		return mScheduleId;
	}
	public void setmScheduleId(String mScheduleId) {
		this.mScheduleId = mScheduleId;
	}
	public Long getmTimeCompleted() {
		return mTimeCompleted;
	}
	public void setmTimeCompleted(Long mTimeCompleted) {
		this.mTimeCompleted = mTimeCompleted;
	}
	public Long getmTimeRef() {
		return mTimeRef;
	}
	public void setmTimeRef(Long mTimeRef) {
		this.mTimeRef = mTimeRef;
	}
	public AdReportRun() {
		super();
	}
	public Long getmReportRunID() {
		return mReportRunID;
	}
	public void setmReportRunID(Long mReportRunID) {
		this.mReportRunID = mReportRunID;
	}
	@Override
	public String toString() {
		return "AdReportRun [mAccountId=" + mAccountId + ", mAsyncPercentCompletion=" + mAsyncPercentCompletion
				+ ", mAsyncStatus=" + mAsyncStatus + ", mDateStart=" + mDateStart + ", mDateStop=" + mDateStop
				+ ", mEmails=" + mEmails + ", mFriendlyName=" + mFriendlyName + ", mId=" + mId + ", mIsBookmarked="
				+ mIsBookmarked + ", mIsRunning=" + mIsRunning + ", mScheduleId=" + mScheduleId + ", mTimeCompleted="
				+ mTimeCompleted + ", mTimeRef=" + mTimeRef + ", mReportRunID=" + mReportRunID + "]";
	}
	
	

}
