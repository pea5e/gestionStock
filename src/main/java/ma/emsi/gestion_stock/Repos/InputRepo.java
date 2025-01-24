package ma.emsi.gestion_stock.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.gestion_stock.Entites.Input;

@Repository
public interface InputRepo extends MongoRepository<Input,String> {

}