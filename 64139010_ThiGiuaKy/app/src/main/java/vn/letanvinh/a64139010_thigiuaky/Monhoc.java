package vn.letanvinh.a64139010_thigiuaky;

import java.io.Serializable;

public class Monhoc implements Serializable {
    private String name;
    private String description;

    public Monhoc(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
