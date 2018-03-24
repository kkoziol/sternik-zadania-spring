package pl.sternik.kk.zadania.spring.zad10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.sternik.kk.zadania.spring.zad02.MySecondBean;
import pl.sternik.kk.zadania.spring.zad03.MyThirdBean;
import pl.sternik.kk.zadania.spring.zad09.BeanConfigurator;

public class RunIt {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
	     new AnnotationConfigApplicationContext();
//	     new AnnotationConfigApplicationContext(AdditionalBeanConfigurator.class);
		 ctx.register(AdditionalBeanConfigurator.class);
		 ctx.register(BeanConfigurator.class);
		 ctx.refresh();

		System.out.println(ctx.getBean("myDrugiNazwany",MySecondBean.class).getName());
		System.out.println(ctx.getBean("getMyTrzeciNazwany",MyThirdBean.class).getCompoundName());

		ctx.close();
	}
}
