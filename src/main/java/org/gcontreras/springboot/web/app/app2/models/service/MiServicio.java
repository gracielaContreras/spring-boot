package org.gcontreras.springboot.web.app.app2.models.service;

import org.springframework.stereotype.Service;

@Service("MiServicioSimple")
public class MiServicio implements IServicio{
    @Override
    public String operacion(){
        return "ejecutando un proceso importante simple...";
    }
}
