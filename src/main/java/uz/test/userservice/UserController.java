package uz.test.userservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = new User(id, "Foydalanuvchi " + id, "user" + id + "@example.com");
        return ResponseEntity.ok(user);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class User {
    private Long id;
    private String name;
    private String email;
}