package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.IbecaFacade;
import mx.com.axity.services.service.IbecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class becaFacade implements IbecaFacade {

    @Autowired
    private IbecaService becaService;

    public List<UserTO> getAllUsers() {
        return this.becaService.getUsers();
    }

    @Override
    public int operation(int a, int b) {
        int c = this.becaService.sum(a,b);
        b = this.becaService.subtraction(c, a);
        int d = this.becaService.multiplication(b,4);
        return this.becaService.division(d,4);
    }
}
