package ma.emsi.gestion_stock.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.gestion_stock.Entites.Produit;

@Repository
public interface ProduitRepo extends MongoRepository<Produit,String> {

}