package de.x7airworker.skinbaron.response;

import de.x7airworker.skinbaron.model.GetActiveTradeOffersResponseTrade;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@Data
public class GetActiveTradeOffersResponse {
    private Map<String, GetActiveTradeOffersResponseTrade> offers;
}
