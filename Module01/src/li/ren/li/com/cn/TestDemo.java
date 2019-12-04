package li.ren.li.com.cn;

public class TestDemo {
    public static void main(String[] args) {
        // 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
        /********* begin *********/
        Student s = new Student("哈佛大学");
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
    /********* end *********/
}

class Student extends Person {
    /********* begin *********/
    public String school;
    public Student(String school){
        super("张三",18);
        //super.Person("张三",18);
        this.school = school;
        System.out.println("姓名："+super.name+"，年龄："+super.age+"，学校："+this.school);
    }
    /********* end *********/
}
