package org.maker.service.impl;

import org.maker.dao.TreesMapper;
import org.maker.pojo.Solicitarticless;
import org.maker.service.Adverservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements Adverservice {

    @Autowired
    private TreesMapper treesMapper;

    @Override
    public List<Solicitarticless> querySpread() {
        return treesMapper.querySpread();
    }


}
