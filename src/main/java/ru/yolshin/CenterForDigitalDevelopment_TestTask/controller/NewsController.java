package ru.yolshin.CenterForDigitalDevelopment_TestTask.controller;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.data.rest.webmvc.BasePathAwareController;

import java.util.List;

import ru.yolshin.CenterForDigitalDevelopment_TestTask.repository.NewsRepository;
import ru.yolshin.CenterForDigitalDevelopment_TestTask.entity.News;

@RepositoryRestController
//@BasePathAwareController
public class NewsController {

  private final NewsRepository repository;
  
  public NewsController(NewsRepository newsRepository) {
    this.repository = newsRepository;
  }

  //@RequestMapping(method = RequestMethod.GET, value = "/api/news/details")
  @GetMapping("/news/details")
  public ResponseEntity getDetails() {
  //public List<News> getDetails() {
    List<News> news = repository.findAll();
    return ResponseEntity.ok(news);

    //CollectionModel<News> resources = new CollectionModel<News>(news);

    //resources.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(NewsController.class).getDetails()).withSelfRel());

    ////return ResponseEntity.ok(resources);
    //return ResponseEntity.ok("rest");
  }

}
