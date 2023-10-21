package com.test.basic.Services;

import com.test.basic.Entities.Test;
import com.test.basic.Repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public Test save(Test test){
        return testRepository.save(test);
    }
    public List<Test> getAll() {
        return testRepository.findAll();
    }
}
