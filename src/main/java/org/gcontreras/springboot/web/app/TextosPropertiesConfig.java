package org.gcontreras.springboot.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Agregando otros archivos properties personalizados para los textos
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:textos.properties")
})
public class TextosPropertiesConfig {
}
