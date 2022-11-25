package com.gmail.maxenamiro;

import java.util.Scanner;

public class ReadingCharacters {
	Scanner sc = new Scanner(System.in);

	public Student readingCharacters() {

		Student student = new Student(null, null, null, 0, null);

		System.out.println("Ведите имя");
		student.setName(sc.nextLine());

		System.out.println("Ведите фамилию");
		student.setLastName(sc.nextLine());

		System.out.println("Ведите группу");
		student.setGroupName(sc.nextLine());

		return student;

	}
}
