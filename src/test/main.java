package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class main {
	
	public static void main(String[] args) {
      
	      CoffeMachine coffee = new CoffeMachine(TypeDrink.Chocolate, 2,0.2);
	        System.out.println("command : " + coffee.make());
	
	}

}
