package group.lab;

import com.sun.imageio.plugins.common.ImageUtil;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BitMap {
    public static BufferedImage bitMapImgUpload(String img_path){

        try {
//            File img_file = new File(imgpath);
//            String imgpath ;

            BufferedImage img = ImageIO.read(new File(img_path));
            return img;

            }
            catch (IOException e){
                System.out.println("did Not work");
                e.printStackTrace();
            }
            return null;
            }

    public static void saveImge(BufferedImage file, String savPath) throws IOException {
//        ImageIO.write(file,"BMP", new File(savPath));
        System.out.println(savPath);
//        System.out.println("filr saved");
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
                img_file.setRGB(i, j, gColor.getRGB());
            }

        }
        return img_file;

    }
// https://www.baeldung.com/java-resize-image
    public static BufferedImage CopImg(BufferedImage img_file) throws IOException{
        BufferedImage imgResize = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = imgResize.createGraphics();
        graphics2D.drawImage(img_file,0,0,100,100, null);
        graphics2D.dispose();
        return imgResize;



    }


    public static void DelImg(String fileImg){
        File imgObj = new File(fileImg);

        if (imgObj.delete()) {
            System.out.println("the deleted file: " + imgObj.getName());
        }
        else {
            System.out.println("it failed ti delete the file");

        }

    }














}
