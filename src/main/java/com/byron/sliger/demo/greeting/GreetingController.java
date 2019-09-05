package com.byron.sliger.demo.greeting;

import com.byron.sliger.demo.error.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {
    @Autowired
    private GrettingRepository grettingRepository;


    @GetMapping()
    public Iterable<Greeting> all() {
        return grettingRepository.findAll();
    }

    @GetMapping("/{id}")
    public Greeting one(@PathVariable Long id) {
        return grettingRepository.findById(id).orElseThrow(() -> new NotFound(id));
    }

    @PostMapping()
    public Greeting newGreeting(@RequestBody Greeting newGreeting) {
//        List<Otro> otros = Arrays.asList(new Otro("nombre 1"), new Otro("nombre 2"));
//        newGreeting.setOtros(otros);
//        return newGreeting;
        return grettingRepository.save(newGreeting);
    }

    @PutMapping()
    public Greeting replaceGreeting(@RequestBody Greeting newGreeting) {
        return grettingRepository.save(newGreeting);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        grettingRepository.deleteById(id);
    }
}
