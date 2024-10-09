package ma.emsi.gestion_stock.Entites;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="produits")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Produit {
    
    @Id
    private String id;

    String label;
}
