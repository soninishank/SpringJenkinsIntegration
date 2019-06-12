package com.springjenkins.integration.SpringJenkinsIntegration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinsIntegrationApplicationTests {


    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsIntegrationApplicationTests.class);

    @Test
    public void contextLoads()
    {
        logger.info("Test case executing ");
        assertEquals(true, false);
    }

}

