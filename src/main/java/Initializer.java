import com.endpoint.rest.auth.entity.Role;
import com.endpoint.rest.auth.entity.User;
import com.endpoint.rest.auth.service.RoleService;
import com.endpoint.rest.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Service
public class Initializer {

    @Autowired private UserService userService;
    @Autowired private RoleService roleService;

    @PostConstruct
    public void criaUsuariosEPermissoes(){
        Role roleAdmin = new Role();

        roleAdmin.setName("ADMIN");

        roleService.save(roleAdmin);

        User user = new User();

        user.setAtivo(true);
        user.setEmail("idelioteofilomata@gmail.com");
        user.setNome("Idélio Mata");
        user.setSenha( new BCryptPasswordEncoder().encode("1811495991$"));
        user.setUsername("Idelio");
        user.setRoles(Arrays.asList(roleAdmin));

        userService.save(user);
    }
}
