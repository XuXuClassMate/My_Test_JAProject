package com.work.weixin.contact;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class MumberTest {

    static Mumber mumber;

    @BeforeEach
    void setUp() {
        mumber = new Mumber();
    }

    @Test
    void create() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("userid", "createmumber_apitest");
        map.put("name", "CreateMumber_ApiTest");
        map.put("department", Arrays.asList(1,2));
        mumber.create(map).then().statusCode(200).body("errcode",equalTo(0));
    }
}