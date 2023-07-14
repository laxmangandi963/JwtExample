package com.jwt.example.JwtExample3.service;

import com.jwt.example.JwtExample3.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

  private List<User> store = new ArrayList<>();

  public UserService() {
    store.add(new User(UUID.randomUUID().toString(),"Durgesh Tiwari","durgesh@dev.in"));
    store.add(new User(UUID.randomUUID().toString(),"Harsh Tiwari","harsh@dev.in"));
    store.add(new User(UUID.randomUUID().toString(),"Ankit Tiwari","ankit@dev.in"));
    store.add(new User(UUID.randomUUID().toString(),"Gautam Tiwari","gautam@dev.in"));
  }

  public List<User> getUser() {
    return this.store;
  }

}
