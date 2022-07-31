package com.work.weixin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

class WuworkTest {
    Wuwork wuwork;
    @BeforeEach
    void setUp() {
        wuwork = new Wuwork();
    }

    @Test
    void getWuworkToken() {
    }

    @Test
    void getToken() {
        String token = wuwork.getToken();
        assertThat(token, not(equalTo(null)));

    }
}