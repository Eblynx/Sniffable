package at.ac.fhstp.Sniffable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.ac.fhstp.Sniffable.core.User;
import at.ac.fhstp.Sniffable.register.RegisterRequest;
import at.ac.fhstp.Sniffable.repo.UserRepo;

@Service
public class AuthService {

    @Autowired
    private UserRepo userRepository;
    
    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }
}
