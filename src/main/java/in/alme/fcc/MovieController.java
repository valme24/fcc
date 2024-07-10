package in.alme.fcc;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class MovieController {


  @Autowired
    MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){

        try {
            List<Movie> movies = movieService.getAllMovies();
            return new ResponseEntity<>(movies, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("id/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id){
           return new ResponseEntity< Optional<Movie>>(movieService.singleMovie(id),HttpStatus.OK);
    }


    @GetMapping("imdb/{imdb}")
    public ResponseEntity<Optional<Movie>> getMovieByImdb(@PathVariable String imdb){
        return new ResponseEntity< Optional<Movie>>(movieService.getMovieByImdb(imdb),HttpStatus.OK);
    }
}
