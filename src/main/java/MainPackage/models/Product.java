package MainPackage.models;

import java.sql.Timestamp;

public class Product {
    private long id;
    private String title;
    private String description;
    private Double price;
    private int stocks;
    private Catogory catogory;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price <=0) {
            throw new RuntimeException("Price Can't be 0.");
        }else {
            this.price = price;
        }
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    public Catogory getCatogory() {
        return catogory;
    }

    public void setCatogory(Catogory catogory) {
        this.catogory = catogory;
    }
}
