package lia.project.skynewsrss.controller;

import lia.project.skynewsrss.model.NewsItem;
import lia.project.skynewsrss.service.RssService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    private final RssService rssService;

    public NewsController(RssService rssService) {
        this.rssService = rssService;
    }

    @GetMapping
    public List<NewsItem> getNews() {
        return rssService.getNews();
    }
}
