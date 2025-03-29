package com.example.examgiuaki;

public class WBB {

    String wbbFileName;
    String wbbFb;
    String wbbIns;

    public WBB(String wbbFileName, String wbbFb, String wbbIns) {
        this.wbbFileName = wbbFileName;
        this.wbbFb = wbbFb;
        this.wbbIns = wbbIns;
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
