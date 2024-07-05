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
        int left = ((screenWidth - visibleWidth) / 2);
        int top = ((screenHeight - visibleHeight) / 2)-visibleBottomOffset;
        return new AreaPoint(left, top, visibleWidth, visibleHeight, screenWidth, screenHeight);
    }
}