package com.sda.alexandraorza.webshop.error;

import java.time.Instant;

          //    Este obiectul care va fii returnat in caz de eroare !!!

public class ErrorDetails {

    private final Instant timestamp;
    private final String massage;
    private final String details;

    public ErrorDetails(Instant timestamp, String massage, String details) {
        this.timestamp = timestamp;
        this.massage = massage;
        this.details = details;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public String getMassage() {
        return massage;
    }

    public String getDetails() {
        return details;
    }
}
