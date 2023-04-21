package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Student extends Person
{
    public static final double PASS_MIN_GRADE = 3.0;

    private final HashMap<String, EnrolledCourse> enrolledCourses = new HashMap<>();


    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );

    }

    public boolean enrollToCourse( Course course )
    {
        //TODO Check if student has already enrolled to the course, if not add the course to enrolledCourses hashmap
        if (enrolledCourses.containsKey(course))
        {

            return true;
        }
        else {
            this.enrolledCourses.put(course, course);
        }
    }

    public HashMap<String, EnrolledCourse> getEnrolledCourses()
    {
        //TODO return a Hashmap of all the enrolledCourses
        return this.enrolledCourses;

    }

    public void gradeCourse( String courseCode, double grade )
    {
        //TODO set the grade for the enrolled Course
        //this.enrolledCourses.get(courseCode).setGrade(grade)
        double newGrade = grade;
        if (enrolledCourses.containsKey(courseCode)){
           enrolledCourses.put(courseCode, setGrade);
        }
    }

    public Course findCourseById( String courseId )
    {
        //TODO return a Course from the course Id - loop enrolled courses hash map
        //enrolledcourse object.getcode()
        if (this.courses.containsKey(courseId)){
            return this.courses.get(courseId);
        }
        return null;
    }

    public HashMap<String, EnrolledCourse> findPassedCourses()
    {
        //TODO Check the enrolled courses grade and compare to the passing grade


        if (this.enrolledCourses.getGrade >= PASS_MIN_GRADE){
            System.out.println("You have successfully passed the course!");
    }

    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
