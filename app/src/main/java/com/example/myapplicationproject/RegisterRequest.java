package com.example.myapplicationproject;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    //서버URL설정(php파일 연동)
    final static private  String URL = "http://~~/Register.php";
    private Map<String,String> map;

    public RegisterRequest(String userName, String userID, String userPassword, String userEmail, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userName", userName);
        map.put("userID", userID);
        map.put("userEmail", userEmail);
        map.put("userPassword", userPassword);

    }

    @Override
    protected Map<String, String>getParams() throws AuthFailureError {
        return map;
    }
}
