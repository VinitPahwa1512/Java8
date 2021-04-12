package com.vinit.java8.learn;

import java.util.function.*;

public class ConsumerInterfaceDemo {
	public static void main(String args[]) {
		Consumer<String> c = fruit -> System.out.println("my fav fruit is:" + fruit);
		c.accept("pear");

		Supplier<Integer> s = () -> 42;
		System.out.println("Value Returned:" + s.get());

		Function<Integer, String> fun = age -> age >= 21 ? "you can drive!" : "looks like you cannit drive!!";
		System.out.println(fun.apply(34));

		Predicate<Person> page = person -> person.age >= 65;
		Predicate<Person> pname = person -> person.name.substring(0, 1).toUpperCase().equalsIgnoreCase("A");
		System.out.println(page.test(new Person("Vinit",35)));
		System.out.println(pname.test(new Person("An",35)));
	}

	static class Person {
		String name;

		int age;

		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
	}
}
