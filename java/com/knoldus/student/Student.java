package com.knoldus.student;
    public class Student {
        private String name;
        private static int TotalNumOfStudents = 0;
        public Student(String name) {
            this.name = name;
            TotalNumOfStudents++;
        }
        public static int getTotalNumOfStudents() {
            return TotalNumOfStudents;
        }
        public static void main(String[]args) {
        Student s1 = new Student("Vishwa");
        Student s2 = new Student("Reyansh");
        Student s3 = new Student("Vibha");
        System.out.println("Total number of students enrolled in a course are: " +Student.TotalNumOfStudents);

        }
}
