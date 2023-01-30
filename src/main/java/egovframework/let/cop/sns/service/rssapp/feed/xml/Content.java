package egovframework.let.cop.sns.service.rssapp.feed.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "content")
public class Content { 

	@XmlElement(name = "medium")
	String Medium;

	@XmlElement(name = "url")
	String Url;

	public String getMedium() {
		return Medium;
	}

	public void setMedium(String medium) {
		Medium = medium;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}
