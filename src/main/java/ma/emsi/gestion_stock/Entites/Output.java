package ma.emsi.gestion_stock.Entites;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="sortie")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Output {
    
    @Id
    private String id;

    String produitID;

    LocalDate date;

    int qte;

    String destination;

    public Output(String produitID,int qte,String destination)
    {
        this.qte = qte;
        this.produitID = produitID;
        this.destination = destination;
    }
}
