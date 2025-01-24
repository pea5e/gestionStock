package ma.emsi.gestion_stock.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.gestion_stock.Entites.Output;

@Repository
public interface OutputRepo extends MongoRepository<Output,String> {

}