package net.miracle.springbootweb.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private net.miracle.springbootweb.webService webService;

    @GetMapping("")
    public List<User> getUsers() {
        return webService.getUsers();

    }
}
