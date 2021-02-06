package zh.spring5.testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zh.spring5.autowire.Emp;
import zh.spring5.bean.Orders;
import zh.spring5.collectiontype.Book;
import zh.spring5.collectiontype.Course;
import zh.spring5.collectiontype.Stu;
import zh.spring5.factorybean.MyBean;

public class TestSpring5_Demo1 {
/*    @Test
    public void testCollection1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu=context.getBean("stu",Stu.class);
        stu.print();
    }*/
    /*@Test
    public void testCollection2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Book book1=context.getBean("book",Book.class);
        Book book2=context.getBean("book",Book.class);
//        book.print();
        System.out.println(book1);
        System.out.println(book2);
    }*/
    /*@Test
    public void testCollection3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
        Course course=context.getBean("myBean", Course.class);
        System.out.println(course);
    }*/
    /*@Test//bean的生命周期
    public void testBean4(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders=context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);
        //手动让bean实例销毁
        ((ClassPathXmlApplicationContext)context).close();
    }*/
    @Test
    public void test4(){//xml自动装配
        ApplicationContext context=new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp=context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

}
