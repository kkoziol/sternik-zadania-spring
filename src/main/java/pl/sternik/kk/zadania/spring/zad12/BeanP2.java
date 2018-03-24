package pl.sternik.kk.zadania.spring.zad12;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("QA-env")
public class BeanP2 implements MyProfilowyBean {

    public String getName() {
        return "Beanek Profil QA";
    }

    
    
}
