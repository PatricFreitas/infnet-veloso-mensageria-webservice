package br.com.patricfreitas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	
	private String quoteType;
	private String quoteSourceName;
	private String fullExchangeName;
	private String marketState;
	private String market;
	private String symbol;

	
	public String getQuoteType() {
		return quoteType;
	}
	public void setQuoteType(String quoteType) {
		this.quoteType = quoteType;
	}
	public String getQuoteSourceName() {
		return quoteSourceName;
	}
	public void setQuoteSourceName(String quoteSourceName) {
		this.quoteSourceName = quoteSourceName;
	}
	public String getFullExchangeName() {
		return fullExchangeName;
	}
	public void setFullExchangeName(String fullExchangeName) {
		this.fullExchangeName = fullExchangeName;
	}
	public String getMarketState() {
		return marketState;
	}
	public void setMarketState(String marketState) {
		this.marketState = marketState;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
