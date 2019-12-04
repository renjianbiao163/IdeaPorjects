package li.ren;

public class JavaDemo {
    public static void main(String args[]) {
        // 实例化一个Cat对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Cat cat = new Cat();
        cat.setName("大花猫");
        cat.setAge(6);
        cat.voice();
        cat.eat();
        /********* end *********/

        // 实例化一个Dog对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Dog dog = new Dog();
        dog.setName("大黑狗");
        dog.setAge(8);
        dog.voice();
        dog.eat();
        /********* end *********/

    }
}

class Animal {
    /********* begin *********/
    public String name;
    public int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    /********* end *********/

}

class Cat extends Animal {
    // 定义Cat类的voice()和eat()方法
    /********* begin *********/
    public void voice(){
        System.out.println(name+"喵喵叫");

    }
    public void eat(){
        System.out.println(name+"吃鱼");
        System.out.println(name+age+"岁");
    }
    /********* end *********/
}

class Dog extends Animal {
    // 定义Dog类的voice()和eat()方法
    /********* begin *********/
    public void voice(){
        System.out.println(name+"汪汪叫");

    }
    public void eat(){
        System.out.println(name+"吃骨头");
        System.out.println(name+age+"岁");
    }
    /********* end *********/
}