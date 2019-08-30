package com.byron.sliger.demo.error;

public class NotFound extends RuntimeException {
    public NotFound(Long id) {
        super("Not found: " + id);
    }
}
