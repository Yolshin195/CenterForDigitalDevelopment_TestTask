package ru.yolshin.CenterForDigitalDevelopment_TestTask.restController;

import ru.yolshin.CenterForDigitalDevelopment_TestTask.entity.News;
import ru.yolshin.CenterForDigitalDevelopment_TestTask.repository.NewsRepository;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
public class NewsController {

  NewsRepository repository;
  
  public NewsController(NewsRepository newsRepository) {
    this.repository = newsRepository; 
  }

  @GetMapping("/api/news/details")
  public List<News> getAll() {
    return repository.findAll();
  }

} 
