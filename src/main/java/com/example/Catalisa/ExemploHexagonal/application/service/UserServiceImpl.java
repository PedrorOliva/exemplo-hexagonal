package com.example.Catalisa.ExemploHexagonal.application.service;

import com.example.Catalisa.ExemploHexagonal.domain.model.UserModel;
import com.example.Catalisa.ExemploHexagonal.domain.service.UserService;
import com.example.Catalisa.ExemploHexagonal.infrastructure.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserModel saveUser(UserModel userModel) {
    return userRepository.save(userModel);
  }

  @Override
  public Optional<UserModel> getUser(Long id) {
    return userRepository.findById(id);
  }

  @Override
  public List<UserModel> getAll() {
    return userRepository.findAll();
  }
}
