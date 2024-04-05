package com.example.Catalisa.ExemploHexagonal.domain.service;
import com.example.Catalisa.ExemploHexagonal.domain.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
  UserModel saveUser(UserModel userModel);
  Optional<UserModel> getUser(Long id);

  List<UserModel> getAll();
}
