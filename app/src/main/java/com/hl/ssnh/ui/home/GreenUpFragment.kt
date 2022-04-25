package com.hl.ssnh.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hl.ssnh.R
import com.hl.ssnh.databinding.ActivitySbfmBinding
import com.hl.ssnh.databinding.FragmentGreenUpBinding
import com.hl.ssnh.ui.utils.TypefaceUtil

class GreenUpFragment : Fragment() {

    private lateinit var binding: FragmentGreenUpBinding

    var describ1 = "➼ 1.首先任何股票都不要用过往的辉煌来评测未来，不是业绩好，股票好他就一直要涨的。绿线封顶代表股价下行期间，上涨很弱。"

    var buyStatus1 =  "➼ 1.股票在绿线下+红线下，说明及其弱的行情（第一种形态）， 必须看K<= 20 + 收盘时大阳线（>4个点）+ 相交  (非相交的一日内大上扬不考虑)，如果前一日是倒垂长引线也不考虑\n\n" +
                      "➼ 2.股价在绿线之下，下跌挨着股票绿线（说明站上红线，第二种形态），绿线水平（说明趋于平稳）不用等相交后买如果有大于4个点的反弹可以买入，但是这时候千万要警惕下一轮下跌的开始\n\n"+
                      "➼ 3.股价在绿线下，但是接触着红黑黄，经常红黑黄共同相较于一个股价，这时候说明股价暂时平稳（第三种形态），这时候如果k<40 + 反转红1.5 可以不相交提前参与\n\n"+
                      "➼ 4.股价在绿线下，但是接触着红黑黄，且已经站上黄黑线，这时候如果已经过了相交点，如果大于3个点可以考虑买入\n\n"




    var saleStatus1 =  "➼ 1.如果股票始终在绿线下，平头2日以上或2日以上小跌形态四（在五日线上没有超过1个点的跌排除在外）坚决卖出（说明股价涨不起来），如果三线归位可以在等等，连续三日绿坚决卖。\n\n" +
            "➼ 2.如果股票还在绿线下，锐角向下或拐头向下两日即使股价还在五日黑线上也坚决卖；\n\n" +
            "➼ 3.如果股票站上绿线，且一直在5日线上，必须红黑黄上扬或者四线归位，（第三种），则在收盘单日突破黄线日2个点选择卖出或者2日绿线卖出，但是这个时候小心一种假象虽然站上了绿线，但是红线趋势是向下的，这时候比较危险有可能开启新一轮的下跌，所以如果趋势改变不要恋战\n\n" +
            "➼ 4.如果股票在绿线红线下，当日收盘上下引线很长，然后以微红收盘然后前一天反弹力度也很小，说明主力分歧很大这时候往往第二天可能大跌，所以最好卖出；\n\n" +
            "➼ 5.红绿之下且股价相隔甚远且是斜坡的绿线，这时候来一个涨停的大阳，明天又来一个超过三个点的阴线；这时候一定要跑\n\n"





    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGreenUpBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    fun initView(){
        TypefaceUtil.setTextViewFontToDIN(requireContext(),binding.describ1)
         TypefaceUtil.setTextViewFontToDIN(requireContext(),binding.buycontent1)
        TypefaceUtil.setTextViewFontToDIN(requireContext(),binding.salecontent1)
        binding.buycontent1.text = buyStatus1
        binding.salecontent1.text = saleStatus1
        binding.describ1.text = describ1
    }
}