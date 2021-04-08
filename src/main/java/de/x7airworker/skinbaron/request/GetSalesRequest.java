package de.x7airworker.skinbaron.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class GetSalesRequest {
    private int type;
    @SerializedName("appid")
    private int appId;
    @SerializedName("after_saleid")
    private String afterSaleId;
    @SerializedName("items_per_page")
    private int itemsPerPage;
    @SerializedName("sort_order")
    private int sortOrder;
}
