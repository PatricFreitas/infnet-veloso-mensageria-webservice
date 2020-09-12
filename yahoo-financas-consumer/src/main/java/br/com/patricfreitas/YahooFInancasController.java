package br.com.patricfreitas;



import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.patricfreitas.model.Quote;
import br.com.patricfreitas.model.YahooFinanceResponse;

@RestController
public class YahooFInancasController {
	
	@GetMapping
	public String consume() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<YahooFinanceResponse> response = restTemplate.getForEntity("https://query1.finance.yahoo.com/v7/finance/quote?symbols=TLS.AX,MUS.AX", YahooFinanceResponse.class);
				
		
		List<Quote> quotes = response.getBody().getQuoteResponse().getResult();
				
		
		System.out.println("----------------------");
		
		quotes.forEach(quote ->{
			System.out.println("Full Exchange name: " + quote.getFullExchangeName());
			System.out.println("Market: " + quote.getMarket());
			System.out.println("Market State: " + quote.getMarketState());
			System.out.println("Quote Source Name: " + quote.getQuoteSourceName());
			System.out.println("Quote Type: " + quote.getQuoteType());
			System.out.println("Symbol: " + quote.getSymbol());
			System.out.println("----------------------");
		});
		
		
		
		return "";
	}
	

}
