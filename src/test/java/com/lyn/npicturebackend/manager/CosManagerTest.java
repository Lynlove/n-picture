package com.lyn.npicturebackend.manager;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Cos 操作测试
 *

 */
@SpringBootTest
class CosManagerTest {

    @Resource
    private CosManager cosManager;

    @Test
    void putObject() {
        cosManager.putObject("test", "D:\\code\\ideaProject\\PlanetProject\\n-picture\\n-picture-backend\\src\\main\\resources\\test_excel.xlsx");
    }
}