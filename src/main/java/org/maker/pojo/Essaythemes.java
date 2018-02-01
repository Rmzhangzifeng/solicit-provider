package org.maker.pojo;

import java.io.Serializable;
import java.util.Date;

public class Essaythemes implements Serializable {
    private Integer articletopicid;

    private String title;

    private String themecontent;

    private Date themestarttime;

    private Date themeendtime;

    private Integer themeendreview;

    private Integer themestatus;

    public Integer getThemestatus() {
        return themestatus;
    }

    public void setThemestatus(Integer themestatus) {
        this.themestatus = themestatus;
    }

    //结束时间Str
    private String endTimeStr;
    //开始时间Str
    private String startTimeStr;
    //删除的id集合
    private String idStr;

    private Integer emroles;

    public Integer getEmroles() {
        return emroles;
    }

    public void setEmroles(Integer emroles) {
        this.emroles = emroles;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getStartTimeStr() {
        return startTimeStr;
    }

    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    public String getEndTimeStr() {
        return endTimeStr;
    }

    public void setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
    }


    private String articletopicids;

    public String getArticletopicids() {
        return articletopicids;
    }

    public void setArticletopicids(String articletopicids) {
        this.articletopicids = articletopicids;
    }

    public Integer getThemeendreview() {
        return themeendreview;
    }

    public void setThemeendreview(Integer themeendreview) {
        this.themeendreview = themeendreview;
    }

    public Integer getArticletopicid() {
        return articletopicid;
    }

    public void setArticletopicid(Integer articletopicid) {
        this.articletopicid = articletopicid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getThemecontent() {
        return themecontent;
    }

    public void setThemecontent(String themecontent) {
        this.themecontent = themecontent == null ? null : themecontent.trim();
    }

    public Date getThemestarttime() {
        return themestarttime;
    }

    public void setThemestarttime(Date themestarttime) {
        this.themestarttime = themestarttime;
    }

    public Date getThemeendtime() {
        return themeendtime;
    }

    public void setThemeendtime(Date themeendtime) {
        this.themeendtime = themeendtime;
    }
}