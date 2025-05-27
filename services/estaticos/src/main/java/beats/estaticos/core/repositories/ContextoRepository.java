package beats.estaticos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import beats.estaticos.core.models.Contexto;

@Repository
public interface ContextoRepository extends MongoRepository<Contexto, String> {

}
