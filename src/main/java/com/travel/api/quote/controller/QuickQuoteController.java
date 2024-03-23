package com.travel.api.quote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.api.exceptionHandling.util.FmkException;
import com.travel.api.quote.reponse.QuickQuoteResponse;
import com.travel.api.quote.request.QuickQuoteRequest;
import com.travel.api.quote.service.QuickQuoteService;

@RestController
public class QuickQuoteController {
	
	@Autowired
	private QuickQuoteService quickQuoteServivce;
	
	@PostMapping("/quickQuote")
	public List<QuickQuoteResponse> quickQuote(@RequestBody QuickQuoteRequest quickQuoteRequest) throws FmkException {
		return quickQuoteServivce.getQuickQuote(quickQuoteRequest);
	}

}
