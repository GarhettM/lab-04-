package group.lab;

import com.sun.imageio.plugins.common.ImageUtil;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BitMap {

    public static BufferedImage bitMapImgUpload(String imgpath) throws IOException {

        try {
            File img_file = new File(imgpath);
            BufferedImage img = ImageIO.read(img_file);
            System.out.println("file uploaded");
            return img;

            }
            catch (IOException e){
                e.printStackTrace();
            }
            return null;
            }

    public static BufferedImage changeColorImg(BufferedImage img_file) {

        for (int i = 0; i < img_file.getWidth(); i++) {
            for (int j = 0; j < img_file.getHeight(); j++) {
                Color col = new Color(img_file.getRGB(i, j));
                int r = 255 - col.getRed();
                int g = 255 - col.getGreen();
                int b = 255 - col.getBlue();
                int a = col.getAlpha();
                Color gColor = new Color(r, g, b, a);
                img_file.setRGB(j, i, gColor.getRGB());
            }

        }
        return img_file;

    }







}
