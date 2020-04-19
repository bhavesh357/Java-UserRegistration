package com.bl;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateName(String name) {
        return Pattern.matches("^[A-Z][a-z]{2,}$",name);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches("[\\w\\d]{1,}[.\\-#!]?[\\w\\d]{1,}@[\\w\\d]{1,}.[a-z]{2,3}.?([a-z]{2})?",email);
    }

    public boolean validateNumber(String number) {
        return Pattern.matches("[0-9]{2} [0-9]{10}",number);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches("^(?=.*[A-Z])[A-Za-z0-9]{8,}$",password);
    }
}
