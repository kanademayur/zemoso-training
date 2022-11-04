package dip;

public class EnglishTeacher implements NormalSchool{
    @Override
    public void Teaching() {
        System.out.println("Teach English");
    }

    @Override
    public void Test() {
        System.out.println("Test ABCD...");

    }

    @Override
    public void QA() {
        System.out.println("English Q&A Time");

    }
}
