package org.maker.pojo;

import java.io.Serializable;

public class Roles implements Serializable {

    private Integer roleid;

    private String rolename;


    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
