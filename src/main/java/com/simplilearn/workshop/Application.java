package com.simplilearn.workshop;

public class Application {
	public static void main(String[] args) {
	System.out.println(new Application().getMessage());
	}

	private String message="Welcome to new class";

	private String getMessage() {
		return message;
	}
}
