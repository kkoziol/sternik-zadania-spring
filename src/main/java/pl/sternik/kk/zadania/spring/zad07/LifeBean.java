package pl.sternik.kk.zadania.spring.zad07;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import pl.sternik.kk.zadania.spring.zad01.MyFirstBean;

@Component
@Lazy
public class LifeBean {

	@Autowired
	private MyFirstBean firstBean;

	public LifeBean() {
		try {
			System.out.println(firstBean.getName());
		} catch (NullPointerException e) {
			System.out.println("No jeszcze nie ma!");
		}
	}

	@PostConstruct
	public void setup() {
		System.out.println("po konstrukcji!");
		System.out.println("Teraz jest.." + firstBean.getName());
	}

	@PreDestroy
	public void clean() {
		System.out.println("sprzątam!");
	}

}
