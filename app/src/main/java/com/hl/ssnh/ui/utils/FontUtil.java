package com.hl.ssnh.ui.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * function:应用字体
 *
 * <p>
 * Created by Leo on 2018/2/2.
 */
@SuppressWarnings("unused")
public final class FontUtil {
    private static final String TAG = "FontUtil";

    /**
     * 获取当前手机系统字体比例大小
     * eg:MI 5:{较小：0.86，标准：1.0，中号：1.15，大号：1.32，超大：1.4，巨无霸：1.4}
     */
    public static float getCurrentFontScale(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    /**
     * 设置当前上下文应用的字体比例大小
     */
    @SuppressWarnings("deprecation")
    public static void setFontScale(Context context, float fontScale) {
        Resources resources = context.getResources();
        resources.getConfiguration().fontScale = fontScale;
        resources.updateConfiguration(null, null);
    }

    /**
     * 设置文字为medium类型,适用于没有emoji表情字符的TextView
     */
    public static void mediumFont(TextView textView) {
        if(textView == null) return;
        try {
            Typeface typeface = textView.getTypeface();
            if(typeface == null) typeface = Typeface.create("sans-serif", Typeface.NORMAL);
            textView.setTypeface(typeface);
            textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
            textView.getPaint().setStrokeWidth(1f);
        } catch(Exception e) {}
    }

    /**
     *  恢复系统字体类型
     */
    public static void defaultFont(TextView textView) {
        if(textView == null) return;
        try {
            Typeface typeface = textView.getTypeface();
            if(typeface == null) typeface = Typeface.create("sans-serif", Typeface.NORMAL);
            textView.setTypeface(typeface);
            textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
            textView.getPaint().setStrokeWidth(0.1f);
        } catch(Exception e) {}
    }

    public static void boldFont(TextView textView) {
        if(textView == null) return;
        try {
            Typeface typeface = textView.getTypeface();
            if(typeface == null) typeface = Typeface.create("sans-serif", Typeface.BOLD);
            textView.setTypeface(typeface);
            textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
            textView.getPaint().setStrokeWidth(1.5f);
        } catch(Exception e) {
        }
    }
}
