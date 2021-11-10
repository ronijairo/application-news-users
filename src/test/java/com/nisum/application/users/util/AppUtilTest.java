package com.nisum.application.users.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUtilTest {

    @Test
    public void false_password_when_has_less_than_8_letters(){
       assertEquals(false, AppUtil.validatePassword("1234567"));
    }

    @Test
    public void false_password_when_has_only_letters(){
        assertEquals(false, AppUtil.validatePassword("abcdef"));
    }

    @Test
    public void false_password_when_has_letters_and_numbers(){
        assertEquals(false, AppUtil.validatePassword("123456abcdf"));
    }
    @Test
    public void true_password_when_has_letters_twonumber_and_8_character(){
        assertEquals(true, AppUtil.validatePassword("Roni25ca"));
    }

    @Test
    public void false_email_when_has_arroba_chain(){
        assertEquals(false, AppUtil.isValidEmailId("roni.canche.com"));
    }
    @Test
    public void false_email_when_has_point_chain(){
        assertEquals(false, AppUtil.isValidEmailId("roni@canchecom"));
    }
    @Test
    public void true_email_when_has_atsing_chain(){
        assertEquals(true, AppUtil.isValidEmailId("roni@canche.com"));
    }


}