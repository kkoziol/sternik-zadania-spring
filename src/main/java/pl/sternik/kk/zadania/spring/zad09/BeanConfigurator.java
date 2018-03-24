package pl.sternik.kk.zadania.spring.zad09;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import pl.sternik.kk.zadania.spring.zad01.MyFirstBean;
import pl.sternik.kk.zadania.spring.zad02.MySecondBean;
import pl.sternik.kk.zadania.spring.zad03.MyThirdBean;

public class BeanConfigurator {

	public MySecondBean myDrugi() {
		return new MySecondBean();
	}

	public MySecondBean myDrugiNazwany() {
		MySecondBean t = new MySecondBean();
		t.setName("Tralal ala");
		return t;
	}
	public MyThirdBean mySkomplikowany() {
        return new MyThirdBean("skomplikowany");
	}
}
