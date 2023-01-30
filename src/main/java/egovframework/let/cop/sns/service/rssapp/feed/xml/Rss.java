package egovframework.let.cop.sns.service.rssapp.feed.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rss")
public class Rss {
	
	@XmlElement(name = "channel")
	Channel Channel;
	
	@XmlElement(name = "dc")
	String Dc;
	
	@XmlElement(name = "content")
	String Content;
	
	@XmlElement(name = "atom")
	String Atom;
	
	@XmlElement(name = "version")
	double Version;
	
	@XmlElement(name = "media")
	String Media;
	
	@XmlElement(name = "text")
	String Text;

	public Channel getChannel() {
		return Channel;
	}

	public void setChannel(Channel channel) {
		Channel = channel;
	}

	public String getDc() {
		return Dc;
	}

	public void setDc(String dc) {
		Dc = dc;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getAtom() {
		return Atom;
	}

	public void setAtom(String atom) {
		Atom = atom;
	}

	public double getVersion() {
		return Version;
	}

	public void setVersion(double version) {
		Version = version;
	}

	public String getMedia() {
		return Media;
	}

	public void setMedia(String media) {
		Media = media;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	@Override
	public String toString() {
		return "Rss [Channel=" + Channel + ", Dc=" + Dc + ", Content=" + Content + ", Atom=" + Atom + ", Version="
				+ Version + ", Media=" + Media + ", Text=" + Text + "]";
	}

}
