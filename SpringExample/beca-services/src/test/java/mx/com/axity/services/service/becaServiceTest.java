package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class becaServiceTest extends BaseTest {

    @Test
    public void exampleTest() {

        List<UserTO> users = this.becaService.getUsers();

        Assert.assertEquals(1, users.size());
    }

    @Test
    public void shouldReturnTheSumOfTwoNumbers(){
        int num1 = 5;
        int num2 = 10;
        int result = this.becaService.sum(num1, num2);
        Assert.assertEquals(15, result);
    }
    @Test
    public void shouldReturnTheSubstractionOfTwoNumbers(){
        int num1 = 10;
        int num2 = 5;
        int result = this.becaService.subtraction(num1, num2);
        Assert.assertEquals(5, result);
    }
    @Test
    public void shouldReturnTheMultiplicationOfTwoNumbers(){
        int num1 = 5;
        int num2 = 10;
        int result = this.becaService.multiplication(num1, num2);
        Assert.assertEquals(50, result);
    }
    @Test
    public void shouldReturnTheDivisionOfTwoNumbers(){
        int num1 = 10;
        int num2 = 5;
        int result = this.becaService.division(num1, num2);
        Assert.assertEquals(2, result);
    }
}
