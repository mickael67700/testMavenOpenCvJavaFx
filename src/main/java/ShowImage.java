import java.util.List;
import java.util.ArrayList;


import org.bytedeco.javacpp.Loader;
import org.bytedeco.opencv.opencv_core.*;
import org.bytedeco.opencv.opencv_java;
import org.opencv.core.*;
import org.opencv.core.Mat;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import static org.opencv.imgproc.Imgproc.MORPH_RECT;
import static org.opencv.imgproc.Imgproc.getStructuringElement;
import java.io.File;
import net.sourceforge.tess4j.*;

public class ShowImage {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("org.bytedeco.openblas.load", "mkl");
        Loader.load(opencv_java.class);
        // Reading the Image from the file and storing it in to a Matrix object
        String file ="/home/mike/APPLICATIONS/JAVA/ALGOLEETCODE/testMavenOpenCvJavaFx/src/main/resources/test.jpg";
        Mat src = Imgcodecs.imread(file);

        // Creating an empty matrix to store the result
        Mat dst = new Mat();

        // Applying MedianBlur on the Image
        Imgproc.medianBlur(src, dst, 15);

        // Writing the image
        Imgcodecs.imwrite("/home/mike/APPLICATIONS/JAVA/ALGOLEETCODE/testMavenOpenCvJavaFx/src/main/resources/test.jpg", dst);

        System.out.println("Image Processed");
    }
}
