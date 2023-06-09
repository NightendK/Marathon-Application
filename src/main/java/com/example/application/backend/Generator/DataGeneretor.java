package com.example.application.backend.Generator;

import com.example.application.backend.Enums.Race;
import com.example.application.backend.Enums.Role;
import com.example.application.backend.Enums.Sex;
import com.example.application.backend.Enums.ShirtSize;
import com.example.application.backend.Model.Person;
import com.example.application.backend.Model.User;
import com.example.application.backend.Repository.PersonRepository;
import com.example.application.backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGeneretor implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        /*Person person = new Person();
        person.setFirstName("Andrei");
        person.setLastName("Rosu");
        person.setEmail("andrei@yahoo.com");
        person.setShirtSize(ShirtSize.XS);
        person.setSex(Sex.BARBAT);
        person.setRace(Race.CURSA_21KM);

        User user = new User("andrei", "rosu",  Role.USER);

        person.setUser(user);
        personRepository.save(person);*/

    }
}
