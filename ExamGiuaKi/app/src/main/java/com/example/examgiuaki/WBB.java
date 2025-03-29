package com.example.examgiuaki;

public class WBB {
    int id_item;
    String wbbFileName;
    String wbbFb;
    String wbbIns;

    public WBB(int id_item, String wbbFileName, String wbbFb, String wbbIns) {
        this.id_item = id_item;
        this.wbbFileName = wbbFileName;
        this.wbbFb = wbbFb;
        this.wbbIns = wbbIns;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public String getWbbFileName() {
        return wbbFileName;
    }

    public void setWbbFileName(String wbbFileName) {
        this.wbbFileName = wbbFileName;
    }

    public String getWbbFb() {
        return wbbFb;
    }

    public void setWbbFb(String wbbFb) {
        this.wbbFb = wbbFb;
    }

    public String getWbbIns() {
        return wbbIns;
    }

    public void setWbbIns(String wbbIns) {
        this.wbbIns = wbbIns;
    }
}
