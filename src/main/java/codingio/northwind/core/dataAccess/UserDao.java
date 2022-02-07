package codingio.northwind.core.dataAccess;

import codingio.northwind.core.entities.User;
import codingio.northwind.core.utilities.results.DataResult;
import codingio.northwind.core.utilities.results.Result;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

    User findByEmail(String email);

}
