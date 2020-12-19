package maratK.AuthorizationService.repository;


import maratK.AuthorizationService.entity.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (userValid(user,password)) return Arrays.asList(Authorities.READ,Authorities.WRITE);
        return null;
    }

    public boolean userValid (String user, String password) {
        return "mario".equals(user) && "777".equals(password);
    }
}
