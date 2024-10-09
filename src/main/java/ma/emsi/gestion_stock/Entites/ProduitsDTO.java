package ma.emsi.gestion_stock.Entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProduitsDTO {

    Produit produit;

    int qte;
}
