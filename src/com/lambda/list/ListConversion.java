package com.lambda.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ListConversion {

	List<Integer> myList;

	public ListConversion() {
		myList = new LinkedList<>();

		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 90 + 10);
			myList.add(randomNum);
		}

	}

	public static void main(String[] args) {
		ListConversion li = new ListConversion();

		System.out.println("---printing list obj----");
		System.out.println(li.myList);

		Iterator<Integer> intItr = li.myList.iterator();
		System.out.println(
				"-----printing list elements with iterator----");
		while (intItr.hasNext()) {
			System.out.println((double) intItr.next());
		}

		System.out.println(
				"---conversion with Function functional interface---");
		Function<Integer, Double> doubleFunction = n -> n
				.doubleValue();

		li.myList.forEach(n -> System.out
				.println(doubleFunction.apply(n)));
	}
}