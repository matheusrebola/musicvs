package beats.estaticos.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import beats.estaticos.core.models.Album;

@Repository
public interface AlbumRepository extends MongoRepository<Album, String> {

}
