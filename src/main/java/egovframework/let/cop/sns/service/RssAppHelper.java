package egovframework.let.cop.sns.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import egovframework.let.cop.sns.service.rssapp.feed.xml.Channel;
import egovframework.let.cop.sns.service.rssapp.feed.xml.Item;
import egovframework.let.cop.sns.service.rssapp.feed.xml.Rss;

public class RssAppHelper {

	@Resource(name = "RssAppService")
	private RssAppService rssAppService;
	
	public List<SnsPost> getSnsPost(URI uri) {
		
		List<SnsPost> snsPosts = new ArrayList<SnsPost>();
				
		try {
			Rss rss = rssAppService.getRss(uri);
			
			if(rss != null) {
				List<Item> items = null;
				items = rss.getChannel() != null ? rss.getChannel().getItem() : null;
				for(int i=0; items != null && i < items.size(); i++) {
					Item item = items.get(i);
					
					SnsPost snsPost = new SnsPost();
					snsPost.setTitle(item.getTitle());
					snsPost.setContent(item.getDescription());
					snsPost.setLinkUrl(item.getLink());
					
					snsPosts.add(snsPost);
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
				
		return snsPosts;
	}
	
}
