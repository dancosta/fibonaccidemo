package com.javanilo.demo;

/**
 * This Implementation of Fibonacci using the classic recursive algorithm.
 * This algorithm has an exponential complexity O(2^N).
 * 
 * @author Danilo N Costa
 * 
 */
public class FibonacciRecursive implements Fibonacci {

	@Override
	public long fib(int number) {
		long result = 0;
		if (number < 1) {
			result = 0;
		} else if (number == 1) {
			result = 1;
		} else {
			long a = fib(number -1);
			long b = fib(number -2);
			result = a+b;
		}
		return result;
	}

}
