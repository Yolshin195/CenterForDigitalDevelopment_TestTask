package ru.yolshin.CenterForDigitalDevelopment_TestTask.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.util.Set;
import lombok.ToString;

@Entity
@Table(name="news")
@ToString(exclude="newsType")
public class News {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;
  private String shortDescription;
  private String description;

  @ManyToOne
  private NewsType newsType;

  public News() {}

  public News(String title, String shortDescription, String description) {
    this.title            = title;
    this.description      = description;
    this.shortDescription = shortDescription;
  }

  public NewsType getNewsType() {
    return newsType;
  }

  public void setNewsType(NewsType newsType) {
    this.newsType = newsType;
  }

  public String getTitle() {
    return title;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return "\nNews: {\n"
      + "\ttitle = " + title + ", \n"
      + "\tshortDescription = " + shortDescription + ", \n"
      + "\tdescription = " + description + ", \n"
      + "\tnewsType = " + newsType.toString() + "\n"
      + "}";
  }
}
