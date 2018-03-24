package pl.sternik.kk.zadania.spring.zad12;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class RunIt {

    @Autowired
    MyProfilowyBean bean;

    @Autowired
    Environment environment;

    public void getActiveProfiles() {
        for (final String profileName : environment.getActiveProfiles()) {
            System.out.println("Currently active profile - " + profileName);
        }
    }

    public static void main(String[] args) throws IOException {

        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "QA-env");

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
         context.getEnvironment().setActiveProfiles("QA-env");
         context.refresh();//niestety trzeba odswiezyc
        System.out.println("-----------------------------------------------------------");
        RunIt obj = (RunIt) context.getBean("runIt");
        System.out.println(obj.bean.getName());

        obj.getActiveProfiles();

        context.close();
    }
}
