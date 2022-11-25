package com.gmail.maxenamiro;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList<String> group = new ArrayList<String>();
		// group.add("Taras", "Shevchenko", Gender.MALE, 1, "Writer");
		Student student1 = new Student("Taras", "Shevchenko", Gender.MALE, 1, "Writer");
		Student student2 = new Student("Ivan", "Franko", Gender.MALE, 2, "Writer");
		Student student3 = new Student("Lesya", "Ukrainka", Gender.FEMALE, 3, "Writer");
		Student student4 = new Student("Grugoriy", "Skovoroda", Gender.MALE, 4, "Writer");
		Student student5 = new Student("Lina", "Kostenko", Gender.FEMALE, 5, "Writer");
		Student student6 = new Student("Valerian", "Pidmohulniy", Gender.MALE, 6, "Writer");
		Student student7 = new Student("Myhailo", "Kociubinskiy", Gender.MALE, 7, "Writer");
		Student student8 = new Student("Mykola", "Khviloviy", Gender.MALE, 8, "Writer");
		Student student9 = new Student("Volodymyr", "Vinnichenko", Gender.MALE, 9, "Writer");
		Student student10 = new Student("Oleksandr", "Dovzhenko", Gender.MALE, 10, "Writer");

		Group a = new Group("Writer");

		try {
			a.addStudent(student1);
			a.addStudent(student2);
			a.addStudent(student3);
			a.addStudent(student4);
			a.addStudent(student5);
			a.addStudent(student6);
			a.addStudent(student7);
			a.addStudent(student8);
			a.addStudent(student9);
			a.addStudent(student10);
		} catch (GroupOverflowException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(a.searchStudentByLastName("Vinnichenko"));
			System.out.println(a.searchStudentByLastName(student5.getLastName()));
			System.out.println();

		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}

		a.sortStudentsByLastName();
		System.out.println("Sorted group: " + a.getGroupName());
		System.out.println();
		System.out.println(a);

		System.out.println("St 1 equals st 2 = " + student2.equals(student1));
		System.out.println("St 2 equals st 3 = " + student2.equals(student3));
		System.out.println("St 2 equals st 2 = " + student2.equals(student2));
		System.out.println();

		System.out.println(student1.getName() + " " + student1.getLastName() + " - hashCode = " + student1.hashCode());
		System.out.println(student2.getName() + " " + student2.getLastName() + " - hashCode = " + student2.hashCode());
		System.out.println(student3.getName() + " " + student3.getLastName() + " - hashCode = " + student3.hashCode());
		System.out.println();

		a.checkStudentsSimilarity();
		System.out.println();

	}
}
