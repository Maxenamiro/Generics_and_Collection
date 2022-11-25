package com.gmail.maxenamiro;

import java.util.Comparator;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Group {

	private String groupName;
	private List<Student> students = new ArrayList<>(10);

	public Group() {
	}

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public Group(String groupName, List<Student> students) {
		this.groupName = groupName;
		this.students = students;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) throws GroupOverflowException {

		if (students.size() < 10) {
			students.add(student);
			student.setGroupName(this.groupName);
			student.setId(students.size());
			return;
		}
		throw new GroupOverflowException("Student " + student.getLastName() + "add error ");
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		Student tempStudent = null;

		for (Student student : students) {
			if (student.getLastName().equals(lastName)) {
				tempStudent = student;
			}
		}
		if (tempStudent == null) {
			throw new StudentNotFoundException("Couldn't find the student " + lastName);
		}
		return tempStudent;
	}

	public boolean removeStudentById1(int id) {

		for (Student student : students) {
			if (student.getId() == id) {
				System.out.println("Student " + id + " deleted!");
				students.remove(student);
				return true;
			}
		}
		System.out.println("Student " + id + " not foud");
		return false;
	}

	public void sortStudentsByLastName() {
		Collections.sort(students, Comparator.comparing(Human::getLastName));
	}

	public boolean checkStudentsSimilarity() {
		for (int i = 0; i < students.size() - 1; i++) {
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(i).getLastName() != null && students.get(i).getName() != null
						&& students.get(j).getLastName() != null && students.get(j).getName() != null
						&& students.get(i).getLastName().equals(students.get(j).getLastName())
						&& students.get(i).getName().equals(students.get(j).getName())) {

					System.out
							.println("Same student " + students.get(i).getName() + " " + students.get(i).getLastName());
					return true;
				}
			}
		}
		System.out.println("No equal student");
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupName, students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Objects.equals(groupName, other.groupName) && Objects.equals(students, other.students);
	}

	@Override
	public String toString() {
		sortStudentsByLastName();
		StringBuilder studentsList = new StringBuilder("Group info: " + groupName + '\n');

		for (Student student : students) {
			studentsList.append(student.toString());
		}
		return studentsList.toString();
	}
}