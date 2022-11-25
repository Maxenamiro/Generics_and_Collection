package com.gmail.maxenamiro;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private String groupName;
	private final Student[] students;

	public Group(String groupName, Student[] students) {
		super();
		this.groupName = groupName;
		this.students = new Student[10];
	}

	public Group() {
		super();
		students = new Student[10];
	}

	public void addStudent(Student student) throws GroupOverflowException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				return;
			}
		}
		throw new GroupOverflowException("У цій группі немає місця для нового студента");
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getLastName().equals(lastName)) {
					return students[i];
				}
			}
		}
		throw new StudentNotFoundException("Такого студента в цій группі немає");
	}

	public boolean removeStudentById(int id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getId() == id) {
					students[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public void sortStudentByLastName() {
		Arrays.sort(students, Comparator.nullsFirst(new StudentLastNameComparator()));
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
	}
}
