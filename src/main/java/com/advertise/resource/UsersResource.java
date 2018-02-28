package com.advertise.resource;

import com.advertise.model.Users;
import com.advertise.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/all")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @GetMapping("/name")
    public List<Users> getUser(@PathVariable final String name) {
        Optional<List<Users>> listOptional = usersRepository.findByName(name);

        List<Users> users = listOptional
//                .orElseThrow(() -> )
                .orElse(new ArrayList<>());



        return users;
    }

    @GetMapping("/save")
    public String save() {
        Users user = new Users();
//        user.setId(1);
        user.setName("test_name");
        user.setSalary(1111);
        user.setTeamName("team_name");
        ArrayList<String> arguments = new ArrayList<>();
        arguments.add("arg1");
        arguments.add("arg2");
        arguments.add("arg3");
        arguments.add("arg4");
        user.setArguments(arguments);
        usersRepository.save(user);
        return "successful";
    }
}
