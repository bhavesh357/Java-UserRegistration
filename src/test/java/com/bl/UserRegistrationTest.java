package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateName("Bhavesh"));
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateName("bhaVesh"));
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateName("Kadam"));
    }
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateName("kadam"));
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateEmail("abc.xyz@bl.co.in"));
    }
    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateEmail("abc.x@yz@bl.co.in"));
    }

    @Test
    public void givenNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateNumber("91 8652453747"));
    }
    @Test
    public void givenNumber_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateNumber("91 86523453747"));
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validatePassword("aBc7@defgh"));
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validatePassword("aBcdhhgy"));
    }
}
