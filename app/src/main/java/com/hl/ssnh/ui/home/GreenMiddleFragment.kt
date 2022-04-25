package com.hl.ssnh.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hl.ssnh.R
import com.hl.ssnh.databinding.FragmentGreenMiddleBinding
import com.hl.ssnh.databinding.FragmentGreenUpBinding
import com.hl.ssnh.ui.utils.TypefaceUtil

class GreenMiddleFragment : Fragment() {

    var buy = "➼ 1.一路绿线下跌，绿线接触到股价这时候四线归一的缠绕，绿线在顶红线托底，\n\n" +
            "➼ 2.股价碰到红线K<40的反弹才是买点；大于这个有风险；\n\n" +
            "➼ 3.股票在5，10上反弹即可买入；\n\n"+
            "➼ 4.股价接触到绿线后，一定是相交反弹在买；\n\n"+
            "➼ 5.股价在大于80后的回调后，k<60的反弹买或者k上勾买；\n\n"

    var sales = "➼ 1.股价挨着红线上升，说明趋势很弱，连续两天收绿卖掉；\n\n" +
            "➼ 2.股价如果一直在5，10上+四线归位不卖，等突破10日2个点卖；\n\n" +
            "➼ 3.股价在五日线以上，+四线归位但是某一日突发超跌>6个点则卖掉，等待企稳\n\n" +
            "➼ 4.股价k>90后，第二日股价收绿全部卖,在次买入一定是大调整过后的K小于40 的反弹 且股价没有碰到过红线\n\n" +
            "➼ 5.股价黄红相交绿线在底，这时候要小心了股价要下去了；\n\n" +
            "➼ 6.上下引线很长，且收红的的大亏线，即使5日线上也卖掉；\n\n" +
            "➼ 7.k超过90后一个小回调又上去一个大阳；这时候不要入，往往是诱多；\n\n" +
            "➼ 8.股票在高位的两日或三日的平头（包括向下的平头和凹陷的平头）或三日内股价波动都在0.5以内的波动赶紧卖，后面有大跌\n\n" +
            "➼ 9.红反弹上车如果连续两天绿棒或者上车后一根大于3个点的大绿棒赶紧下车；\n\n" +
            "➼ 10.上引线很长的绿棒（大于2个点）或上影线很长的微红棒+相交，这时候即使在5日线上也卖；\n\n"+
            "➼ 11.连续两日收绿+相交，没破10日也卖；\n\n"+
            "➼ 12.绿线托底，这时候股价接触到红黄黑说明股价开始走弱，红线要上去，这时候如果k在水下，在相交后买入，如果上杨后红绿相交的收红，要考虑卖掉了；\n\n"+
            "➼ 13.股价接触到绿线后，一定是相交反弹在买；\n\n"
    private lateinit var binding: FragmentGreenMiddleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGreenMiddleBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        TypefaceUtil.setTextViewFontToDIN(requireContext(), binding.describ1)
        TypefaceUtil.setTextViewFontToDIN(requireContext(), binding.buycontent1)
        TypefaceUtil.setTextViewFontToDIN(requireContext(), binding.salecontent1)
        binding.buycontent1.text = buy
        binding.salecontent1.text = sales
    }
}