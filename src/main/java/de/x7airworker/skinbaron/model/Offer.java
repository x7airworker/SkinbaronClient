package de.x7airworker.skinbaron.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Offer {
    @SerializedName("offercancelgroup_id")
    private String offerCancelGroupId;
    @SerializedName("bot_id")
    private String botId;
    private List<String> items;
    @SerializedName("tradeoffer_id")
    private String tradeofferId;
    @SerializedName("tradeoffer_error")
    private String tradeofferError;
    @SerializedName("security_token")
    private String securityToken;
}
