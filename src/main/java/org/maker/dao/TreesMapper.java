package org.maker.dao;


import org.maker.pojo.Advertisement;
import org.maker.pojo.Solicitarticless;
import org.maker.pojo.Trees;

import java.util.List;

public interface TreesMapper {
    List<Trees> queryByPid(String pid);

    List<Solicitarticless> querySpread();

    List<Advertisement> queryAd();
}