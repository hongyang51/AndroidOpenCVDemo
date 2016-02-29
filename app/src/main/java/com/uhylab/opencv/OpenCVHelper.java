package com.uhylab.opencv;

/**
 * Created by xyb on 16/2/26 at UHylab
 *
 * @version 1.0
 */
public class OpenCVHelper {
    static {
        System.loadLibrary("opencv_java3");
        System.loadLibrary("OpenCV");
    }
    public static native int[] gray(int[] buf, int w, int h);
}
