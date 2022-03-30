package com.wuyiz.springtest;

import com.wuyiz.springtest.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private TestService testService;

    @Test
    void assertTest() {
        String s = testService.assertTest();
        System.out.println(s);
        assert s == null;
        System.out.println(112233);
    }

    @Test
    void requireNonNullTest() {
        String s = testService.assertTest();
        System.out.println(s);
        // Objects.requireNonNull(s);
        System.out.println(112233);
    }
}
