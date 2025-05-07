package beats.estaticos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import beats.estaticos.core.models.Genero;

@Repository
public interface GeneroRepository extends MongoRepository<Genero, String> {

}
