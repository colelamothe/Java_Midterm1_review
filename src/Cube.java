public class Cube {
    private int length;
    private int width;
    private int height;
    private int idCode;
    private static int identifier = 0;

    // constructor
    public Cube(int length, int width, int height) {
        if(length>0) {
            this.length = length;
        }
        this.width = width;
        this.height = height;
        idCode = identifier;
        identifier++;
    }

    // methods
    public int volume(){
        return this.length*this.width*this.height;
    }

    public void setLength(int newLength){
        length = newLength;
    }

    public void setDimensions(int newLength, int newWidth, int newHeight){
        this.length = newLength;
        this.width = newWidth;
        this.height = newHeight;
    }

    public int getLength(){
        return this.length;
    }
    // output

    public String toString(){
        String str = "Length:\t" + length + "\nwidth:\t" + width + "\nheight:\t"+height + "\nvolume:\t" + volume () + "\nID:\t"+idCode;
        return str;
    }
}
