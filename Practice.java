import java.io.IOException;

import util.CompressImage;

public class Practice {
    public static void main(String[] args) throws IOException {
        CompressImage img = new CompressImage("C:/Users/shahh/Downloads/neom-B8892rcCI7g-unsplash.jpg", 0.28f);
        img.build();
        img.saveCompressed("C:\\Het Shah\\Photoshop\\Photoshop-Work\\Misc\\temp\\compressed.jpg");
    }
}
