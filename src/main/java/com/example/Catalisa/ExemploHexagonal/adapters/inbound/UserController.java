package com.example.Catalisa.ExemploHexagonal.adapters.inbound;

import com.example.Catalisa.ExemploHexagonal.domain.model.UserModel;
import com.example.Catalisa.ExemploHexagonal.domain.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public UserModel saveUser(@RequestBody UserModel userModel) {
    return userService.saveUser(userModel);
  }

  @GetMapping("/{id}")
  public Optional<UserModel> getUser(@PathVariable Long id) {
    return userService.getUser(id);
  }

  @GetMapping
  public List<UserModel> getAllUser(){
    return userService.getAll();
  }
}
