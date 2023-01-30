package egovframework.let.cop.sns.service.rssapp.feed.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "guid")
public class Guid { 

	@XmlElement(name = "isPermaLink")
	boolean IsPermaLink;

	@XmlElement(name = "text")
	String Text;

	public boolean isIsPermaLink() {
		return IsPermaLink;
	}

	public void setIsPermaLink(boolean isPermaLink) {
		IsPermaLink = isPermaLink;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

}
