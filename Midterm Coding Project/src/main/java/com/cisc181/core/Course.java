package com.cisc181.core;

import java.util.UUID;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	public Course(UUID courseID, String courseName, int gradePoints, String major) {
		super();
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
	}
	
	
}
