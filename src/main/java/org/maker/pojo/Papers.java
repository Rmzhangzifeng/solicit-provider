package org.maker.pojo;

import java.io.Serializable;

public class Papers implements Serializable {
    private Integer paperid;

    private Integer essayid;

    private Integer essayntegration;

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public Integer getEssayid() {
        return essayid;
    }

    public void setEssayid(Integer essayid) {
        this.essayid = essayid;
    }

    public Integer getEssayntegration() {
        return essayntegration;
    }

    public void setEssayntegration(Integer essayntegration) {
        this.essayntegration = essayntegration;
    }
}