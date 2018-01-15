package com.javanilo.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class TestFibonacciRecrusive {

	@Rule
	public ErrorCollector collector = new ErrorCollector();
	
	public long startTime; 
	
	@Before
	public void setup() {
		startTime = System.currentTimeMillis();
	}
	
	@Test
	public void testFib() {
		
		Fibonacci calculator = new FibonacciRecursive();
		long fibOfNegative = calculator.fib(-2);
		long fibOfZero = calculator.fib(0);
		long fibOf6 = calculator.fib(6);
		long fibOf20 = calculator.fib(20);
		long fibOf50 = calculator.fib(50);
		
		collector.checkThat(fibOfNegative,  is(equalTo(0L)));
		
		collector.checkThat(fibOfZero, is(equalTo(0L)));
		
		collector.checkThat(fibOf6, is(equalTo(8L)));
		
		collector.checkThat(fibOf20, is(equalTo(6765L)));
		
		//took more than 81 seconds
		collector.checkThat(fibOf50, is(equalTo(12_586_269_025L)));
		
		
		
	}
	
	@After
	public void tearDown(){
		long finalTime = System.currentTimeMillis();
		double totalTimeInSeconds = ( finalTime-startTime ) / 1000;
		
		System.out.format(this.getClass().getName() + "total Time:%f s", totalTimeInSeconds);
	}
}
