package interfaces;

/**
 *
 * @author Polis
 */
public class AgoraParadosi implements Asfalismeno {
    
    private String description;
    private float price;
    private float weight;
    public boolean fragile;
    private float posoAsfalisis;
    public float width, height, depth;

    public AgoraParadosi() {}

    public AgoraParadosi(String description, float price, float weight, boolean fragile, float posoAsfalisis, float width, float height, float depth) {
        this.description = description;
        this.price = price;
        this.weight = weight;
        this.fragile = fragile;
        this.posoAsfalisis = posoAsfalisis;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isFragile() {
        return fragile;
    }
    
    public float getPosoAsfalisis() {
        return posoAsfalisis;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getDepth() {
        return depth;
    }
    
    @Override
    public float getApodektiTimi(float pososto) {
        return (pososto*price)/100;
    }
    
}
