package de.x7airworker.skinbaron.request;

import de.x7airworker.skinbaron.model.ItemToBeListed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ListItemsRequest {
    private List<ItemToBeListed> items;
}
