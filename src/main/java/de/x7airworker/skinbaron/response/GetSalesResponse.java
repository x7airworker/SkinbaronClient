package de.x7airworker.skinbaron.response;

import de.x7airworker.skinbaron.model.GetSaleResponseSale;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class GetSalesResponse {
    private List<GetSaleResponseSale> response;
}
