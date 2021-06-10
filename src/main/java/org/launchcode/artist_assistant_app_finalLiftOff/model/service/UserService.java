





//package org.launchcode.artist_assistant_app_finalLiftOff.model.service;
//
//import org.launchcode.artist_assistant_app_finalLiftOff.model.User;
//import org.launchcode.artist_assistant_app_finalLiftOff.model.data.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {

//    @Autowired
//    UserRepository userRepository;
//    public List<User> findAll() {
//        var it = userRepostiory.findAll();
//        var users = new ArrayList<User>();
//        it.forEach(e -> users.add(e));
//        return users;
//    }
//    public Long count() {
//        return userRepository.count();
//    }
//
//        public void deleteById(int userId) {
//            userRepository.deleteBVyId(userId);
//        }
//}
//
//    public void userService(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }
//    public User findByEmail(String email){
//        return userRepository.findByEmail(email);
//   }
//    public void savedUser(User user){
//        userRepository.save(user);
//   }
//}
