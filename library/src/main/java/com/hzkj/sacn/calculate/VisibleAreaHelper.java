package com.hzkj.sacn.calculate;

/**
 * author: felix_hyj
 * CreateAt: 2024/7/4
 */
public class VisibleAreaHelper {
    public static int visibleWidth = 666;
    public static int visibleHeight = 686;
    public static int visibleBottomOffset = 0;

    public static AreaPoint calculateVisibleAreaTopLeft(int screenWidth, int screenHeight) {
        int width= (int) (screenWidth*0.7);
        int left = ((screenWidth - width) / 2);
        int top = ((screenHeight - width) / 2)-visibleBottomOffset;
        return new AreaPoint(left, top, width, width, screenWidth, screenHeight);
    }
}