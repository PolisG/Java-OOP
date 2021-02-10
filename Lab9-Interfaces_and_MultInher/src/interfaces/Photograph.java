package interfaces;

/**
 *
 * @author Polis
 */
public class Photograph implements ProsPolisi {
    private String description;
    private float price;
    private boolean coloured;

    public Photograph() {}

    public Photograph(String description, float price, boolean coloured) {
        this.description = description;
        this.price = price;
        this.coloured = coloured;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isColoured() {
        return coloured;
    }

    public void setColoured(boolean coloured) {
        this.coloured = coloured;
    }
    
    @Override
    public float getApodektiTimi(float pososto) {
        return (pososto*price)/100;
    }
    
}
