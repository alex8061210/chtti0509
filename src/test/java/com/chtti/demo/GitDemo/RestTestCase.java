package com.chtti.demo.GitDemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestTestCase {
    TestRestTemplate restTemplate;
    URL base;
    @LocalServerPort
    int port;

    @Before
    public void setUp() throws MalformedURLException {
        base = new URL("http://localhost:" + port);
    }

    @Test
    public void testRoot(){
        restTemplate = new TestRestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(base.toString(), String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().contains("console"));
    }

    @Test
    public void testEP3(){
        restTemplate = new TestRestTemplate();
        ResponseEntity<Lesson> response = restTemplate.getForEntity(base.toString()+"ep3", Lesson.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        Lesson lesson1 = response.getBody();
        assertEquals(lesson1.getInstructor(), "MarkHo");
    }
}
