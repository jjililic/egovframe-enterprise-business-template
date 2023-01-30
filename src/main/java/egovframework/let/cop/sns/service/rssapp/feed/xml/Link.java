package egovframework.let.cop.sns.service.rssapp.feed.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "link")
public class Link { 

	@XmlElement(name = "href")
	String Href;

	@XmlElement(name = "rel")
	String Rel;

	@XmlElement(name = "type")
	String Type;

	public String getHref() {
		return Href;
	}

	public void setHref(String href) {
		Href = href;
	}

	public String getRel() {
		return Rel;
	}

	public void setRel(String rel) {
		Rel = rel;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
}
