package com.redcarpet.googlevision_android.Camera;

/**
 * Created by redcarpet on 4/17/17.
 */

public interface FaceTrackingListener {
    void onFaceLeftMove();
    void onFaceRightMove();
    void onFaceUpMove();
    void onFaceDownMove();
    void onGoodSmile();
    void onEyeCloseError();
    void onMouthOpenError();
    void onMultipleFaceError();

}
