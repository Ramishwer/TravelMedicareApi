package com.travel.api.quote.service;

import java.util.List;

import com.travel.api.exceptionHandling.util.FmkException;
import com.travel.api.quote.reponse.QuickQuoteResponse;
import com.travel.api.quote.request.QuickQuoteRequest;

public interface QuickQuoteService {
	
	public List<QuickQuoteResponse> getQuickQuote(QuickQuoteRequest quickQuoteRequest) throws FmkException;

}
