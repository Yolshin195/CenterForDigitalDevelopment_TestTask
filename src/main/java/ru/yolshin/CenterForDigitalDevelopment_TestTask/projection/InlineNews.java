package ru.yolshin.CenterForDigitalDevelopment_TestTask.projection;

import ru.yolshin.CenterForDigitalDevelopment_TestTask.entity.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="inlineNews", types={News.class})
public interface InlineNews {
  String getTitle();
  String getShortDescription();
  String getDescription();
  NewsType getNewsType();
}
