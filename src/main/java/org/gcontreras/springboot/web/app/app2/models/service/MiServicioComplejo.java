package org.gcontreras.springboot.web.app.app2.models.service;

import org.springframework.stereotype.Service;

@Service("MiServicioComplejo")
public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion(){
        return "ejecutando un proceso importante complejo...";
    }
}
