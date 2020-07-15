package com.lams1989.extralongfactorials;

import java.math.BigInteger;

import junit.framework.TestCase;

public class ExtraLongFactorialsTest extends TestCase{

		public  void test1() {
			BigInteger factorial = BigInteger.valueOf(1L);

			int n = 100;
			factorial = ExtraLongFactorials.extraLongFactorials(n);
			assertEquals(true, factorial);
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
