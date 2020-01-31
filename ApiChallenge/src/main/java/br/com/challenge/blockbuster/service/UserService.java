package br.com.challenge.blockbuster.service;

import br.com.challenge.blockbuster.models.User;
import br.com.challenge.blockbuster.models.UserMovie;
import br.com.challenge.blockbuster.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    public Optional<User> findById(Integer id) {
        return this.usersRepository.findById(id);
    }

    public List<UserMovie> getUsersAndMovies() {
        return usersRepository.getMovieByUser();
    }
}
