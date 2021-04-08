package de.x7airworker.skinbaron.response;

import de.x7airworker.skinbaron.model.IdPricePair;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class SearchResponse {
    private List<IdPricePair> sales;
}
