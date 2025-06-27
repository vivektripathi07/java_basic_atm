package atm_pack;

import java.util.ArrayList;

public class User {
    private String firstName;

    private String lastName;

    private String uuid;

    private byte pinHash[]; //We'll be using MD5 hashing algo for hashing

    private ArrayList<Account> accounts;


    public User(String firstName, String lastName, String pin, Bank theBank){
        this.firstName = firstName;
        this.lastName = lastName;
        
    }




}
