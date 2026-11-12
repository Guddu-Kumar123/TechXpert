package backend;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepairController {

    @GetMapping("/api/repairs")
    public List<String> getServices() {
        return List.of(
                "Android Mobile Repair",
                "iPhone Repair",
                "Laptop Repair",
                "MacBook Repair",
                "iPad Repair"
        );
    }
}