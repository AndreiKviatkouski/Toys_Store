package my_diploma_work.controller.converter;

import my_diploma_work.domain.toys.Format;
import my_diploma_work.domain.toys.StatusToy;
import org.springframework.core.convert.converter.Converter;

public class StringToFormatConverter implements Converter<String, Format> {
    @Override
    public Format convert(String s) {
        return Format.valueOf(s);
    }
}
