package lia.projects.skynewsrss.service;

import lia.projects.skynewsrss.model.NewsItem;
import org.springframework.stereotype.Service;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.net.URL;
import java.util.*;

@Service
public class RssService {

    public List<NewsItem> getHeadlines() {
        List<NewsItem> newsList = new ArrayList<>();

        try {
            URL url = new URL("https://feeds.skynews.com/feeds/rss/home.xml");
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(url.openStream());

            NodeList items = doc.getElementsByTagName("item");

            for (int i = 0; i < Math.min(10, items.getLength()); i++) {
                Element item = (Element) items.item(i);
                String title = item.getElementsByTagName("title").item(0).getTextContent();
                String link = item.getElementsByTagName("link").item(0).getTextContent();
                String pubDate = item.getElementsByTagName("pubDate").item(0).getTextContent();

                newsList.add(new NewsItem(title, link, pubDate));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return newsList;
    }
}
