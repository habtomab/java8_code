package com.hcl.bipredicate;

import java.util.function.BiPredicate;

public class JavaBiPredicateExample {
	
    public static void main(String[] args) {

        BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("manjula", 7);
        System.out.println(result);  // true

        boolean result2 = filter.test("java", 10);
        System.out.println(result2); // false
    }


}
