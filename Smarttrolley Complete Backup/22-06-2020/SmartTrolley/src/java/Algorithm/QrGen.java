package Algorithm;

/**
 *
 * @author Swathy
 */

import DB.ConnectionClass;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;
import java.util.Random;
import javax.imageio.ImageIO;

public class QrGen {

    String result;

    /**
     *
     * @param result
     */

    public String GenQr(String result) {

      //  String phno = result;

        Random r = new Random();
        int r_num = r.nextInt(1111) + 999;

        String filePath = "F:\\Anuja\\PCPL\\Android\\Smart Trolly\\Project\\SmartTrolley\\web\\QRCode\\QRCode_" + r_num + ".png";

        int size = 250;
        String fileType = "png";
        File myFile = new File(filePath);
        try {

            Map<EncodeHintType, Object> hintMap = new EnumMap<EncodeHintType, Object>(EncodeHintType.class);
            hintMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");

            // Now with zxing version 3.2.1 you could change border size (white border size to just 1)
            hintMap.put(EncodeHintType.MARGIN, 1); /* default = 4 */

            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix byteMatrix = qrCodeWriter.encode(result, BarcodeFormat.QR_CODE, size,
                    size, hintMap);
            int QWidth = byteMatrix.getWidth();
            BufferedImage image = new BufferedImage(QWidth, QWidth,
                    BufferedImage.TYPE_INT_RGB);
            image.createGraphics();

            Graphics2D graphics = (Graphics2D) image.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, QWidth, QWidth);
            graphics.setColor(Color.BLACK);

            for (int i = 0; i < QWidth; i++) {
                for (int j = 0; j < QWidth; j++) {
                    if (byteMatrix.get(i, j)) {
                        graphics.fillRect(i, j, 1, 1);
                    }
                }
            }
            ImageIO.write(image, fileType, myFile);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath+"";
    }
    
    
//    public static void main(String[] args) {
//        QrGen q =new QrGen();
//        String qq= q.GenQr("1234");
//    }
}
