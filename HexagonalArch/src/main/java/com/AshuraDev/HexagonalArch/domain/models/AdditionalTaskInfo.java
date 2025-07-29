package com.AshuraDev.HexagonalArch.domain.models;

import java.util.Optional;

public class AdditionalTaskInfo {
    private final long userid;
    private final String userName;
    private final String userEmail;


    public AdditionalTaskInfo(String userEmail, String userName, long userid) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userid = userid;
    }

    public long getUserid() {
        return userid;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
