package MainPackage.models;

import java.sql.Timestamp;

public class Catogory {
    private Timestamp id;
    private String catogoryName;

    public Timestamp getId() {
        return id;
    }

    public void setId(Timestamp id) {
        this.id = id;
    }

    public String getCatogoryName() {
        return catogoryName;
    }

    public void setCatogoryName(String catogoryName) {
        this.catogoryName = catogoryName;
    }
}
