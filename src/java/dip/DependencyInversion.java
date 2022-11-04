package dip;

public class DependencyInversion {
    public static void main (String[] args) {
        NormalSchool Math = new MathTeacher();
        NormalSchool Java = new JavaTeacher();
        NormalSchool English = new EnglishTeacher();

        ClassRoom room1 = new ClassRoom(Math);
        ClassRoom room2 = new ClassRoom(Java);
        ClassRoom room3 = new ClassRoom(English);

        room1.ClassTeaching();
        room2.ClassTest();
        room3.ClassQA();

    }
}
