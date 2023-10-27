package MainPackage.models;

import java.sql.Timestamp;

public class Catogory {
    private long id;
    private String catogoryName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCatogoryName() {
        return catogoryName;
    }

    public void setCatogoryName(String catogoryName) {
        this.catogoryName = catogoryName;
    }
}
