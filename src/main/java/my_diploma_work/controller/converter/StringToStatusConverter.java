package my_diploma_work.controller.converter;

import my_diploma_work.domain.toys.StatusToy;
import org.springframework.core.convert.converter.Converter;

public class StringToStatusConverter implements Converter<String, StatusToy> {
    @Override
    public StatusToy convert(String s) {
        return StatusToy.valueOf(s);
    }
}
