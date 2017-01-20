package com.fbcamp.api;

import java.util.List;

import com.fbcamp.model.AdAccount;
import com.fbcamp.model.AdInsight;

public interface AdAccountAPI {

	/**
	 * Returns the adAccount of a user
	 * @param accessToken
	 * @return Ad Account of the users  
	 * @throws Exception
	 */
	public List<AdAccount> getAdAccountList(String accessToken) throws Exception;

	/**
	 * @param accessToken
	 * @param accountId
	 * @param startDate
	 * @param endDate
	 * @return AdInsights of a account
	 * @throws Exception
	 */
	public AdInsight getAdAccountInsight(String accessToken, Long accountId,String startDate,String endDate) throws Exception;

	
}
