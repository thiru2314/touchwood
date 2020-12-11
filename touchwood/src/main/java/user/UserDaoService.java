package user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<User>();

    private static int userCount = 3;

    static {
        users.add(new User(1, "Thiru", new Date()));
        users.add(new User(2, "Satya", new Date()));
        users.add(new User(3, "Chakri", new Date()));
    }

    //find all
    public List<User> findall() {

        return users;
    }

    //save user
    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    //find one
    public User findOne(Integer id) {
        for (User user : users) {
            if (user.getId() == id) {

                return user;
            }
        }
        return null;
    }

}
