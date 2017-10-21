package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students;
    String name;
    int age;

    public University(String name, int age) {

        this.students = new ArrayList<>();
        this.age = age;
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double gr) {
        //TODO:
        for (Student s : students
             ) {
            if(Double.compare(s.getAverageGrade(), gr) == 0) {
                return s;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        Student t = students.get(0);
        for (Student k : students
             ) {
            if(k.getAverageGrade() > t.getAverageGrade()) t = k;
        }
        return t;
    }

    public Student getStudentWithMinAverageGrade() {

        List<Student> temp = this.getStudents();
        Student t = temp.get(0);
        double min = t.getAverageGrade();
        for (Student k : temp
                ) {

            if(k.getAverageGrade() < min) t = k;
        }
        return t;
    }

    public void expel(Student student){

        if (student != null && students.contains(student))
            students.remove(student);
    }
}