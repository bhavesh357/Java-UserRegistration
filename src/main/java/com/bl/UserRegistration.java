package com.bl;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateName(String name) {
        return Pattern.matches("^[A-Z][a-z]{2,}$",name);
    }
}
