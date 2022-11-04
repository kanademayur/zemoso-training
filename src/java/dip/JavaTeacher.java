package dip;

public class JavaTeacher implements NormalSchool{
    @Override
    public void Teaching() {
        System.out.println("Teach Code");
    }

    @Override
    public void Test() {
        System.out.println("Test Program");

    }

    @Override
    public void QA() {
        System.out.println("Java Q&A Time");

    }
}
