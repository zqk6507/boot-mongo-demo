package com.zqk.mongodb.dao;


import com.zqk.mongodb.entity.DemoEntity;

public interface DemoDao {

    void saveDemo(DemoEntity demoEntity);

    void removeDemo(Long id);

    void updateDemo(DemoEntity demoEntity);

    DemoEntity findDemoById(Long id);
}