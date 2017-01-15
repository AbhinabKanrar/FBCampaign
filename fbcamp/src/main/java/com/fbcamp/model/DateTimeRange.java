package com.fbcamp.model;

public class DateTimeRange {

	private String since;

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public String getUntil() {
		return until;
	}

	public void setUntil(String until) {
		this.until = until;
	}

	private String until;

	public DateTimeRange() {
		super();
	}

	@Override
	public String toString() {
		return "DateTimeRange [since=" + since + ", until=" + until + "]";
	}
	
	

}
