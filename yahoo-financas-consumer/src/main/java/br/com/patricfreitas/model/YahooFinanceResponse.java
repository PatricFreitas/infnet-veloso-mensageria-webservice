package br.com.patricfreitas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YahooFinanceResponse {
	
	private QuoteResponse quoteResponse;

	public QuoteResponse getQuoteResponse() {
		return quoteResponse;
	}

	public void setQuoteResponse(QuoteResponse quoteResponse) {
		this.quoteResponse = quoteResponse;
	}
	
	

}
