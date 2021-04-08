package de.x7airworker.skinbaron.response;

import com.google.gson.annotations.SerializedName;
import de.x7airworker.skinbaron.model.ListItemsResponseOffer;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ListItemsResponse {
    @SerializedName("offergroup_id")
    private String offergroupId;
    @SerializedName("tradeoffer_id")
    private String tradeofferId;
    @SerializedName("tradeoffer_error")
    private String tradeofferError;
    @SerializedName("security_token")
    private String securityToken;
    private List<ListItemsResponseOffer> sales;
}
