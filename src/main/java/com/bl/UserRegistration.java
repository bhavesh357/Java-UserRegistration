package com.bl;

import java.util.regex.Pattern;

public class UserRegistration {
    String namePattern="^[A-Z][a-z]{2,}$";
    String emailPattern="[\\w\\d]{1,}[.\\-#!]?[\\w\\d]{1,}@[\\w\\d]{1,}.[a-z]{2,3}.?([a-z]{2})?";
    String numberPattern="[0-9]{2} ?[0-9]{10}";
    String passwordPattern="^(?=.*[A-Z])(?=.*[0-9])(?=.*[A-Za-z0-9@#!$%^&*()_-]{8,})[A-Za-z0-9]+?[@#!$%^&*()_-][A-Za-z0-9]{1,}?$";

    public boolean validateName(String name) {
        return Pattern.matches(namePattern,name);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(emailPattern,email);
    }

    public boolean validateNumber(String number) {
        return Pattern.matches(numberPattern,number);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches(passwordPattern,password);
    }
}
