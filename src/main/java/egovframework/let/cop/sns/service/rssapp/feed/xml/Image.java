package egovframework.let.cop.sns.service.rssapp.feed.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "image")
public class Image { 

	@XmlElement(name = "url")
	String Url;

	@XmlElement(name = "title")
	String Title;

	@XmlElement(name = "link")
	String Link;

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}

}
