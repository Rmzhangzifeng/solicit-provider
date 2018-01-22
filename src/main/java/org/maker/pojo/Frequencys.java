package org.maker.pojo;

import java.io.Serializable;
import java.util.Date;

public class Frequencys  implements Serializable {
    private Integer frequencyid;

    private String frequencytitle;

    private Integer anchorid;

    private String frequencysource;

    private Date releasetime;

    private String frequencyconver;

    public Integer getFrequencyid() {
        return frequencyid;
    }

    public void setFrequencyid(Integer frequencyid) {
        this.frequencyid = frequencyid;
    }

    public String getFrequencytitle() {
        return frequencytitle;
    }

    public void setFrequencytitle(String frequencytitle) {
        this.frequencytitle = frequencytitle == null ? null : frequencytitle.trim();
    }

    public Integer getAnchorid() {
        return anchorid;
    }

    public void setAnchorid(Integer anchorid) {
        this.anchorid = anchorid;
    }

    public String getFrequencysource() {
        return frequencysource;
    }

    public void setFrequencysource(String frequencysource) {
        this.frequencysource = frequencysource == null ? null : frequencysource.trim();
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public String getFrequencyconver() {
        return frequencyconver;
    }

    public void setFrequencyconver(String frequencyconver) {
        this.frequencyconver = frequencyconver == null ? null : frequencyconver.trim();
    }
}