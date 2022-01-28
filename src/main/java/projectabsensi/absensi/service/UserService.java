package projectabsensi.absensi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectabsensi.absensi.models.entity.User;
import projectabsensi.absensi.repository.UserRepos;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepos userRepos;

    public User save(User user){
        return userRepos.save(user);
    }


//    public User findOne(Long id){
//        return userRepos.findById(id).get();
//    }

    public User findOne(Long id){
        Optional<User> user =  userRepos.findById(id);
        if (!user.isPresent()){
            return null;
        }
        return user.get();
    }

    public Iterable<User> findAll(){
        return userRepos.findAll();
    }
}
