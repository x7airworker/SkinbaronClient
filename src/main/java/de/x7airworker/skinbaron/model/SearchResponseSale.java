package de.x7airworker.skinbaron.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SearchResponseSale {
    private String id;
    private float price;
    private String img;
    @SerializedName("market_name")
    private String marketName;
    private String sbinspect;
    private String inspect;
    private String stickers;
    private String wear;
    @SerializedName("appid")
    private int appId;
}
