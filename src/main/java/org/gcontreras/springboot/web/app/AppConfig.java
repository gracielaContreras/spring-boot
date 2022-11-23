package org.gcontreras.springboot.web.app;

import org.gcontreras.springboot.web.app.domain.ItemFactura;
import org.gcontreras.springboot.web.app.domain.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara Zony", 100);
        Producto producto2 = new Producto("Bicicleta", 200);

        ItemFactura factura1 = new ItemFactura(producto1, 2);
        ItemFactura factura2 = new ItemFactura(producto2, 4);

        return Arrays.asList(factura1, factura2);
    }
    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Monitor LG", 250);
        Producto producto2 = new Producto("Notebook Asus", 500);
        Producto producto3 = new Producto("Impresora HP Muntifuncional", 80);
        Producto producto4 = new Producto("Escritorio Oficina", 300);

        ItemFactura factura1 = new ItemFactura(producto1, 2);
        ItemFactura factura2 = new ItemFactura(producto2, 1);
        ItemFactura factura3 = new ItemFactura(producto3, 1);
        ItemFactura factura4 = new ItemFactura(producto4, 1);

        return Arrays.asList(factura1, factura2, factura3, factura4);
    }
}
