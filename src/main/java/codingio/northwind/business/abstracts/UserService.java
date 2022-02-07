package codingio.northwind.business.abstracts;

import codingio.northwind.core.entities.User;
import codingio.northwind.core.utilities.results.DataResult;
import codingio.northwind.core.utilities.results.Result;

public interface UserService {

    Result add(User user);
    DataResult<User> findByEmail(String email);
}
