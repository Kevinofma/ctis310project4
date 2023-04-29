package edu.guilford;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // create a keyboard scanner object and ask the user for the number of students
        long startTime = System.nanoTime();
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println("How many students do you want to create? (Minimum is 10)");
        // store the number of students in a variable
        int numStudents = keyboard.nextInt();
        // close the keyboard scanner object
        keyboard.close();

        // create an array of students using the number of students variable
        Students[] students = Students.createRandomStudents(numStudents);
        System.out.println("\nUnsorted array of students");
        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }

        // shuffle the array
        shuffle(students);
        // sort the array of students by studentid using the selectionSort method
        SelectionSort.selectionSortId(students);
        System.out.println("\nSorted array of students by studentid");

        long endTime = System.nanoTime();
        long durationSelectionId = endTime - startTime;
        System.out.println("Selection sort took " + (durationSelectionId / 1.e6) + " milliseconds");

        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }
        
        // use linear search to find a random studentid
        int randomId = 4616258;
        startTime = System.nanoTime();
        int index = LinearSearch.linearSearchId(students, randomId);
        endTime = System.nanoTime();
        long durationLinearId = endTime - startTime;
        System.out.println("Linear search took " + (durationLinearId / 1.e6) + " milliseconds");
        if (index == -1) {
            System.out.println("Linear search did not find " + randomId);
        } else {
            System.out.println("Linear search found " + randomId + " at index " + index);
        }

        // use binary search to find a random studentid
        startTime = System.nanoTime();
        index = BinarySearch.binarySearchId(students, randomId);
        endTime = System.nanoTime();
        long durationBinaryId = endTime - startTime;
        System.out.println("Binary search took " + (durationBinaryId / 1.e6) + " milliseconds");
        if (index == -1) {
            System.out.println("Binary search did not find " + randomId);
        } else {
            System.out.println("Binary search found " + randomId + " at index " + index);
        }


        // shuffle the array
        shuffle(students);
        // sort the array of students by age using the selectionSortAge method
        SelectionSort.selectionSortAge(students);
        System.out.println("\nSorted array of students by age");

        endTime = System.nanoTime();
        long durationSelectionAge = endTime - startTime;
        System.out.println("Selection sort took " + (durationSelectionAge / 1.e6) + " milliseconds");

        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }

        // use linear search to find a random age
        int randomAge = 20;
        startTime = System.nanoTime(); 
        index = LinearSearch.linearSearchAge(students, randomAge);
        endTime = System.nanoTime();
        long durationLinearAge = endTime - startTime;
        System.out.println("Linear search took " + (durationLinearAge / 1.e6) + " milliseconds");
        if (index == -1) {
            System.out.println("Linear search did not find " + randomAge);
        } else {
            System.out.println("Linear search found " + randomAge + " at index " + index);
        }

        // use binary search to find a random age
        startTime = System.nanoTime();
        index = BinarySearch.binarySearchAge(students, randomAge);
        endTime = System.nanoTime();
        long durationBinaryAge = endTime - startTime;
        System.out.println("Binary search took " + (durationBinaryAge / 1.e6) + " milliseconds");
        if (index == -1) {
            System.out.println("Binary search did not find " + randomAge);
        } else {
            System.out.println("Binary search found " + randomAge + " at index " + index);
        }



        // shuffle the array
        shuffle(students);
        // sort the array of students by last name using the selectionSortLastName
        // method
        SelectionSort.selectionSortLastName(students);
        System.out.println("\nSorted array of students by last name");

        endTime = System.nanoTime();
        long durationSelectionLastName = endTime - startTime;
        System.out.println("Selection sort took " + (durationSelectionLastName / 1.e6) + " milliseconds");

        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }

        // use linear search to find a random last name
        String randomLastName = "Smith";
        startTime = System.nanoTime();
        index = LinearSearch.linearSearchLastName(students, randomLastName);
        endTime = System.nanoTime();
        long durationLinearLastName = endTime - startTime;
        System.out.println("Linear search took " + (durationLinearLastName / 1.e6) + " milliseconds");
        if (index == -1) {
            System.out.println("Linear search did not find " + randomLastName);
        } else {
            System.out.println("Linear search found " + randomLastName + " at index " + index);
        }
        
        // use binary search to find a random last name
        startTime = System.nanoTime();
        index = BinarySearch.binarySearchLastName(students, randomLastName);
        endTime = System.nanoTime();
        long durationBinaryLastName = endTime - startTime;
        System.out.println("Binary search took " + (durationBinaryLastName / 1.e6) + " milliseconds");
        if (index == -1) {
            System.out.println("Binary search did not find " + randomLastName);
        } else {
            System.out.println("Binary search found " + randomLastName + " at index " + index);
        }

        // shuffle the array
        shuffle(students);
        // sort the array of students by first name using the selectionSortFirstName
        // method
        SelectionSort.selectionSortFirstName(students);
        System.out.println("\nSorted array of students by first name");

        endTime = System.nanoTime();
        long durationSelectionFirstName = endTime - startTime;
        System.out.println("Selection sort took " + (durationSelectionFirstName / 1.e6) + " milliseconds");

        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }

        // use linear search to find a random first name
        String randomFirstName = "John";
        startTime = System.nanoTime();
        index = LinearSearch.linearSearchFirstName(students, randomFirstName);
        endTime = System.nanoTime();
        long durationLinearFirstName = endTime - startTime;
        System.out.println("Linear search took " + (durationLinearFirstName / 1.e6) + " milliseconds");
        if (index == -1) {
            System.out.println("Linear search did not find " + randomFirstName);
        } else {
            System.out.println("Linear search found " + randomFirstName + " at index " + index);
        }

        // use binary search to find a random first name
        startTime = System.nanoTime();
        index = BinarySearch.binarySearchFirstName(students, randomFirstName);
        endTime = System.nanoTime();
        long durationBinaryFirstName = endTime - startTime;
        System.out.println("Binary search took " + (durationBinaryFirstName / 1.e6) + " milliseconds");
        if (index == -1) {
            System.out.println("Binary search did not find " + randomFirstName);
        } else {
            System.out.println("Binary search found " + randomFirstName + " at index " + index);
        }


        // shuffle the array
        shuffle(students);
        // sort the array of students by major using the selectionSortMajor method
        SelectionSort.selectionSortMajor(students);
        System.out.println("\nSorted array of students by major");

        endTime = System.nanoTime();
        long durationSelectionMajor = endTime - startTime;
        System.out.println("Selection sort took " + (durationSelectionMajor / 1.e6) + " milliseconds");

        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }

        // use linear search to find a random major
        String randomMajor = "Computer Science";
        startTime = System.nanoTime();
        index = LinearSearch.linearSearchMajor(students, randomMajor);
        endTime = System.nanoTime();
        long durationLinearMajor = endTime - startTime;
        System.out.println("Linear search took " + (durationLinearMajor / 1.e6) + " milliseconds");
        if (index == -1) {
            System.out.println("Linear search did not find " + randomMajor);
        } else {
            System.out.println("Linear search found " + randomMajor + " at index " + index);
        }

        // use binary search to find a random major
        startTime = System.nanoTime();
        index = BinarySearch.binarySearchMajor(students, randomMajor);
        endTime = System.nanoTime();
        long durationBinaryMajor = endTime - startTime;
        System.out.println("Binary search took " + (durationBinaryMajor / 1.e6) + " milliseconds");
        if (index == -1) {
            System.out.println("Binary search did not find " + randomMajor);
        } else {
            System.out.println("Binary search found " + randomMajor + " at index " + index);
        }

        // shuffle the array
        shuffle(students);
        // sort the array of students by studentid using the quickSortId method
        QuickSort.quickSortId(students, 0, students.length - 1);
        System.out.println("\nSorted array of students by studentid");

        endTime = System.nanoTime();
        long durationQuickId = endTime - startTime;
        System.out.println("Quick sort took " + (durationQuickId / 1.e6) + " milliseconds");

        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }

        // shuffle the array
        shuffle(students);
        // sort the array of students by age using the quickSortAge method
        QuickSort.quickSortAge(students, 0, students.length - 1);
        System.out.println("\nSorted array of students by age");

        endTime = System.nanoTime();
        long durationQuickAge = endTime - startTime;
        System.out.println("Quick sort took " + (durationQuickAge / 1.e6) + " milliseconds");

        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }

        // shuffle the array
        shuffle(students);
        // sort the array of students by last name using the quickSortLastName method
        QuickSort.quickSortLastName(students, 0, students.length - 1);
        System.out.println("\nSorted array of students by last name");

        endTime = System.nanoTime();
        long durationQuickLastName = endTime - startTime;   
        System.out.println("Quick sort took " + (durationQuickLastName / 1.e6) + " milliseconds");

        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }

        // shuffle the array
        shuffle(students);
        // sort the array of students by first name using the quickSortFirstName
        // method
        QuickSort.quickSortFirstName(students, 0, students.length - 1);
        System.out.println("\nSorted array of students by first name");

        endTime = System.nanoTime();
        long durationQuickFirstName = endTime - startTime;
        System.out.println("Quick sort took " + (durationQuickFirstName / 1.e6) + " milliseconds");

        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }

        // shuffle the array
        shuffle(students);
        // sort the array of students by major using the quickSortMajor method
        QuickSort.quickSortMajor(students, 0, students.length - 1);
        System.out.println("\nSorted array of students by major");

        endTime = System.nanoTime();
        long durationQuickMajor = endTime - startTime;
        System.out.println("Quick sort took " + (durationQuickMajor / 1.e6) + " milliseconds");

        // print out the array of students
        for (Students student : students) {
            System.out.println(student);
        }

        

        // print all the durations
        System.out.println("\nSelection sort by studentid  took " + (durationSelectionId / 1.e6) + " milliseconds");
        System.out.println("Selection sort by age        took " + (durationSelectionAge / 1.e6) + " milliseconds");
        System.out.println("Selection sort by last name  took " + (durationSelectionLastName / 1.e6) + " milliseconds");
        System.out.println("Selection sort by first name took " + (durationSelectionFirstName / 1.e6) + " milliseconds");
        System.out.println("Selection sort by major      took " + (durationSelectionMajor / 1.e6) + " milliseconds");

        System.out.println("\nQuick sort by studentid  took " + (durationQuickId / 1.e6) + " milliseconds");
        System.out.println("Quick sort by age        took " + (durationQuickAge / 1.e6) + " milliseconds");
        System.out.println("Quick sort by last name  took " + (durationQuickLastName / 1.e6) + " milliseconds");
        System.out.println("Quick sort by first name took " + (durationQuickFirstName / 1.e6) + " milliseconds");
        System.out.println("Quick sort by major      took " + (durationQuickMajor / 1.e6) + " milliseconds");

        System.out.println("\nLinear search by studentid  took " + (durationLinearId / 1.e6) + " milliseconds");
        System.out.println("Linear search by age        took " + (durationLinearAge / 1.e6) + " milliseconds");
        System.out.println("Linear search by last name  took " + (durationLinearLastName / 1.e6) + " milliseconds");
        System.out.println("Linear search by first name took " + (durationLinearFirstName / 1.e6) + " milliseconds");
        System.out.println("Linear search by major      took " + (durationLinearMajor / 1.e6) + " milliseconds");

        System.out.println("\nBinary search by studentid  took " + (durationBinaryId / 1.e6) + " milliseconds");
        System.out.println("Binary search by age        took " + (durationBinaryAge / 1.e6) + " milliseconds");
        System.out.println("Binary search by last name  took " + (durationBinaryLastName / 1.e6) + " milliseconds");
        System.out.println("Binary search by first name took " + (durationBinaryFirstName / 1.e6) + " milliseconds");
        System.out.println("Binary search by major      took " + (durationBinaryMajor / 1.e6) + " milliseconds");
        
    }

    // create a method to shuffle the array
    public static void shuffle(Students[] students) {
        // loop through the array of students
        for (int i = 0; i < students.length; i++) {
            // generate a random index
            int randomIndex = (int) (Math.random() * students.length);
            // swap the student at the current index with the student at the random index
            Students temp = students[i];
            students[i] = students[randomIndex];
            students[randomIndex] = temp;
        }
    }
}
