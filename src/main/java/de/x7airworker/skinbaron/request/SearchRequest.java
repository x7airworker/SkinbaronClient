package de.x7airworker.skinbaron.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SearchRequest {
    @SerializedName("appid")
    private int appId;
    @SerializedName("search_item")
    private String searchItem;
    private double min;
    private double max;
    @SerializedName("after_saleid")
    private String afterSaleId;
    @SerializedName("items_per_page")
    private int itemsPerPage;
}
