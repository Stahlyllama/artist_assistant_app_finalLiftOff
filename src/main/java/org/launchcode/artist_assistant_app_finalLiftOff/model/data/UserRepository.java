package org.launchcode.artist_assistant_app_finalLiftOff.model.data;

import org.launchcode.artist_assistant_app_finalLiftOff.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmail(String email);
}