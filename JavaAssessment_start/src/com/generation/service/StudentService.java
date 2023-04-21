package com.generation.service;

import com.generation.model.Course;
import com.generation.model.EnrolledCourse;
import com.generation.model.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;

public class StudentService
{
    private final HashMap<String, Student> students = new HashMap<>();

    public void registerStudent( Student student )
    {
        //TODO Add new student to the students hashmap

        Student newStudent = new Student(student.getId(), student.getName());
        this.students.put(newStudent.getId(), student.getName());

    }

    public Student findStudent( String studentId )
    {
        //TODO Find the student from the Hashmap with the student id

        if (this.students.containsKey(studentId)){
            return this.students.get(studentId);
        }
        return null;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO check if students hashmap contains the studentsId, if have add the course to the student enrolledCourse
        Student getStudent = this.students.get(studentId);

        if(students.containsKey(studentId)) {
            getStudent.put(studentId, course.getName());
        }




    }

    public void showSummary()
    {
        //TODO Loop through students hashmap and print out students' details including the enrolled courses

        for (int i = 0; i < this.students.size(); i++){
        System.out.println(this.students.get(i));
    }

    }

    public HashMap<String, EnrolledCourse> enrolledCourses(Student student)
    {
        //TODO return a HashMap of all the enrolledCourses
        Collection<String> values = enrolledCourses.values();

            System.out.println("Enrolled Course: " + values);



    }

    public Course findEnrolledCourse( Student student, String courseId )
    {
        //TODO return the course enrolled by the student from the course Id
        Student findEnrolledCourse = this.students.get(courseId);
        return null;
    }

    public void gradeStudent(Student student, Course course, double grade) {
        student.gradeCourse(course.getCode(), grade);
    }



    public HashMap<String, EnrolledCourse> getPassedCourses(Student student) {
        return student.findPassedCourses();
    }
}
