package com.javanilo.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Implementation of Fibonacci using ArrayList. This implementation has O(N) complexity. 
 * 
 * @author Danilo N Costa
 *
 */
public class FibonacciArray implements Fibonacci {
	
	private List<Long> calculatedNumbers = new ArrayList<Long>();
	
	public FibonacciArray() {
		//initialize with 0, 1 ,1 
		calculatedNumbers.add(0L);
		calculatedNumbers.add(1L);
		calculatedNumbers.add(1L);
	}

	@Override
	public long fib(int number) {
		long result = 0;
		
		if (number > 0 ) {
			if (contains(number)) {
				result = calculatedNumbers.get(number);
			} else {
				generateMissingNumnbersFor(number);
				result = calculatedNumbers.get(number);
			}
		}
		return result;
	}
	

	private boolean contains(int number) {
		if (calculatedNumbers.size() >= number+1) {
			return true;
		}else return false;
	}
	
	private void generateMissingNumnbersFor(int number) {
		int lastCalculated = calculatedNumbers.size() -1;
		//loop from the last up to the desired numeber
		
		for(int i = lastCalculated+1; i <=number; i++) {
			long fibNumber = calculatedNumbers.get(i-1) + calculatedNumbers.get(i-2);
			calculatedNumbers.add(fibNumber);
		}

		
	}

}
