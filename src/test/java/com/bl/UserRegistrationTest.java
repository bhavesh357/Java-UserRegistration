package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenName_WhenName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateName("Bhavesh"));
    }

    public void givenName_WhenName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateName("bhaVesh"));
    }

    public static void main(String[] args){
        UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
        userRegistrationTest.givenName_WhenName_ShouldReturnFalse();
        userRegistrationTest.givenName_WhenName_ShouldReturnTrue();
    }
}
