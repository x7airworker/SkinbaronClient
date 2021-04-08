package de.x7airworker.skinbaron.response;

import com.google.gson.annotations.SerializedName;
import de.x7airworker.skinbaron.model.BoughtItem;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class BuyResponse {
    @SerializedName("security_token")
    private String securityToken;
    private float total;
    private List<BoughtItem> items;
}
