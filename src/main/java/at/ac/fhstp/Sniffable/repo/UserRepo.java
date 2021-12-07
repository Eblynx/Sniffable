package at.ac.fhstp.Sniffable.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import at.ac.fhstp.Sniffable.core.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{
    
}
