package com.vinit.java8.learn;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String args[])
	{
		Exam javacert= new Exam("Java Certification");
		Exam mavoncert = new Exam("Mavan Certification");
		
		List<StudentExamResult> results = new LinkedList<>(); 
		results.add(new StudentExamResult(22, "Vinit", javacert));
		results.add(new StudentExamResult(89, "Neha", javacert));
		results.add(new StudentExamResult(78, "Vom", mavoncert));
		
		System.out.println(results);
		
		Set<String> str = results.stream().filter(result -> result.roundPercentage >= 70).map(res -> res.name).collect(Collectors.toSet());
		
		str.forEach(System.out::println);
	}

	static class StudentExamResult
	{
		@Override
		public String toString() {
			return "StudentExamResult [roundPercentage=" + roundPercentage + ", name=" + name + ", exam=" + exam + "]";
		}

		int roundPercentage;
		String name;
		Exam exam;
		
		public StudentExamResult(int roundPercentage, String name, Exam exam) {
			super();
			this.roundPercentage = roundPercentage;
			this.name = name;
			this.exam = exam;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((exam == null) ? 0 : exam.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + roundPercentage;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			StudentExamResult other = (StudentExamResult) obj;
			if (exam == null) {
				if (other.exam != null)
					return false;
			} else if (!exam.equals(other.exam))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (roundPercentage != other.roundPercentage)
				return false;
			return true;
		}
		
		
	}
	static class Exam{
		String name;

		@Override
		public String toString() {
			return "Exam [name=" + name + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Exam other = (Exam) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		public Exam(String name) {
			super();
			this.name = name;
		}
	}
}
