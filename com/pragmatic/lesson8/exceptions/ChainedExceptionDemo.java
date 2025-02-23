package com.pragmatic.lesson8.exceptions;

public class ChainedExceptionDemo {

	public static void main(String[] args) {
		String str = null;
        try {
            testMethod(str);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("Tozi red sha go vidq li?");
	}

	private static void testMethod(String str) {
        try {
            if(str.equals("Mladen")) {
                System.out.println("Tova e Mladen");
            }
        } catch (NullPointerException ex) {
           ex.printStackTrace();
           throw new RuntimeException("chain-vam exception", ex);
        }
    }
}
