package ru.yolshin.CenterForDigitalDevelopment_TestTask.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

import ru.yolshin.CenterForDigitalDevelopment_TestTask.entity.NewsType;

@RepositoryRestResource(collectionResourceRel="newsType", path="newsType")
public interface NewsTypeRepository extends JpaRepository<NewsType, Long> {

  List<NewsType> findByTitle(@Param("title") String title);

}
