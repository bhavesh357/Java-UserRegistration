package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenName_WhenFirstName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateName("Bhavesh"));
    }

    public void givenName_WhenFirstName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateName("bhaVesh"));
    }
    public void givenName_WhenLastName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateName("Kadam"));
    }

    public void givenName_WhenLastName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateName("kadam"));
    }

    public static void main(String[] args){
        UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
        userRegistrationTest.givenName_WhenFirstName_ShouldReturnFalse();
        userRegistrationTest.givenName_WhenFirstName_ShouldReturnTrue();
        userRegistrationTest.givenName_WhenLastName_ShouldReturnFalse();
        userRegistrationTest.givenName_WhenLastName_ShouldReturnTrue();
    }
}
