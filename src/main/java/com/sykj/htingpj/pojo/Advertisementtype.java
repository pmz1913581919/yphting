package com.sykj.htingpj.pojo;
/**
* 
* @ClassName Advertisementtype
* @description 广告位模块表
* @author Administrator
* @version 2019年3月3日
*/	
public class Advertisementtype {
    private Integer atid;//主键，自增

    private String atname;//模块名称

    private String atpx;//图片要求尺寸

    public Integer getAtid() {
        return atid;
    }

    public void setAtid(Integer atid) {
        this.atid = atid;
    }

    public String getAtname() {
        return atname;
    }

    public void setAtname(String atname) {
        this.atname = atname == null ? null : atname.trim();
    }

    public String getAtpx() {
        return atpx;
    }

    public void setAtpx(String atpx) {
        this.atpx = atpx == null ? null : atpx.trim();
    }
}