package com.toyide.csci3130_project;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by aya on 2018-03-14.
 */
/**
 * Profile Class that defines how the data will be stored in our
 * project Firebase databse. This is converted to a JSON format
 */
public class Profile implements Serializable {
    public String uid;
    public String username;
    public String password;
    public String department;
    public String degree;
    //public ArrayList<String> couseid;
    public Profile() {

    }

    public  Profile(String uid, String username, String password, String department, String degree){
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.department = department;
        this.degree = degree;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("username", username);
        result.put("password", password);
        result.put("department", department);
        result.put("degree", degree);
        return result;
    }

}
