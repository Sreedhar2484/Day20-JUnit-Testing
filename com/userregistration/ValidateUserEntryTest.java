package com.userregistration;


import org.junit.Assert;
import org.junit.Test;

public class ValidateUserEntryTest {
    
    @Test
    public void testValidateUserEntryForFirstName(){
        boolean result = ValidateUserEntry.checkFirstName("Nagalli");
        Assert.assertEquals(true, result);
    }
    @Test
    public void testValidateUserEntryForLastName(){
        boolean result = ValidateUserEntry.checkLastName("Sreedhar");
        Assert.assertEquals(true, result);
    }
    @Test
    public void testValidateUserEntryForEmail(){
        boolean result = ValidateUserEntry.checkEmail("nsridhary2k@gmail.com");
        Assert.assertEquals(true, result);
    }
    @Test
    public void testValidateUserEntryForMobilenum(){
        boolean result = ValidateUserEntry.checkMobileNum("9653440248");
        Assert.assertEquals(true, result);
    }
    @Test
    public void testValidateUserEntryForPassword(){
        boolean result = ValidateUserEntry.checkPassword("Pass@123");
        Assert.assertEquals(true, result);
    }
}
