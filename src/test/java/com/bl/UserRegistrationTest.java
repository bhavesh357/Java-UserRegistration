package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenName_WhenFirstName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateName("Bhavesh"));
    }
    @Test
    public void givenName_WhenFirstName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateName("bhaVesh"));
    }
    @Test
    public void givenName_WhenLastName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateName("Kadam"));
    }
    @Test
    public void givenName_WhenLastName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateName("kadam"));
    }
    @Test
    public void givenEmail_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateEmail("abc.xyz@bl.co.in"));
    }
    @Test
    public void givenEmail_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateEmail("abc.x@yz@bl.co.in"));
    }

    @Test
    public void givenNumber_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateNumber("91 8652453747"));
    }
    @Test
    public void givenNumber_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateNumber("91 86523453747"));
    }

    public static void main(String[] args){
        UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
        userRegistrationTest.givenName_WhenFirstName_ShouldReturnFalse();
        userRegistrationTest.givenName_WhenFirstName_ShouldReturnTrue();
        userRegistrationTest.givenName_WhenLastName_ShouldReturnFalse();
        userRegistrationTest.givenName_WhenLastName_ShouldReturnTrue();
        userRegistrationTest.givenEmail_ShouldReturnFalse();
        userRegistrationTest.givenEmail_ShouldReturnTrue();
    }
}
