package com.sda.alexandraorza.webshop.error;

// este obiectul care va fi returnat in caz de eroare

import java.time.Instant;

public class ErrorDetails {
    private final Instant timestamp;
    private final String message;
    private final String details;

    public ErrorDetails(Instant timestamp, String message, String details){
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
    public String getMessage(){
        return message;
    }
    public String getDetails(){
        return details;
    }
}
