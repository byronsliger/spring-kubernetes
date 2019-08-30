package com.byron.sliger.demo.greeting;

import com.byron.sliger.demo.error.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private GrettingRepository grettingRepository;


    @GetMapping("/greeting")
    public Iterable<Greeting> all() {
        return grettingRepository.findAll();
    }

    @GetMapping("/greeting/{id}")
    public Greeting one(@PathVariable Long id) {
        return grettingRepository.findById(id).orElseThrow(() -> new NotFound(id));
    }

    @PostMapping("/greeting")
    public Greeting newGreeting(@RequestBody Greeting newGreeting) {
        return grettingRepository.save(newGreeting);
    }

    @PutMapping("/greeting")
    public Greeting replaceGreeting(@RequestBody Greeting newGreeting) {
        return grettingRepository.save(newGreeting);
    }

    @DeleteMapping("/greeting/{id}")
    public void delete(@PathVariable Long id) {
        grettingRepository.deleteById(id);
    }
}
