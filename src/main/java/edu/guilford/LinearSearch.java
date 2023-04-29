package edu.guilford;

public class LinearSearch {
    // Use linear search to find the student with the given studentid
    // Return the index of the student with the given studentid
    // Return -1 if the student is not found
    public static int linearSearchId(Students[] students, int studentid) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // if the studentid at the current index is equal to the given studentid
            if (students[i].getStudentid() == studentid) {
                // return the current index
                return i;
            }
        }
        // return -1 if the student is not found
        return -1;
    }

    // Use linear search to find the student with the given age
    // Return the index of the student with the given age
    // Return -1 if the student is not found
    public static int linearSearchAge(Students[] students, int age) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // if the age at the current index is equal to the given age
            if (students[i].getAge() == age) {
                // return the current index
                return i;
            }
        }
        // return -1 if the student is not found
        return -1;
    }

    // Use linear search to find the student with the given last name
    // Return the index of the student with the given last name
    // Return -1 if the student is not found
    public static int linearSearchLastName(Students[] students, String lastName) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // if the last name at the current index is equal to the given last name
            if (students[i].getLastName().equals(lastName)) {
                // return the current index
                return i;
            }
        }
        // return -1 if the student is not found
        return -1;
    }

    // Use linear search to find the student with the given first name
    // Return the index of the student with the given first name
    // Return -1 if the student is not found
    public static int linearSearchFirstName(Students[] students, String firstName) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // if the first name at the current index is equal to the given first name
            if (students[i].getFirstName().equals(firstName)) {
                // return the current index
                return i;
            }
        }
        // return -1 if the student is not found
        return -1;
    }

    // Use linear search to find the student with the given major
    // Return the index of the student with the given major
    // Return -1 if the student is not found
    public static int linearSearchMajor(Students[] students, String major) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // if the major at the current index is equal to the given major
            if (students[i].getMajor().equals(major)) {
                // return the current index
                return i;
            }
        }
        // return -1 if the student is not found
        return -1;
    }
    
}
