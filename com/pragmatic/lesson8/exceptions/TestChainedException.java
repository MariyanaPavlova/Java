package com.pragmatic.lesson8.exceptions;

public class TestChainedException {
	
	public static void main(String[] args) {
		String s = null;

		try {
			testMethod(s);
		} catch (RuntimeException e) {
			e.printStackTrace();

		}

		System.out.println("Am I going to see this message?");
	}

	public static void testMethod(String s) {
		try {
			if(s.equals("Ivan")) {
				System.out.println("This is Ivan!");
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			throw new RuntimeException("imame nqkav problem", ex);
		}
	}
}
