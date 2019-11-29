package com.hum.lamuda;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Lampudatesting {

	public static Boolean isOdd(Integer num1) {
		IntPredicate evenPerdicate = (i -> i % 2 == 0);
		return evenPerdicate.negate().test(num1);
	}

	public static Boolean isPrime(Integer num) {

		IntPredicate primePerdicate = i -> {
			if (i < 2)
				return Boolean.FALSE;
			else if (i == 2 || i == 3)
				return Boolean.TRUE;
			else if (i % 2 == 0)
				return Boolean.FALSE;
			else {
				return !IntStream.range(3, num).anyMatch(j->num%j==0);
			}
		};
		
		return primePerdicate.test(num);
	}

	public static Boolean isPalindrome(String word) {
		Predicate<String> palindromePredicate = i -> i.equalsIgnoreCase(new StringBuffer(i).reverse().toString());
		return (word!=null && !word.isEmpty()) ? palindromePredicate.test(word) : Boolean.FALSE;
	}

}
