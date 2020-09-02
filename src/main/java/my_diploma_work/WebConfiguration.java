package my_diploma_work;

import my_diploma_work.controller.converter.StringToFormatConverter;
import my_diploma_work.controller.converter.StringToStatusConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new StringToStatusConverter());
//        registry.addConverter(new StringToFormatConverter());
        // для кастомных конверторов по умолчанию работет и без
    }
}
