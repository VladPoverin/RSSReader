package cz.uhk.fim.rssreader.model;

public class RSSItem {

    private String title;
    private String description;
    private String link;
    private String pubDate;
    private String author;

    public RSSItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public RSSItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public RSSItem setLink(String link) {
        this.link = link;
        return this;
    }

    public RSSItem setPubDate(String pubDate) {
        this.pubDate = pubDate;
        return this;
    }

    public RSSItem setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getAuthor() {
        return author;
    }
}
