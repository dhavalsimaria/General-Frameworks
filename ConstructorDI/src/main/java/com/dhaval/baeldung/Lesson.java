package com.dhaval.baeldung;

public class Lesson {
	public Lesson(String str1, String str2) {
		System.out.println(str1 + " " + str2 + " from Dependency class");
	}

	public void startLearning() {
		System.out.println("We are learning Constructor DI.");
	}
}
