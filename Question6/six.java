public class six {
    public static void main(String[] args) {

        student[] students = new student[5];

        int[] m1 = { 87, 76, 65 };
        int[] m2 = { 90, 67, 62 };
        int[] m3 = { 54, 85, 50 };
        int[] m4 = { 92, 94, 88 };
        int[] m5 = { 78, 44, 82 };

        student s1 = new student("Akash", m1);
        student s2 = new student("Tom", m2);
        student s3 = new student("Hana", m3);
        student s4 = new student("Ime", m4);
        student s5 = new student("Moly", m5);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (student s : students) {
            System.out.println("Name: " + s.getName());
            s.getAverage();
        }
    }
}

class student {
    private String name;
    private int[] marks;

    public student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        System.out.println("Average Marks: " + average);
    }
}

// Output
// @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025/Question6 (main) $ javac student.java
// @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025/Question6 (main) $ java student
// @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025/Question6 (main) $ javac six.java
// @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025/Question6 (main) $ java six
// Name: Akash
// Average Marks: 76.0
// Name: Tom
// Average Marks: 73.0
// Name: Hana
// Average Marks: 63.0
// Name: Ime
// Average Marks: 91.33333333333333
// Name: Moly
// Average Marks: 68.0