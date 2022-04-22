package com.hl.ssnh.ui;

import android.content.Context;
import android.view.View;

import com.hl.ssnh.R;
import com.hl.ssnh.ui.utils.ColorUtils;
import com.hl.ssnh.ui.utils.Dip2PixleUtil;
import com.hl.ssnh.ui.utils.INavigarorCallBack;

import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;



import java.util.List;

public class RecordCenterNavAdapter extends CommonNavigatorAdapter {

    private String selecColor = "#FF018786";
    private String unSelecColor = "#FF757575";

    private Context mContext;
    private List<String> mDatas;
    private INavigarorCallBack mCallBack;

    public RecordCenterNavAdapter(Context context, List datas, INavigarorCallBack callBack) {
        this.mContext = context;
        this.mDatas = datas;
        this.mCallBack = callBack;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public IPagerTitleView getTitleView(Context context, int index) {
        RecordControPageTitle clipPagerTitleView = new RecordControPageTitle(context);
        clipPagerTitleView.setText(mDatas.get(index));
        clipPagerTitleView.setNormalColor(ColorUtils.getColor(unSelecColor));
        clipPagerTitleView.setSelectedColor(ColorUtils.getColor(selecColor));
        clipPagerTitleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCallBack != null){
                    mCallBack.onNavTabClick(index);
                }
            }
        });
        return clipPagerTitleView;
    }


    @Override
    public IPagerIndicator getIndicator(Context context) {
        LinePagerIndicator indicator = new LinePagerIndicator(context);
        indicator.setColors(ColorUtils.getColor(selecColor));
        indicator.setMode(LinePagerIndicator.MODE_EXACTLY);
        indicator.setPadding(0, Dip2PixleUtil.dp2px(context,5),0,0);
        indicator.setLineWidth(Dip2PixleUtil.dp2px(context,15));
        return indicator;
    }
}
