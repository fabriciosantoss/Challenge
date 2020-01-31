package br.com.challenge.blockbuster.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import br.com.challenge.blockbuster.models.User;
import br.com.challenge.blockbuster.models.UserMovie;
import br.com.challenge.blockbuster.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UsersController {

	public static int counter = 0;

	@Autowired
	private UserService userService;

	@GetMapping("/id/{id}")
	public User postUserList(@Valid @PathVariable int id) {

		try {
			return this.userService.findById(id).get();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid User");
		}
	}

	@GetMapping("/movies")
	public List<UserMovie> postUserMoviesList() {
		return this.userService.getUsersAndMovies();
	}

}
