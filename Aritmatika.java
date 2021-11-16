import java.awt.Color;
import java.awt.image.BufferedImage;
public class Aritmatika {
public static BufferedImage aritmatikaPenjumlahan(BufferedImage input, BufferedImage input2) {
        BufferedImage image = deepCopy(input);
        BufferedImage image2 = deepCopy(input2);

        int width = image.getWidth();
        int height = image.getHeight();
        int width2 = image2.getWidth();
        int height2 = image2.getHeight();

        for (int i = 0; i < Math.min(width, width2); i++) {
            for (int j = 0; j < Math.min(height, height2); j++) {
                Color c = new Color(image.getRGB(i, j));
                Color c2 = new Color(image2.getRGB(i, j));

                int red = Math.min(255, c.getRed() + c2.getRed());
                int green = Math.min(255, c.getGreen() + c2.getGreen());
                int blue = Math.min(255, c.getBlue() + c2.getBlue());

                Color newColor = new Color(red, green, blue);
                image.setRGB(i, j, newColor.getRGB());
            }
        }

        return image;
    }

    public static BufferedImage aritmatikaPengurangan(BufferedImage input, BufferedImage input2) {
        BufferedImage image = deepCopy(input);
        BufferedImage image2 = deepCopy(input2);

        int width = image.getWidth();
        int height = image.getHeight();
        int width2 = image2.getWidth();
        int height2 = image2.getHeight();

        for (int i = 0; i < Math.min(width, width2); i++) {
            for (int j = 0; j < Math.min(height, height2); j++) {
                Color c = new Color(image.getRGB(i, j));
                Color c2 = new Color(image2.getRGB(i, j));

                int red = Math.max(0, c.getRed() - c2.getRed());
                int green = Math.max(0, c.getGreen() - c2.getGreen());
                int blue = Math.max(0, c.getBlue() - c2.getBlue());

                Color newColor = new Color(red, green, blue);
                image.setRGB(i, j, newColor.getRGB());
            }
        }

        return image;
    }

    public static BufferedImage aritmatikaPerkalian(BufferedImage input, BufferedImage input2) {
        BufferedImage image = deepCopy(input);
        BufferedImage image2 = deepCopy(input2);

        int width = image.getWidth();
        int height = image.getHeight();
        int width2 = image2.getWidth();
        int height2 = image2.getHeight();

        for (int i = 0; i < Math.min(width, width2); i++) {
            for (int j = 0; j < Math.min(height, height2); j++) {
                Color c = new Color(image.getRGB(i, j));
                Color c2 = new Color(image2.getRGB(i, j));

                int red = Math.min(255, c.getRed() * c2.getRed());
                int green = Math.min(255, c.getGreen() * c2.getGreen());
                int blue = Math.min(255, c.getBlue() * c2.getBlue());

                Color newColor = new Color(red, green, blue);
                image.setRGB(i, j, newColor.getRGB());
            }
        }
        return image;
    }

    private static BufferedImage deepCopy(BufferedImage input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
