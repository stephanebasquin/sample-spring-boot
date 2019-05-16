package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}

@Test
public void plante_tout_le_temps(){
	assertTrue( false );
}

@Ignore
@Test
public void plante_tout_le_temps(){
	assertTrue( false );
}

public Integer additionner(Integer a, Integer b){
        Integer c;
        c=a+b;
        System.out.println("a = " + a + ", b = " + b);
	System.out.println("La somme vaut " + c); 
        return(c);
    } 

@Test
public void additionner_integer()
    {
        if (additionner(2,4)==5 ) {
        	assertTrue( true );
	}
	else {
		assertTrue( false );
		logger.fatal("This is fatal : La somme ne vaut pas 5" );
	}
}

