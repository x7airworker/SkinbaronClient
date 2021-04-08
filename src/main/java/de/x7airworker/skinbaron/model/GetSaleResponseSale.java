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
public class GetSaleResponseSale {
    @SerializedName("trade_locked")
    private boolean tradeLocked;
    private float price;
    @SerializedName("context_id")
    private String contextId;
    @SerializedName("asset_id")
    private String assetId;
    private float commission;
    private String name;
    private float tax;
    @SerializedName("escrow_end_date")
    private int escrowEndDate;
    @SerializedName("list_time")
    private int listTime;
    @SerializedName("instance_id")
    private int instanceId;
    private int state;
    @SerializedName("last_updated")
    private int lastUpdated;
    @SerializedName("classid")
    private String classId;
    private List<String> addons;
    @SerializedName("offerid")
    private String offerId;
    @SerializedName("security_token")
    private String securityToken;
    private String id;
    @SerializedName("appid")
    private int appId;
    @SerializedName("txid")
    private String txId;
    private float wear;
}
