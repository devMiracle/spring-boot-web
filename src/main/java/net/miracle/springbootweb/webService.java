package net.miracle.springbootweb;


import net.miracle.springbootweb.product.Product;
import net.miracle.springbootweb.user.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class webService {
    public List<User> getUsers() {
        return Arrays.asList(
                new User(1, "user1"),
                new User(2, "user2"),
                new User(3, "user3")
        );
    }

    public List<Product> getProducts() {
        return Arrays.asList(
                new Product(1, "IPhone", 10, 800),
                new Product(1, "IPad", 15, 900.60),
                new Product(1, "AirPods", 30, 200)
        );
    }

}
