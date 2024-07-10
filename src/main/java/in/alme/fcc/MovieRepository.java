package in.alme.fcc;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie,Object> {

Optional<Movie> findMovieByImdbId(String imdb);

}
