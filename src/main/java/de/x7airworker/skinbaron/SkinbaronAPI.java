package de.x7airworker.skinbaron;

import de.x7airworker.skinbaron.request.*;
import de.x7airworker.skinbaron.response.*;
import lombok.AllArgsConstructor;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.httpclient.HTTPClient;
import org.javawebstack.httpclient.HTTPRequest;

@AllArgsConstructor
public class SkinbaronAPI extends HTTPClient {
    private final String apiKey;

    {
        setBaseUrl("https://api.skinbaron.de");
    }

    public ListItemsResponse listItems(ListItemsRequest request) throws SkinbaronAPIException {
        return handleError(post("/ListItems", appendApiKey(request))).object(ListItemsResponse.class);
    }

    public HTTPRequest editPriceMulti(EditPriceMultiRequest request) throws SkinbaronAPIException {
        return handleError(post("/EditPriceMulti", appendApiKey(request)));
    }

    public ReturnItemsResponse returnItems(ReturnItemsRequest request) throws SkinbaronAPIException {
        return handleError(post("/ReturnItems", appendApiKey(request))).object(ReturnItemsResponse.class);
    }

    public GetSalesResponse getSales(GetSalesRequest request) throws SkinbaronAPIException {
        return handleError(post("/GetSales", appendApiKey(request))).object(GetSalesResponse.class);
    }

    public SearchResponse search(SearchRequest request) throws SkinbaronAPIException {
        return handleError(post("/Search", appendApiKey(request))).object(SearchResponse.class);
    }

    public BuyResponse buyItems(BuyRequest request) throws SkinbaronAPIException {
        return handleError(post("/BuyItems", appendApiKey(request))).object(BuyResponse.class);
    }

    public HTTPRequest getInventory(GetInventoryRequest request) throws SkinbaronAPIException {
        // TODO: Update if there is more information about the response
        return handleError(post("/GetInventory", appendApiKey(request)));
    }

    public GetBalanceResponse getBalance() throws SkinbaronAPIException {
        return handleError(post("/GetBalance", objWithApiKey())).object(GetBalanceResponse.class);
    }

    public GetActiveTradeOffersResponse getActiveTradeOffers() throws SkinbaronAPIException {
        return handleError(post("/GetActiveTradeOffers", objWithApiKey())).object(GetActiveTradeOffersResponse.class);
    }

    public boolean resendFailedTradeOffers() throws SkinbaronAPIException {
        return handleError(post("/ResendFailedTradeOffers", objWithApiKey())).status() == 200;
    }

    private HTTPRequest handleError(HTTPRequest request) throws SkinbaronAPIException {
        if (request.status() != 200) throw new SkinbaronAPIException(request);
        return request;
    }

    private AbstractObject objWithApiKey() {
        AbstractObject object = new AbstractObject();
        object.set("apikey", apiKey);
        return object;
    }

    private AbstractObject appendApiKey(Object obj) {
        AbstractObject object = getAbstractMapper().toAbstract(obj).object();
        object.set("apikey", apiKey);
        return object;
    }
}
