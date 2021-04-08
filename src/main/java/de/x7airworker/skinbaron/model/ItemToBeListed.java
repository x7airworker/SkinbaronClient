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
public class ItemToBeListed {
    @SerializedName("appid")
    private int appId;
    @SerializedName("contextid")
    private String contextId;
    @SerializedName("assetid")
    private String assetId;
    private List<String> addons;
}
