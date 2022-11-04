package dip;

public class MathTeacher implements NormalSchool{
    @Override
    public void Teaching() {
        System.out.println("Teach Math");
    }

    @Override
    public void Test() {
        System.out.println("Test 1+2 = ?");

    }

    @Override
    public void QA() {
        System.out.println("Math Q&A Time");

    }
}
