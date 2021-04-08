package de.x7airworker.skinbaron.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BuyRequest {
    private int total;
    @SerializedName("saleids")
    private List<String> saleIds;
}
