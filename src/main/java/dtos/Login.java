package dtos;

/**
 * @author IUH Software Development Team
 * @version 1.0
 * @file Hello.java
 * @date 6/2/2025 9:29 PM
 * @project Thesis Management System
 * @copyright Copyright (c) 2025 Industrial University of Ho Chi Minh City (IUH). All rights reserved.
 * @since 1.0
 */

public class Login {
    private String message;

    public Login() {
    }

    public Login(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
