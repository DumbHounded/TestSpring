package xyz.incraft.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Михаил on 08.01.2016.
 *
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        List<String> list1 = (List<String>)context.getBean("llist");
        List<String> list2 = (List<String>)context.getBean("alist");

        list1.add("Hello");list1.add("world");
        list2.addAll(list1);

        for (String st : list1) {
            System.out.println("from list1 " + st);
        }
        for (String st : list2) {
            System.out.println("from list2 " + st);
        }

        System.out.println(list1.getClass().getSimpleName());
        System.out.println(list2.getClass().getSimpleName());

    }
}
