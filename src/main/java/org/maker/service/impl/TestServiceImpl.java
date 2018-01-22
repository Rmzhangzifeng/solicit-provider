package org.maker.service.impl;

import org.maker.dao.TreesMapper;
import org.maker.pojo.Trees;
import org.maker.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TreesMapper treesMapper;

    @Override
    public String demo(String str) {
        List<Trees> list = treesMapper.queryByPid("0");
        return list.get(0).getText()+"------"+str;
    }
}
