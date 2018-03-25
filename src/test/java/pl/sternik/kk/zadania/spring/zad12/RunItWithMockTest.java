package pl.sternik.kk.zadania.spring.zad12;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles({"QA-env", "mock"})
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class RunItWithMockTest {

    @Autowired
    RunIt sut;
    
    @Test
    public void testName() throws Exception {
        
        System.out.println(sut.bean.getName());
        
    }
    
}