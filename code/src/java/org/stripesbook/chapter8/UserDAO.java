package org.stripesbook.chapter8;

public class UserDAO {
    public static String ACTUAL_USERNAME = "user";
    public static String ACTUAL_PASSWORD = "pass";
    
    /**
     * Would usually be a DB select statement
     */
    public boolean login(String username, String password){
        if(ACTUAL_USERNAME.equals(username) && ACTUAL_PASSWORD.equals(password)){
            return true;
        } else{
            return false;
        }
    }
}
