package com.cisco.demos;

public class AddArguments2 {

	public static void main(String[] args) {

		int sum = 0;

		for (String element : args) {
			try {
				sum += Integer.parseInt(element);
			} catch (NumberFormatException variable) {
//				variable.printStackTrace();
				System.err.println("[" + element + "] is not integer, hence not included in sum");

			}

		}
		System.out.println("Sum =" + sum);

	}

}
