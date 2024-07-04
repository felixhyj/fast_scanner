package com.hzkj.sacn.calculate;

/**
 * author: felix_hyj
 * CreateAt: 2024/7/4
 */
public class VisibleAreaHelper {
    public static int visibleWidth = 666;
    public static int visibleHeight = 686;

    public static AreaPoint calculateVisibleAreaTopLeft(int screenWidth, int screenHeight) {
        visibleWidth=visibleWidth*3;
        visibleHeight=visibleHeight*3;
        int left = ((screenWidth - visibleWidth) / 2);
        int top = ((screenHeight - visibleHeight) / 2);
        return new AreaPoint(left, top, visibleWidth, visibleHeight, screenWidth, screenHeight);
    }
}