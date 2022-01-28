package projectabsensi.absensi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projectabsensi.absensi.models.entity.User;
import projectabsensi.absensi.service.UserService;

import javax.persistence.Id;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping
    public Iterable<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable Long id){
        return userService.findOne(id);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userService.save(user);
    }

}
