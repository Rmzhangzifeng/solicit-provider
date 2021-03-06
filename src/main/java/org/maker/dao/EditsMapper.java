package org.maker.dao;


import org.maker.pojo.Edits;
import org.maker.pojo.Essaythemes;
import org.maker.pojo.Solicitarticless;

import java.util.List;

public interface EditsMapper {
    List<Edits> queryIndexMenuList();

    List<Essaythemes> queryEssaythemesTitleSpan();

    List<Solicitarticless> queryIndexSolicitarticlesUl(Solicitarticless solicitarticless);

    List<Essaythemes> queryNextEssaythemes();

    Long queryYiTouGaoNumber(Essaythemes essaythemes);

    List<Solicitarticless> queryPastArtWITHfive();
}