package com.nsc.java8;

import sun.reflect.annotation.AnnotationParser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMethod {
	
	public static void main(String[] args) {
		DefaultMethod d = new DefaultMethod() {
			
			@Override
			public String test() {
				common(); // เรียก default method
				return "test";
			}
		};
		d.test();

        List<Integer> lst = Arrays.asList(1,2,6,8,9);
        int arr[] = {2,3,4,5};
        int sum = Arrays.stream(arr).map(n->n*0).sum();
        System.out.println(sum);
//        Stream.of(lst2).forEach(e->System.out.println(e));
    }

}
