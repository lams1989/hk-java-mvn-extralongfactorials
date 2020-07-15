package com.lams1989.extralongfactorials;

import java.math.BigInteger;

public class ExtraLongFactorials {

	public static BigInteger extraLongFactorials(int n) {

		BigInteger factorial = BigInteger.valueOf(1L);
		while (n > 1) {
			factorial = factorial.multiply(BigInteger.valueOf(n));
			n--;
		}
		
		return factorial;
	}
}
