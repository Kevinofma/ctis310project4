package edu.guilford;

public class QuickSort {
    // Use quick sort to sort the array of students by studentid
    public static void quickSortId(Students[] students, int low, int high) {
        // if the low index is less than the high index
        if (low < high) {
            // partition the array of students by studentid
            int partitionIndex = partitionId(students, low, high);
            // recursively call quickSortId on the left side of the partition
            quickSortId(students, low, partitionIndex - 1);
            // recursively call quickSortId on the right side of the partition
            quickSortId(students, partitionIndex + 1, high);
        }
    }

    // Use quick sort to sort the array of students by age
    public static void quickSortAge(Students[] students, int low, int high) {
        // if the low index is less than the high index
        if (low < high) {
            // partition the array of students by age
            int partitionIndex = partitionAge(students, low, high);
            // recursively call quickSortAge on the left side of the partition
            quickSortAge(students, low, partitionIndex - 1);
            // recursively call quickSortAge on the right side of the partition
            quickSortAge(students, partitionIndex + 1, high);
        }
    }

    // Use quick sort to sort the array of students by last name
    public static void quickSortLastName(Students[] students, int low, int high) {
        // if the low index is less than the high index
        if (low < high) {
            // partition the array of students by last name
            int partitionIndex = partitionLastName(students, low, high);
            // recursively call quickSortLastName on the left side of the partition
            quickSortLastName(students, low, partitionIndex - 1);
            // recursively call quickSortLastName on the right side of the partition
            quickSortLastName(students, partitionIndex + 1, high);
        }
    }

    // Use quick sort to sort the array of students by first name
    public static void quickSortFirstName(Students[] students, int low, int high) {
        // if the low index is less than the high index
        if (low < high) {
            // partition the array of students by first name
            int partitionIndex = partitionFirstName(students, low, high);
            // recursively call quickSortFirstName on the left side of the partition
            quickSortFirstName(students, low, partitionIndex - 1);
            // recursively call quickSortFirstName on the right side of the partition
            quickSortFirstName(students, partitionIndex + 1, high);
        }
    }

    // Use quick sort to sort the array of students by major
    public static void quickSortMajor(Students[] students, int low, int high) {
        // if the low index is less than the high index
        if (low < high) {
            // partition the array of students by major
            int partitionIndex = partitionMajor(students, low, high);
            // recursively call quickSortMajor on the left side of the partition
            quickSortMajor(students, low, partitionIndex - 1);
            // recursively call quickSortMajor on the right side of the partition
            quickSortMajor(students, partitionIndex + 1, high);
        }
    }

    // partition the array of students by studentid
    public static int partitionId(Students[] students, int low, int high) {
        // set the pivot to the studentid at the high index
        int pivot = students[high].getStudentid();
        // set the index of the smaller element to the low index minus 1
        int i = low - 1;
        // loop through the array of students from the low index to the high index
        for (int j = low; j < high; j++) {
            // if the studentid at the current index is less than the pivot
            if (students[j].getStudentid() < pivot) {
                // increment the index of the smaller element
                i++;
                // swap the student at the current index with the student at the index of the smaller element
                Students temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        // swap the student at the index of the smaller element plus 1 with the student at the high index
        Students temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        // return the index of the smaller element plus 1
        return i + 1;
    }

    // partition the array of students by age
    public static int partitionAge(Students[] students, int low, int high) {
        // set the pivot to the age at the high index
        int pivot = students[high].getAge();
        // set the index of the smaller element to the low index minus 1
        int i = low - 1;
        // loop through the array of students from the low index to the high index
        for (int j = low; j < high; j++) {
            // if the age at the current index is less than the pivot
            if (students[j].getAge() < pivot) {
                // increment the index of the smaller element
                i++;
                // swap the student at the current index with the student at the index of the smaller element
                Students temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        // swap the student at the index of the smaller element plus 1 with the student at the high index
        Students temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        // return the index of the smaller element plus 1
        return i + 1;
    }

    // partition the array of students by last name
    public static int partitionLastName(Students[] students, int low, int high) {
        // set the pivot to the last name at the high index
        String pivot = students[high].getLastName();
        // set the index of the smaller element to the low index minus 1
        int i = low - 1;
        // loop through the array of students from the low index to the high index
        for (int j = low; j < high; j++) {
            // if the last name at the current index is less than the pivot
            if (students[j].getLastName().compareTo(pivot) < 0) {
                // increment the index of the smaller element
                i++;
                // swap the student at the current index with the student at the index of the smaller element
                Students temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        // swap the student at the index of the smaller element plus 1 with the student at the high index
        Students temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        // return the index of the smaller element plus 1
        return i + 1;
    }

    // partition the array of students by first name
    public static int partitionFirstName(Students[] students, int low, int high) {
        // set the pivot to the first name at the high index
        String pivot = students[high].getFirstName();
        // set the index of the smaller element to the low index minus 1
        int i = low - 1;
        // loop through the array of students from the low index to the high index
        for (int j = low; j < high; j++) {
            // if the first name at the current index is less than the pivot
            if (students[j].getFirstName().compareTo(pivot) < 0) {
                // increment the index of the smaller element
                i++;
                // swap the student at the current index with the student at the index of the smaller element
                Students temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        // swap the student at the index of the smaller element plus 1 with the student at the high index
        Students temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        // return the index of the smaller element plus 1
        return i + 1;
    }

    // partition the array of students by major
    public static int partitionMajor(Students[] students, int low, int high) {
        // set the pivot to the major at the high index
        String pivot = students[high].getMajor();
        // set the index of the smaller element to the low index minus 1
        int i = low - 1;
        // loop through the array of students from the low index to the high index
        for (int j = low; j < high; j++) {
            // if the major at the current index is less than the pivot
            if (students[j].getMajor().compareTo(pivot) < 0) {
                // increment the index of the smaller element
                i++;
                // swap the student at the current index with the student at the index of the smaller element
                Students temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        // swap the student at the index of the smaller element plus 1 with the student at the high index
        Students temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        // return the index of the smaller element plus 1
        return i + 1;
    }

    


}
