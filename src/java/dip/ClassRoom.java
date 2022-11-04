package dip;

public class ClassRoom {
    NormalSchool teacher;
    public ClassRoom(NormalSchool teacher){
        this.teacher=teacher;
    }
    public void ClassTeaching() {
        teacher.Teaching();
    }
    public  void ClassTest() {
        teacher.Test();
    }
    public void ClassQA() {
        teacher.QA();
    }
}
