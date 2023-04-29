package edu.guilford;

public class Students {
    // attributes that describe a student
    private String firstName;
    private String lastName;
    private String major;
    private int age;
    private int studentid;

    // constructor
    public Students(String firstName, String lastName, String major, int age, int studentid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.age = age;
        this.studentid = studentid;
    }

    // getters and setters
    // getters and setters for first name and last name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        if (studentid >= 1000000 && studentid <= 9999999) {
            this.studentid = studentid;
        } else {
            System.out.println("Invalid student id");
        }
    }

    // toString method

    @Override

    public String toString() {
        return "Students{" +
                "name='" + firstName + " " + lastName + '\'' +
                ", major='" + major + '\'' +
                ", age=" + age +
                ", studentid=" + studentid +
                '}';
    }

 

    // create a method that generates an array of random students
    public static Students[] createRandomStudents(int numStudents) {
        // create an array of students
        Students[] students = new Students[numStudents];
        // create an array of names
        String[] firstName = { "John", "Jane", "Joe", "Jill", "Jack", "Jen", "Jim", "Jenny", "Jared", "Jasmine" };
        String[] lastName = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
                "Taylor" };
        // create an array of majors
        String[] majors = { "Math", "English", "Biology", "Chemistry", "Physics", "Computer Science", "Psychology",
                "Sociology", "History", "Philosophy" };
        // create an array of ages
        int[] ages = { 18, 19, 20, 21, 22, 23, 24, 25, 26, 27 };
        // create an array of randomly generated 7 digit student ids
        int[] studentids = createRandomStudentIds(numStudents);
        // loop through the array of students
        for (int i = 0; i < numStudents; i++) {
            // create a random number between 0 and 9
            int randomNumFirstName = (int) (Math.random() * 10);
            // create a random number between 0 and 9
            int randomNumLastName = (int) (Math.random() * 10);
            // create a random number between 0 and 9
            int randomNumMajor = (int) (Math.random() * 10);
            // create a random number between 0 and 9
            int randomNumAge = (int) (Math.random() * 10);
            // create a random number between 0 and 9
            int randomNumStudentId = (int) (Math.random() * 10);
            // create a random student
            Students student = new Students(firstName[randomNumFirstName], lastName[randomNumLastName],
                    majors[randomNumMajor], ages[randomNumAge], studentids[randomNumStudentId]);
            // add the student to the array of students
            students[i] = student;
        }
        // return the array of students
        return students;
    }

    // create a method that generates an array of random student ids
    public static int[] createRandomStudentIds(int numStudents) {
        // create an array of student ids
        int[] studentids = new int[numStudents];
        // loop through the array of student ids
        for (int i = 0; i < numStudents; i++) {
            // create a random number between 1000000 and 9999999
            int randomNum = (int) (Math.random() * 8999999) + 1000000;
            // add the random number to the array of student ids
            studentids[i] = randomNum;
        }
        // return the array of student ids
        return studentids;
    }

    
}
