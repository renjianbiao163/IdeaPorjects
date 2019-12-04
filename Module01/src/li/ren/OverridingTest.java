package li.ren;

/**
 * @author shkstart
 * @create 2019-12-02-16:03
 * @date 2019/12/2-16:03
 */
public class OverridingTest {
    public static void main(String[] args) {
        // 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
        /********* begin *********/
        Student s = new Student("哈佛大学");
        s.talk();
        /********* end *********/
    }
}

class Person {
    /********* begin *********/
    public String name;
    public int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void talk(){
        System.out.print("我是："+name+"，今年："+age+"岁，");
    }
    /********* end *********/
}

class Student extends Person {
    /********* begin *********/
    public String school;
    public Student(String school){
        super("张三",18);
        super.talk();
        this.school = school;
    }
    public void talk(){
        System.out.println("学校："+school);
    }
    /********* end *********/
}
