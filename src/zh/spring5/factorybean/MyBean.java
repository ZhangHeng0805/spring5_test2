package zh.spring5.factorybean;

import org.springframework.beans.factory.FactoryBean;
import zh.spring5.collectiontype.Course;

public class MyBean implements FactoryBean<Course> {

    //定义返回类型
    @Override
    public Course getObject() throws Exception {
        Course course=new Course();
        course.setCname("123");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
