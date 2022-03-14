package main.java.com.rls.面向对象06;

/*
 * 构造方法：用于给对象的数据进行初始化
 *
 * 格式：
 * 		方法名和类名相同
 * 		没有返回值类型，连void都不能写
 * 		没有具体的返回值
 *
 * 构造方法的注意事项：
 * 		A:如果我们没有给出构造方法，系统将给出一个默认的无参数构造方法供我们使用
 * 		B:如果我们给出了构造方法，系统将不再提供默认的构造方法供我们使用。
 * 			这个时候，我们如果还想使用无参数构造方法，就必须自己提供。
 * 			我们推荐：自己给出无参数构造方法。
 * 		C:构造方法也是可以重载的。
 *
 * 给成员变量赋值的方式：
 * 		A:通过setXxx()
 * 		B:通过构造方法
 */

/*
 * 直接使用对象名访问成员变量，会存在数据的安全问题
 * 这个时候，我们就应该思考能不能让外界不要直接访问成员变量?
 * 能
 * 如何实现呢?
 * 		用private关键字
 * private:
 * 		是一个修饰符
 * 		可以修饰成员变量，也可以修饰成员方法
 * 		被private修饰的成员只能在本类中被访问
 *
 * 针对被private修饰的成员变量，我们会相应的给出getXxx()和setXxx()用于获取和设置成员变量的值，
 * 方法用public修饰
 */


/*
 * 学生类
 *
 * 目前代码中的n和a没有做到见名知意，需要改进。
 *
 * 如果局部变量名称和成员变量名称一致，在方法中使用的时候采用的是就近原则。
 *
 * 我们有没有办法把局部变量的name赋值给成员变量的name呢?
 * 有
 *
 * 有什么办法呢?
 * 		用this关键字就可以解决这个问题
 *
 * this:代表所在类的对象引用
 * 		方法被哪个对象调用，this就代表谁。
 *
 * 使用场景：
 * 		就是用于解决成员变量被隐藏的问题。
 */

/*
 * 标准的学生类
 */
public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法
    public Student() {}

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
