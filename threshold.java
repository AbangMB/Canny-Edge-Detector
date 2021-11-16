import java.awt.Color;
import java.awt.image.BufferedImage;
public class threshold {
public static BufferedImage threshold(BufferedImage input, int T){
        BufferedImage image = deepCopy(input);

        int width = image.getWidth();
        int height = image.getHeight();
        
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                Color c = new Color(image.getRGB(i, j));
                if(c.getRed() + c.getGreen() + c.getBlue() < T){
                    Color newColor = Color.BLACK;
                    image.setRGB(i, j, newColor.getRGB());
                }
                else{
                    Color newColor = Color.WHITE;
                    image.setRGB(i, j, newColor.getRGB());
                }
            }
        }

        return image;
    }

    private static BufferedImage deepCopy(BufferedImage input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
