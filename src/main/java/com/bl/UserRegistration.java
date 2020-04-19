package com.bl;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateName(String name) {
        return Pattern.matches("^[A-Z][a-z]{2,}$",name);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches("[\\w\\d]{1,}[.\\-#!]?[\\w\\d]{1,}@[\\w\\d]{1,}.[a-z]{2,3}.?([a-z]{2})?",email);
    }
}
