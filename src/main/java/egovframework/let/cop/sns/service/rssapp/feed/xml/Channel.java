package egovframework.let.cop.sns.service.rssapp.feed.xml;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "channel")
public class Channel { 

	@XmlElement(name = "title")
	String Title;
	
	@XmlElement(name = "description")
	String Description;
	
	@XmlElement(name = "link")
	List<String> Link;
	
	@XmlElement(name = "image")
	Image Image;
	
	@XmlElement(name = "generator")
	String Generator;
	
	@XmlElement(name = "lastBuildDate")
	Date LastBuildDate;
	
	@XmlElement(name = "language")
	String Language;
	
	@XmlElement(name = "item")
	List<Item> Item;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public List<String> getLink() {
		return Link;
	}

	public void setLink(List<String> link) {
		Link = link;
	}

	public Image getImage() {
		return Image;
	}

	public void setImage(Image image) {
		Image = image;
	}

	public String getGenerator() {
		return Generator;
	}

	public void setGenerator(String generator) {
		Generator = generator;
	}

	public Date getLastBuildDate() {
		return LastBuildDate;
	}

	public void setLastBuildDate(Date lastBuildDate) {
		LastBuildDate = lastBuildDate;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public List<Item> getItem() {
		return Item;
	}

	public void setItem(List<Item> item) {
		Item = item;
	}
	
}
