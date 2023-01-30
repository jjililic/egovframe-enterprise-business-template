package egovframework.let.cop.sns.service;

import java.net.URI;

import egovframework.let.cop.sns.service.rssapp.feed.xml.Rss;

public interface RssAppService {

	Rss getRss(URI uri);
	
}
