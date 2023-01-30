package egovframework.let.cop.sns.service.impl;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import egovframework.let.cop.sns.service.RssAppService;
import egovframework.let.cop.sns.service.rssapp.feed.xml.Rss;

@Service("RssAppService")
public class RssAppServiceImpl implements RssAppService {

	@Override
	public Rss getRss(URI uri) {
		
		Rss rss = null;
		
		try {
			RestTemplate restTemplate = new RestTemplate();			
			rss = restTemplate.getForObject(uri, Rss.class);
		} catch (Exception e) {
			e.getMessage();
		}
		
		return rss;
	}
	
}
