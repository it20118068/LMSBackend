package com.lmsbackend.util.enums;

public enum ApiStatus {
    NOT_FOUND("Resource Not Found"),
    INSERT_SUCCESS("Resource Inserted Successfully"),
    INPUT_NULL("Input Not Found");

    private final String message;

    ApiStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
