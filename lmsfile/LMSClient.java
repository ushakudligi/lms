package me.lms.client;

import me.lms.service.LibraryManagerService;
import me.lms.service.StudentService;

public class LMSClient {

	public static void main(String[] args) {
		LibraryManagerService lmService = new LibraryManagerService();
		StudentService studentService = new StudentService();
		
		System.out.println("Welcome to Library Management System");
		System.out.println("What do you wish to do today:");
		System.out.println("1. Read book");

	}

}
