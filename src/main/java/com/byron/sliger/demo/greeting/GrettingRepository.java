package com.byron.sliger.demo.greeting;

import org.springframework.data.repository.CrudRepository;

public interface GrettingRepository extends CrudRepository<Greeting, Long> {
}
