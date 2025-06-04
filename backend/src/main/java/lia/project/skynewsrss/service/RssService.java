package lia.project.skynewsrss.service;

import lia.project.skynewsrss.model.NewsItem;
import org.springframework.stereotype.Service;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class RssService {
    public List<NewsItem> getNews() {
        List<NewsItem> newsList = new ArrayList<>();
        try {
            URL url = new URL("https://feeds.skynews.com/feeds/rss/home.xml");
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(url.openStream());
            NodeList items = doc.getElementsByTagName("item");

            for (int i = 0; i < items.getLength(); i++) {
                Element item = (Element) items.item(i);
                NewsItem news = new NewsItem();
                news.setTitle(item.getElementsByTagName("title").item(0).getTextContent());
                news.setLink(item.getElementsByTagName("link").item(0).getTextContent());
                news.setPubDate(item.getElementsByTagName("pubDate").item(0).getTextContent());

                // Try get image from <media:thumbnail>
                NodeList media = item.getElementsByTagName("media:thumbnail");
                if (media.getLength() > 0) {
                    Element mediaEl = (Element) media.item(0);
                    news.setImageUrl(mediaEl.getAttribute("url"));
                }

                newsList.add(news);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newsList;
    }
}
