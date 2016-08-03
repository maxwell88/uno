 
package michaelunogame;
 
public class Card {

    private String colour;
    private String type;
    private int value;
    private String image;

    public Card(String colour, String type, int value, String image) {
        this.colour = colour;
        this.type = type;
        this.value = value;
        this.image = image;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return ("Card: Colour=" + colour + ", Type=" + type + ", Value=" + value + ", Image=" + image);
    }

}
