package edu.guilford;

public class BinarySearch {
    // Use binary search to find the student with the given studentid
    // Return the index of the student with the given studentid
    // Return -1 if the student is not found
    public static int binarySearchId(Students[] students, int studentid) {
        // set the low index to 0
        int low = 0;
        // set the high index to the length of the array of students minus 1
        int high = students.length - 1;
        // while the low index is less than or equal to the high index
        while (low <= high) {
            // set the middle index to the average of the low index and the high index
            int middle = (low + high) / 2;
            // if the studentid at the middle index is equal to the given studentid
            if (students[middle].getStudentid() == studentid) {
                // return the middle index
                return middle;
            }
            // if the studentid at the middle index is less than the given studentid
            if (students[middle].getStudentid() < studentid) {
                // set the low index to the middle index plus 1
                low = middle + 1;
            }
            // if the studentid at the middle index is greater than the given studentid
            if (students[middle].getStudentid() > studentid) {
                // set the high index to the middle index minus 1
                high = middle - 1;
            }
        }
        // return -1 if the student is not found
        return -1;
    }

    // Use binary search to find the student with the given age
    // Return the index of the student with the given age
    // Return -1 if the student is not found
    public static int binarySearchAge(Students[] students, int age) {
        // set the low index to 0
        int low = 0;
        // set the high index to the length of the array of students minus 1
        int high = students.length - 1;
        // while the low index is less than or equal to the high index
        while (low <= high) {
            // set the middle index to the average of the low index and the high index
            int middle = (low + high) / 2;
            // if the age at the middle index is equal to the given age
            if (students[middle].getAge() == age) {
                // return the middle index
                return middle;
            }
            // if the age at the middle index is less than the given age
            if (students[middle].getAge() < age) {
                // set the low index to the middle index plus 1
                low = middle + 1;
            }
            // if the age at the middle index is greater than the given age
            if (students[middle].getAge() > age) {
                // set the high index to the middle index minus 1
                high = middle - 1;
            }
        }
        // return -1 if the student is not found
        return -1;
    }

    // Use binary search to find the student with the given last name
    // Return the index of the student with the given last name
    // Return -1 if the student is not found
    public static int binarySearchLastName(Students[] students, String lastName) {
        // set the low index to 0
        int low = 0;
        // set the high index to the length of the array of students minus 1
        int high = students.length - 1;
        // while the low index is less than or equal to the high index
        while (low <= high) {
            // set the middle index to the average of the low index and the high index
            int middle = (low + high) / 2;
            // if the last name at the middle index is equal to the given last name
            if (students[middle].getLastName().equals(lastName)) {
                // return the middle index
                return middle;
            }
            // if the last name at the middle index is less than the given last name
            if (students[middle].getLastName().compareTo(lastName) < 0) {
                // set the low index to the middle index plus 1
                low = middle + 1;
            }
            // if the last name at the middle index is greater than the given last name
            if (students[middle].getLastName().compareTo(lastName) > 0) {
                // set the high index to the middle index minus 1
                high = middle - 1;
            }
        }
        // return -1 if the student is not found
        return -1;
    }

    // Use binary search to find the student with the given first name
    // Return the index of the student with the given first name
    // Return -1 if the student is not found
    public static int binarySearchFirstName(Students[] students, String firstName) {
        // set the low index to 0
        int low = 0;
        // set the high index to the length of the array of students minus 1
        int high = students.length - 1;
        // while the low index is less than or equal to the high index
        while (low <= high) {
            // set the middle index to the average of the low index and the high index
            int middle = (low + high) / 2;
            // if the first name at the middle index is equal to the given first name
            if (students[middle].getFirstName().equals(firstName)) {
                // return the middle index
                return middle;
            }
            // if the first name at the middle index is less than the given first name
            if (students[middle].getFirstName().compareTo(firstName) < 0) {
                // set the low index to the middle index plus 1
                low = middle + 1;
            }
            // if the first name at the middle index is greater than the given first name
            if (students[middle].getFirstName().compareTo(firstName) > 0) {
                // set the high index to the middle index minus 1
                high = middle - 1;
            }
        }
        // return -1 if the student is not found
        return -1;
    }

    // Use binary search to find the student with the given major
    // Return the index of the student with the given major
    // Return -1 if the student is not found
    public static int binarySearchMajor(Students[] students, String major) {
        // set the low index to 0
        int low = 0;
        // set the high index to the length of the array of students minus 1
        int high = students.length - 1;
        // while the low index is less than or equal to the high index
        while (low <= high) {
            // set the middle index to the average of the low index and the high index
            int middle = (low + high) / 2;
            // if the major at the middle index is equal to the given major
            if (students[middle].getMajor().equals(major)) {
                // return the middle index
                return middle;
            }
            // if the major at the middle index is less than the given major
            if (students[middle].getMajor().compareTo(major) < 0) {
                // set the low index to the middle index plus 1
                low = middle + 1;
            }
            // if the major at the middle index is greater than the given major
            if (students[middle].getMajor().compareTo(major) > 0) {
                // set the high index to the middle index minus 1
                high = middle - 1;
            }
        }
        // return -1 if the student is not found
        return -1;
    }

    

}
