package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaService {

    int sum(int sum1, int sum2);
    int subtraction(int subs1, int subs2);
    int multiplication(int mult1, int mult2);
    int division(int div1, int div2);
    List<UserDO> getAllUsers();
}
