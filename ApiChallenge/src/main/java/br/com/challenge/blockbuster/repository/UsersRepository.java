package br.com.challenge.blockbuster.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import br.com.challenge.blockbuster.models.User;
import br.com.challenge.blockbuster.models.UserMovie;

import java.util.List;

@Transactional
public interface UsersRepository extends CrudRepository<User, Integer> {
	@Query("SELECT new br.com.challenge.blockbuster.models.UserMovie(u.firstName, m.title) "
			+ "FROM User u INNER JOIN u.movieId m")
	List<UserMovie> getMovieByUser();
}
