package mypackage;

import mypackage.nast.becomputer.GpaConverter;
import mypackage.nast.Grade;

class Launcher {
	public static void main(String... args) {
		// take user input and pass grade for gpa
		double gpa = GpaConverter.gradeToGpa("A");
		System.out.println(gpa);

		// take user input & pass gpa for grade
		String grade = Grade.gpaToGrade(3.66);
		System.out.println(grade);
	}
}