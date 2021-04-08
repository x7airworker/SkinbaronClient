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
public class ListItemsResponseOffer {
    @SerializedName("saleid")
    private String saledId;
    @SerializedName("appid")
    private String appId;
    @SerializedName("contextid")
    private String contextId;
    @SerializedName("assetid")
    private String assetId;
    @SerializedName("market_name")
    private String marketName;
    private float price;
    private List<String> addons;
}
