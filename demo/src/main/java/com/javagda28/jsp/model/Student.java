package com.javagda28.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String indexNumber;
    private int age;
    private boolean suspended;

    public static class StudentBuilder{

        private String firstName;
        private String lastName;
        private String indexNumber;
        private int age;
        private boolean suspended;

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setIndexNumber(String indexNumber) {
            this.indexNumber = indexNumber;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setSuspended(boolean suspended) {
            this.suspended = suspended;
            return this;
        }

        public Student createStudent() {
            return new Student(firstName, lastName, indexNumber, age, suspended);
        }
    }

}
