package com.zqk.mongodb;

import com.alibaba.fastjson.JSONObject;
import com.zqk.mongodb.dao.DemoDao;
import com.zqk.mongodb.entity.DemoEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MongodbApplicationTests {

    @Autowired
    private DemoDao demoDao;

    @Test
    public void saveDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("关注公众号，搜云库，专注于开发技术的研究与知识分享");
        demoEntity.setBy("souyunku");
        demoEntity.setUrl("http://www.souyunku.com");

        demoDao.saveDemo(demoEntity);

        demoEntity = new DemoEntity();
        demoEntity.setId(2L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("关注公众号，搜云库，专注于开发技术的研究与知识分享");
        demoEntity.setBy("souyunku");
        demoEntity.setUrl("http://www.souyunku.com");

        demoDao.saveDemo(demoEntity);
    }

    @Test
    public void removeDemoTest() {
        demoDao.removeDemo(2L);
    }

    @Test
    public void updateDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB 更新数据");
        demoEntity.setDescription("关注公众号，搜云库，专注于开发技术的研究与知识分享");
        demoEntity.setBy("souyunku");
        demoEntity.setUrl("http://www.souyunku.com");

        demoDao.updateDemo(demoEntity);
    }

    @Test
    public void findDemoByIdTest() {

        DemoEntity demoEntity = demoDao.findDemoById(2L);

        System.out.println(JSONObject.toJSONString(demoEntity));
    }

}
