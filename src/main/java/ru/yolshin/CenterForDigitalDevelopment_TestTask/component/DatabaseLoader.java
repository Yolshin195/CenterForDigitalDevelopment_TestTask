package ru.yolshin.CenterForDigitalDevelopment_TestTask.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ru.yolshin.CenterForDigitalDevelopment_TestTask.repository.*;
import ru.yolshin.CenterForDigitalDevelopment_TestTask.entity.*;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final NewsRepository newsRepository;
	private final NewsTypeRepository newsTypeRepository;

	@Autowired
	public DatabaseLoader(NewsRepository newsRepository, 
                        NewsTypeRepository newsTypeRepository) 
  {
		this.newsRepository = newsRepository;
		this.newsTypeRepository = newsTypeRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
    var success = newsTypeRepository.save(new NewsType("success", "green"));
    var danger  = newsTypeRepository.save(new NewsType("danger", "red"));

    News news1 = new News(
      "First news", 
      "Short description news...",
      "Description news"
    );
    news1.setNewsType(success);

    newsRepository.save(news1);

	}
}
