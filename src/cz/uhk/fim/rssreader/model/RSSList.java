package cz.uhk.fim.rssreader.model;

import java.util.ArrayList;
import java.util.List;

public class RSSList {

    private List<RSSItem> items;

    public RSSList(){
        items = new ArrayList<>();
    }

    public void addItem (RSSItem item) {
        items.add(item);
    }

    public RSSItem getItem (int index){
        return items.get(index);
    }
    //???????
    public List<RSSItem> getItems(int index){
        return items;
    }

    public void removeItem (int index){
        items.remove(index);
    }

    public void removeItem (RSSItem item){
        items.remove(item);
    }

    public void clear(){
        items.clear();
    }

    //????????
    public String toString(){
        return items.toString();
    }

}
