import model.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Jack",18,"男", "20150302");
        System.out.println("========== 初始化 ============");
        System.out.println("name="+student.getName());
        System.out.println("age="+student.getAge());
        System.out.println("sex="+student.getSex());
        System.out.println("number="+student.getNumber());
        student.setAge(22);
        student.setName("rose");
        student.setSex("女");
        student.setNumber("20150305");
        System.out.println("========== 修改后 ============");
        System.out.println("name="+student.getName());
        System.out.println("age="+student.getAge());
        System.out.println("sex="+student.getSex());
        System.out.println("number="+student.getNumber());
    }

}
