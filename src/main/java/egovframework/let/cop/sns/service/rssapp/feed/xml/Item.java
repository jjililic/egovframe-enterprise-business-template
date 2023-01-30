package egovframework.let.cop.sns.service.rssapp.feed.xml;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class Item { 

	@XmlElement(name = "title")
	String Title;

	@XmlElement(name = "description")
	String Description;

	@XmlElement(name = "link")
	String Link;

	@XmlElement(name = "guid")
	Guid Guid;

	@XmlElement(name = "creator")
	String Creator;

	@XmlElement(name = "pubDate")
	Date PubDate;

	@XmlElement(name = "enclosure")
	Enclosure Enclosure;

	@XmlElement(name = "content")
	Content Content;

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

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}

	public Guid getGuid() {
		return Guid;
	}

	public void setGuid(Guid guid) {
		Guid = guid;
	}

	public String getCreator() {
		return Creator;
	}

	public void setCreator(String creator) {
		Creator = creator;
	}

	public Date getPubDate() {
		return PubDate;
	}

	public void setPubDate(Date pubDate) {
		PubDate = pubDate;
	}

	public Enclosure getEnclosure() {
		return Enclosure;
	}

	public void setEnclosure(Enclosure enclosure) {
		Enclosure = enclosure;
	}

	public Content getContent() {
		return Content;
	}

	public void setContent(Content content) {
		Content = content;
	}
	
}
