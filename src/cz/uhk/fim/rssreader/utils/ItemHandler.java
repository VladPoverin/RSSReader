package cz.uhk.fim.rssreader.utils;

import cz.uhk.fim.rssreader.model.RSSList;
import cz.uhk.fim.rssreader.model.RSSItem;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ItemHandler extends DefaultHandler {
    private static  final String ITEM = "item";
    private static  final String LINK = "link";
    private static  final String TITLE = "title";
    private static  final String DESCRIPTION = "description";
    private static  final String PUBDATE = "pubDate";
    private static  final String AUTHOR = "dc:creator";

    private RSSItem item;
    private RSSList items;

    private boolean title;
    private boolean link;
    private boolean description;
    private boolean pubDate;
    private boolean author;

    public ItemHandler(RSSList items){
        this.items = items;
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        if (qName.equalsIgnoreCase(ITEM)){
            item = new RSSItem();
        }

        if (qName.equalsIgnoreCase(TITLE) && item != null){
            title = true;
        }

        if(qName.equalsIgnoreCase(LINK) && item != null){
            link = true;
        }

        if(qName.equalsIgnoreCase(DESCRIPTION) && item != null){
            description = true;
        }

        if(qName.equalsIgnoreCase(PUBDATE) && item != null){
            pubDate = true;
        }

        if(qName.equalsIgnoreCase(AUTHOR) && item != null){
            author = true;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase(ITEM)){
            items.addItem(item);
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        if(title){
            item.setTitle(new String(ch, start, length));
            title = false;
        }

        if (link){
            item.setLink(new String(ch, start, length));
            link = false;
        }

        if(description){
            item.setDescription(new String(ch, start, length));
            description = false;
        }

        if (pubDate){
            item.setPubDate(new String(ch, start, length));
            pubDate = false;
        }

        if (author){
            item.setAuthor(new String(ch, start, length));
            author = false;
        }
    }




}
