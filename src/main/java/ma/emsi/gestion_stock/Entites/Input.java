package ma.emsi.gestion_stock.Entites;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="entree")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Input {
    
    @Id
    private String id;

    String produitID;

    LocalDate date;

    int qte;
    
    public Input(String produitID,int qte)
    {
        this.qte = qte;
        this.produitID = produitID;
    }

}
