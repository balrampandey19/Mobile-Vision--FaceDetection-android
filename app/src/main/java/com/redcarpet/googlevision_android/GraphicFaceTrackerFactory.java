package com.redcarpet.googlevision_android;

import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.face.Face;
import com.redcarpet.googlevision_android.Camera.GraphicOverlay;

/**
 * Created by redcarpet on 4/18/17.
 */

public class GraphicFaceTrackerFactory  implements MultiProcessor.Factory<Face> {
    GraphicOverlay overlay;

    public GraphicFaceTrackerFactory(GraphicOverlay graphicOverlay)
    {
        this.overlay=graphicOverlay;

    }
    @Override
    public Tracker<Face> create(Face face) {
        return new GraphicFaceTracker(overlay);
    }
}