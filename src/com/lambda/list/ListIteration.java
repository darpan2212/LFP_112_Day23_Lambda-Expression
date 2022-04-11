package com.lambda.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ListIteration {

	List<Integer> myList;

	public ListIteration() {
		myList = new LinkedList<>();

		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 90 + 10);
			myList.add(randomNum);
		}

	}

	public static void main(String[] args) {
		ListIteration li = new ListIteration();

		System.out.println("---printing list obj----");
		System.out.println(li.myList);

		Iterator<Integer> intItr = li.myList.iterator();
		System.out.println(
				"-----printing list elements with iterator----");
		while (intItr.hasNext()) {
			System.out.println(intItr.next());
		}

		System.out.println(
				"----printing list element with consumer obj-----");
		Consumer<Integer> myConsumer = new ConsumerImpl<>();
		li.myList.forEach(myConsumer);

		System.out.println(
				"----printing list element with consumer interface-----");
		li.myList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});

		System.out.println(
				"----printing list element with sysout-----");
		Consumer<Integer> myConsumer2 = System.out::println;
		li.myList.forEach(myConsumer2);

		System.out.println(
				"-----printing list element with lambda expression---");
		li.myList.forEach(x -> System.out.println(x));
	}
}