package test;

public enum TypeDrink {
	Coffee("C",0.6), Tea("T",0.4), Chocolate ("H",0.5) ;
	 private String code;
	 private Double price;
	 
	private TypeDrink(String code, Double price) {
		this.code = code;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public Double getPrice() {
		return price;
	}


	 
}
