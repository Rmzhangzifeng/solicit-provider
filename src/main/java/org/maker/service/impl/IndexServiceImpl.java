package org.maker.service.impl;

import org.maker.dao.EditsMapper;
import org.maker.pojo.Edits;
import org.maker.pojo.Essaythemes;
import org.maker.pojo.Solicitarticless;
import org.maker.pojo.SolicitarticlessMongoContent;
import org.maker.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IndexServiceImpl implements IndexService{

    @Autowired
    private EditsMapper editsMapper;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Edits> queryIndexMenuList() {
        return editsMapper.queryIndexMenuList();
    }

    @Override
    public List<Essaythemes> queryEssaythemesTitleSpan()  {
        return editsMapper.queryEssaythemesTitleSpan();
    }

    @Override
    public List<Solicitarticless> queryIndexSolicitarticlesUl(Solicitarticless solicitarticless)  {
        List<Solicitarticless> solicitarticlessList = editsMapper.queryIndexSolicitarticlesUl(solicitarticless);
        for (int i=0;i<solicitarticlessList.size();i++){
            List<SolicitarticlessMongoContent> solicitarticlessMongoContent = mongoTemplate.find(new Query(Criteria.where("contentId").is(solicitarticlessList.get(i).getSolicitarticlesid())),SolicitarticlessMongoContent.class,"SolicitArt");
            if(solicitarticlessMongoContent.size()>0){
                if(!solicitarticlessMongoContent.get(0).getClessContent().equals(null) && !("").equals(solicitarticlessMongoContent.get(0).getClessContent())){
                    solicitarticlessList.get(i).setContentStr(solicitarticlessMongoContent.get(0).getClessContent());
                }
            }

        }
        return solicitarticlessList;
    }

    @Override
    public Map<String, Object> queryNextEssayAndNumber() {
        List<Essaythemes> essaythemesList = editsMapper.queryNextEssaythemes();
        Long yiTouGaoNumber = editsMapper.queryYiTouGaoNumber(essaythemesList.get(0));
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("nextEssaythemesTitle",essaythemesList.get(0).getTitle());
        map.put("NextYiTouNumber",yiTouGaoNumber);
        return map;
    }

    @Override
    public List<Solicitarticless> queryPastArtWITHfive() {
        return editsMapper.queryPastArtWITHfive();
    }
}
