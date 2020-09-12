package br.com.patricfreitas.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteResponse {
	
	private List<Quote> result;

	public List<Quote> getResult() {
		return result;
	}

	public void setResult(List<Quote> result) {
		this.result = result;
	}

}
