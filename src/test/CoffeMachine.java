package test;

import javax.annotation.processing.RoundEnvironment;

public class CoffeMachine {
	private TypeDrink type;
	private Integer sugar;
	private Double money;

	public CoffeMachine(TypeDrink type, Integer sugar, Double money) {
		super();
		this.type = type;
		this.sugar = sugar;
		this.money = money;
	}

	public Double calculateMissingCents() {
		/*switch (type) {
		case Coffee:

			return 0.6 - money;
		case Tea:

			return 0.4 - money;
		case Chocolate:

			return 0.5 - money;
		}*/
		return type.getPrice()-money;
	}

	
	public String make() {
		String result = "";
		if (this.calculateMissingCents() <= 0.0) {
			result = result.concat(type.getCode());
			if (sugar == null || sugar == 0)
				result = result.concat("::");
			else {
				result = result.concat(":" + sugar + ":" + 0);
			}
		} else {
			result = "M:Missing " + Math.abs(this.calculateMissingCents()) + " cents";
		}
		return result;

	}

}
