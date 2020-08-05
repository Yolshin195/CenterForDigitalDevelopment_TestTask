package ru.yolshin.CenterForDigitalDevelopment_TestTask.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

import ru.yolshin.CenterForDigitalDevelopment_TestTask.entity.News;
import ru.yolshin.CenterForDigitalDevelopment_TestTask.projection.InlineNews;

@RepositoryRestResource(excerptProjection=InlineNews.class)
public interface NewsRepository extends JpaRepository<News, Long> {

  List<News> findByTitle(@Param("title") String title);

}
