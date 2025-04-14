package vn.letanvinh.a64139010_thigiuaky;

import java.io.Serializable;

public class WBB implements Serializable {
    private static final long serialVersionUID = 1L;
    int id_item;
    String wbbFileName;
    String wbbFb;
    String wbbIns;
    String wbbDescription;

    public WBB(int id_item, String wbbFileName, String wbbFb, String wbbIns, String wbbDescription) {
        this.id_item = id_item;
        this.wbbFileName = wbbFileName;
        this.wbbFb = wbbFb;
        this.wbbIns = wbbIns;
        this.wbbDescription = wbbDescription;
    }

    public String getWbbDescription() {
        return wbbDescription;
    }

    public void setWbbDescription(String wbbDescription) {
        this.wbbDescription = wbbDescription;
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