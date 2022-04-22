package com.hl.ssnh.ui;

import android.content.Context;

import com.hl.ssnh.ui.utils.FontUtil;

import net.lucode.hackware.magicindicator.buildins.ArgbEvaluatorHolder;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;


/**
 * @Description: 登录注册页控制器title
 * @Author: Elvis
 * @Date: 2019/10/10 15:33
 * @Version: V1.0
 **/
public class RecordControPageTitle extends SimplePagerTitleView  {
    private int defaultSize = 14;
    private int selSize = 16;

    private Context mContext;

    public RecordControPageTitle(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    public void onLeave(int index, int totalCount, float leavePercent, boolean leftToRight) {
        int color = ArgbEvaluatorHolder.eval(leavePercent, mSelectedColor, mNormalColor);
        setTextColor(color);
        setTextSize(defaultSize);
        FontUtil.defaultFont(this);
    }

    @Override
    public void onEnter(int index, int totalCount, float enterPercent, boolean leftToRight) {
        int color = ArgbEvaluatorHolder.eval(enterPercent, mNormalColor, mSelectedColor);
        setTextColor(color);
        setTextSize(selSize);
        FontUtil.mediumFont(this);
    }

    @Override
    public void onSelected(int index, int totalCount) {
        super.onSelected(index, totalCount);
        setTextSize(selSize);
        FontUtil.mediumFont(this);
    }

    @Override
    public void onDeselected(int index, int totalCount) {
        super.onDeselected(index, totalCount);
        setTextSize(defaultSize);
        FontUtil.defaultFont(this);
    }
}
