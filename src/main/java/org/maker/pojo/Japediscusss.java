package org.maker.pojo;

import java.io.Serializable;
import java.util.Date;

public class Japediscusss implements Serializable {
    private Integer japediscussid;

    private Integer usergid;

    private String japediscusscontent;

    private Date japediscusstime;

    private Integer japediscussstatus;

    private Integer japecid;

    private String japedate;


    private String username;

    public Integer getJapediscussid() {
        return japediscussid;
    }

    public void setJapediscussid(Integer japediscussid) {
        this.japediscussid = japediscussid;
    }

    public Integer getUsergid() {
        return usergid;
    }

    public void setUsergid(Integer usergid) {
        this.usergid = usergid;
    }

    public String getJapediscusscontent() {
        return japediscusscontent;
    }

    public void setJapediscusscontent(String japediscusscontent) {
        this.japediscusscontent = japediscusscontent == null ? null : japediscusscontent.trim();
    }

    public Date getJapediscusstime() {
        return japediscusstime;
    }

    public void setJapediscusstime(Date japediscusstime) {
        this.japediscusstime = japediscusstime;
    }

    public Integer getJapediscussstatus() {
        return japediscussstatus;
    }

    public void setJapediscussstatus(Integer japediscussstatus) {
        this.japediscussstatus = japediscussstatus;
    }

    public Integer getJapecid() {
        return japecid;
    }

    public void setJapecid(Integer japecid) {
        this.japecid = japecid;
    }

    public String getJapedate() {
        return japedate;
    }

    public void setJapedate(String japedate) {
        this.japedate = japedate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}