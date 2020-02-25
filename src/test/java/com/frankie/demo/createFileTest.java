package com.frankie.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

/**
 * @author: Yao Frankie
 * @date: 2020/2/25 13:16
 */
@SpringBootTest
public class createFileTest {


    public void m1(){
        System.out.println(1);
    }

    public void m2(){
        System.out.println(2);
    }

    @Test
    void createFile() throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\test/LY0001_res.json");
        file.createNewFile();
    }

    @Test
    void breakTest(){

    }
}
