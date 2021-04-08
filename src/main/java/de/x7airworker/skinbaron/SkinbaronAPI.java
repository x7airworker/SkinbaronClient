package de.x7airworker.skinbaron;

import de.x7airworker.skinbaron.request.*;
import de.x7airworker.skinbaron.response.*;
import lombok.AllArgsConstructor;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.httpclient.HTTPClient;

@AllArgsConstructor
public class SkinbaronAPI extends HTTPClient {
    private final String apiKey;

    {
        setBaseUrl("https://api.skinbaron.de");
    }

    public ListItemsResponse listItems(ListItemsRequest request) {
        return post("/ListItems", appendApiKey(request)).object(ListItemsResponse.class);
    }

    public boolean editPriceMulti (EditPriceMultiRequest request) {
        return post("/EditPriceMulti", appendApiKey(request)).status() == 200;
    }

    public ReturnItemsResponse returnItems (ReturnItemsRequest request) {
        return post("/ReturnItems", appendApiKey(request)).object(ReturnItemsResponse.class);
    }

    public GetSalesResponse getSales(GetSalesRequest request) {
        return post("/GetSales", appendApiKey(request)).object(GetSalesResponse.class);
    }

    public SearchResponse search (SearchRequest request) {
        return post("/Search", appendApiKey(request)).object(SearchResponse.class);
    }

    public BuyResponse buyItems (BuyRequest request) {
        return post("/BuyItems", appendApiKey(request)).object(BuyResponse.class);
    }

    public boolean getInventory (GetInventoryRequest request) {
        // TODO: Update if there is more information about the response
        return post("/GetInventory", appendApiKey(request)).status() == 200;
    }

    public GetBalanceResponse getBalance () {
        return post("/GetBalance", objWithApiKey()).object(GetBalanceResponse.class);
    }

    public GetActiveTradeOffersResponse getActiveTradeOffers () {
        return post("/GetActiveTradeOffers", objWithApiKey()).object(GetActiveTradeOffersResponse.class);
    }

    public boolean resendFailedTradeOffers () {
        return post("/ResendFailedTradeOffers", objWithApiKey()).status() == 200;
    }

    private AbstractObject objWithApiKey() {
        AbstractObject object = new AbstractObject();
        object.set("apikey", apiKey);
        return object;
    }

    private AbstractObject appendApiKey (Object obj) {
        AbstractObject object = getAbstractMapper().toAbstract(obj).object();
        object.set("apikey", apiKey);
        return object;
    }
}
