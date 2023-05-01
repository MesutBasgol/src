package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = {"1234","Mesut","Basgol","B22","5303309321"};
        String[] student2 = {"1154","Ilker","Zorlu","B22","5322405038"};
        System.out.println("Student1 id = \t\t\t" + student1[0]);
        System.out.println("Student1 first name = \t" + student1[1]);
        System.out.println("Student1 last name = \t" + student1[2]);
        System.out.println("Student1 batch num = \t" + student1[3]);
        System.out.println("Student1 mobile num = \t" + student1[4]);
        System.out.println("student1 data length: " + student1.length);

        String[] student3 = new String[5];

        student3[0] = "2589";
        student3[1] = "Ahmet";
        student3[2] = "Tosun";
        student3[3] = "B22";
        student3[4] = "5356856987";

        System.out.println("student3 data length: " + student3.length);
        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        }else {
            System.out.println("FAIL: data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        }else {
            System.out.println("FAIL: data arrays length mismatch");
        }
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
    }
}
