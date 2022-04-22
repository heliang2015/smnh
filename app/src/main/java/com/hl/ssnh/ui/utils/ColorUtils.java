package com.hl.ssnh.ui.utils;

import android.graphics.Color;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/**
 * @Description: 颜色工具
 * @Author: Elvis
 * @Date: 2021/5/4
 * @Version: V1.0
 **/
public class ColorUtils {
    @ColorInt
    public static int getColor(@NonNull Object color){
        if(color instanceof String){
            return Color.parseColor(color.toString());
        }
        return (int)color;
    }
}
