package com.rl.sites;

import com.rl.flex.criterias.SearchObject;
import org.jsoup.Jsoup;

public class Farfetch implements Parser {

    private static final String url = "https://www.farfetch.com/shopping/men/search/items.aspx?q=";

    @Override
    public String get(SearchObject searchObject) {
        try {

            String priceAttr = searchObject.getPrice() != 0 ? "price=0-" + searchObject.getPrice() : "";

            String search = searchObject.getSearch().replaceAll(" ", "%20");

            String resultUrl = url + search + "&" + priceAttr;

            return Jsoup.connect(resultUrl).get().outerHtml();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
