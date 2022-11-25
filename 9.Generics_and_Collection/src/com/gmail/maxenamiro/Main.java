package com.gmail.maxenamiro;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> group = new ArrayList<String>();
		//group.add("Taras", "Shevchenko", Gender.MALE, 1, "Writer");
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

		Group group1 = new Group();
		group1.setGroupName("Writer");

		try {
			group1.addStudent(student1);
			group1.addStudent(student2);
			group1.addStudent(student3);
			group1.addStudent(student4);
			group1.addStudent(student5);
			group1.addStudent(student6);
			group1.addStudent(student7);
			group1.addStudent(student8);
			group1.addStudent(student9);
			//group1.addStudent(student10);
			group1.searchStudentByLastName("Dovzhenko");

		} catch (GroupOverflowException e) {
			e.printStackTrace();
		} catch (StudentNotFoundException r) {
			r.printStackTrace();
		}
		
		ReadingCharacters read = new ReadingCharacters();
		try {
			group1.addStudent(read.readingCharacters());
		} catch (GroupOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		group1.sortStudentByLastName();
	}

}
