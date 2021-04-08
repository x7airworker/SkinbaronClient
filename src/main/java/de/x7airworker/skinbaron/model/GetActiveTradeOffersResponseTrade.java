package de.x7airworker.skinbaron.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class GetActiveTradeOffersResponseTrade {
    @SerializedName("trade_id")
    private String tradeId;
    @SerializedName("security_token")
    private String securityToken;
    private Type type;
    @SerializedName("tradeofferlink")
    private String tradeOfferLink;
    private String state;

    public enum Type {
        OFFER, PURCHASE, CANCEL
    }
}
