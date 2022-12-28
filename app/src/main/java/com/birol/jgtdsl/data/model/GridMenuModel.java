package com.birol.jgtdsl.data.model;

public class GridMenuModel {
    private String name;
    private int imgid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public GridMenuModel(String name, int imgid) {
        this.name = name;
        this.imgid = imgid;
    }
}
