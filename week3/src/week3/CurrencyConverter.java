package week3;

public class CurrencyConverter {
	private String baseUnit;

	private ExchangeRate exchangeRate;

	public CurrencyConverter(String baseUnit, ExchangeRate exchangeRate) {
		this.baseUnit = baseUnit;
		this.exchangeRate = exchangeRate;
	}

	public float toEuros(float amount) {
		if ("EUR".equals(baseUnit))
			return amount;
		else {
			float rate = exchangeRate.getRate(baseUnit, "EUR");
			float output = amount * rate;
			return output;
		}
	}
}