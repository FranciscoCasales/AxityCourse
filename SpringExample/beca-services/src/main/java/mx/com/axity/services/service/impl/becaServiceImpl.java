package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.persistence.UserDAO;
import mx.com.axity.services.service.IbecaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Type;
import java.util.List;

@Service
public class becaServiceImpl implements IbecaService {

    static final Logger LOG = LogManager.getLogger(becaServiceImpl.class);

    @Autowired
    UserDAO userDAO;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public int sum(int sum1, int sum2) {
        return sum1+sum2;
    }

    @Override
    public int subtraction(int subs1, int subs2) {
        return subs1-subs2;
    }

    @Override
    public int multiplication(int mult1, int mult2) {
        return mult1*mult2;
    }

    @Override
    public int division(int div1, int div2) {
        return div1/div2;
    }

    @Override
    public List<UserDO> getAllUsers() {
        return (List<UserDO>) this.userDAO.findAll();
    }
}
