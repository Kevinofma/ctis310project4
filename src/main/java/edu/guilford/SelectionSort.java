package edu.guilford;

public class SelectionSort {
    // Use selection sort to sort the array of students by studentid
    public static void selectionSortId(Students[] students) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // set the current index to the minimum index
            int minIndex = i;
            // loop through the array of students starting at the next index
            for (int j = i + 1; j < students.length; j++) {
                // if the studentid at the current index is less than the studentid at the minimum index
                if (students[j].getStudentid() < students[minIndex].getStudentid()) {
                    // set the minimum index to the current index
                    minIndex = j;
                }
            }
            // swap the student at the current index with the student at the minimum index
            Students temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
    }

    // Use selection sort to sort the array of students by age
    public static void selectionSortAge(Students[] students) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // set the current index to the minimum index
            int minIndex = i;
            // loop through the array of students starting at the next index
            for (int j = i + 1; j < students.length; j++) {
                // if the age at the current index is less than the age at the minimum index
                if (students[j].getAge() < students[minIndex].getAge()) {
                    // set the minimum index to the current index
                    minIndex = j;
                }
            }
            // swap the student at the current index with the student at the minimum index
            Students temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
    }

    // Use selection sort to sort the array of students by last name
    public static void selectionSortLastName(Students[] students) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // set the current index to the minimum index
            int minIndex = i;
            // loop through the array of students starting at the next index
            for (int j = i + 1; j < students.length; j++) {
                // if the last name at the current index is less than the last name at the minimum index
                if (students[j].getLastName().compareTo(students[minIndex].getLastName()) < 0) {
                    // set the minimum index to the current index
                    minIndex = j;
                }
            }
            // swap the student at the current index with the student at the minimum index
            Students temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
    }

    // Use selection sort to sort the array of students by first name
    public static void selectionSortFirstName(Students[] students) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // set the current index to the minimum index
            int minIndex = i;
            // loop through the array of students starting at the next index
            for (int j = i + 1; j < students.length; j++) {
                // if the first name at the current index is less than the first name at the minimum index
                if (students[j].getFirstName().compareTo(students[minIndex].getFirstName()) < 0) {
                    // set the minimum index to the current index
                    minIndex = j;
                }
            }
            // swap the student at the current index with the student at the minimum index
            Students temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
    }

    // Use selection sort to sort the array of students by major
    public static void selectionSortMajor(Students[] students) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // set the current index to the minimum index
            int minIndex = i;
            // loop through the array of students starting at the next index
            for (int j = i + 1; j < students.length; j++) {
                // if the major at the current index is less than the major at the minimum index
                if (students[j].getMajor().compareTo(students[minIndex].getMajor()) < 0) {
                    // set the minimum index to the current index
                    minIndex = j;
                }
            }
            // swap the student at the current index with the student at the minimum index
            Students temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
    }

    

}
