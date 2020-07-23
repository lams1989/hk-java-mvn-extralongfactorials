package com.lams1989.extralongfactorials;

import java.math.BigInteger;

import junit.framework.TestCase;

public class ExtraLongFactorialsTest extends TestCase{

		public  void test1() {
			BigInteger factorial = BigInteger.valueOf(1L);
			BigInteger expected = new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");
			int n = 100;
			factorial = ExtraLongFactorials.extraLongFactorials(n);
			assertTrue(expected.equals(factorial));
		}
		public  void test2() {
			int n = 500;
			ExtraLongFactorials.extraLongFactorials(n);
		}
		public  void test3() {
			int n = 1000;
			ExtraLongFactorials.extraLongFactorials(n);
		}
		public  void test4() {
			int n = 1500;
			ExtraLongFactorials.extraLongFactorials(n);
		}
}
