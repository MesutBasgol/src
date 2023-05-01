package day04_variables_intro;

public class DeclarationTypes {
    public static void main(String[] args){
        int bananas = 34;
        System.out.println(bananas);
        int students = 400;
        System.out.println(students);
        students = 401;
        System.out.println(students);

        int peopleInCity, birdsOnTree, fishInLake;
        peopleInCity = 1000;
        int öğrencisayısı = 100; // türkçe karakter de kabul ediyor.
        System.out.println(öğrencisayısı);
        birdsOnTree = 21;
        fishInLake = 100;
        System.err.println(peopleInCity);// hata değil, sadece rengini kırmızı yapıyor.
        System.out.println(birdsOnTree);
        System.err.println(fishInLake);

        int studentsInNY = 58, studentsInVA = 200;
        System.out.println(studentsInNY);
        System.out.println(studentsInVA);

    }
}
