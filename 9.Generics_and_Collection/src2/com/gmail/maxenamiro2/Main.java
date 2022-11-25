package com.gmail.maxenamiro2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lst();
	}

	public static void Lst() {
		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 1; i < 11; i++) {
			a.add(i);
		}

		System.out.println(a);
		a.remove(0);
		a.remove(0);
		a.remove(a.size() - 1);
		System.out.println(a);
	}

}
