package com.hzkj.sacn.calculate;

/**
 * author: felix_hyj
 * CreateAt: 2024/7/4
 */
public class AreaPoint {
    public AreaPoint(int left, int top, int visibleWidth, int visibleHeight, int screenWidth, int screenHeight) {
        this.left = left;
        this.top = top;
        this.visibleWidth = visibleWidth;
        this.visibleHeight = visibleHeight;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    public int left;
    public int top;

    @Override
    public String toString() {
        return "AreaPoint{" +
                "left=" + left +
                ", top=" + top +
                ", visibleWidth=" + visibleWidth +
                ", visibleHeight=" + visibleHeight +
                ", screenWidth=" + screenWidth +
                ", screenHeight=" + screenHeight +
                '}';
    }

    public int visibleWidth;
    public int visibleHeight;
    public int screenWidth;
    public int screenHeight;
}