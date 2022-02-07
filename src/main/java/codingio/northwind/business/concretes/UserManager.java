package codingio.northwind.business.concretes;

import codingio.northwind.business.abstracts.UserService;
import codingio.northwind.core.dataAccess.UserDao;
import codingio.northwind.core.entities.User;
import codingio.northwind.core.utilities.results.DataResult;
import codingio.northwind.core.utilities.results.Result;
import codingio.northwind.core.utilities.results.SuccessDataResult;
import codingio.northwind.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Added user");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>( this.userDao.findByEmail(email),"User was fond");
    }
}