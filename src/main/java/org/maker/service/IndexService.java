package org.maker.service;

import org.maker.pojo.Edits;
import org.maker.pojo.Essaythemes;
import org.maker.pojo.Solicitarticless;

import java.util.List;
import java.util.Map;

public interface IndexService {
    //查询index首页菜单列表
    List<Edits> queryIndexMenuList();

    //查询首页征文本期话题title
    List<Essaythemes> queryEssaythemesTitleSpan();

    //查询首页征文内容
    List<Solicitarticless> queryIndexSolicitarticlesUl(Solicitarticless solicitarticless);

    //查询首页下期征文标题以及已投稿个数
    Map<String,Object> queryNextEssayAndNumber();

    //查询首页往期征文展示
    List<Solicitarticless> queryPastArtWITHfive();

}
