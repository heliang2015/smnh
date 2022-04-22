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
    var buyStatus1 =  "  1.看K<= 20 + 收盘时大阳线（>4个点）+ 相交  (非相交的一日内大上扬不考虑)\n" +
            "  2.连续三天的小阳（0.1~0.9）+ 相交（这时候）可以上"

    var saleStatus1 =  " 1.平头2日或2日以上小跌坚决卖出（说明股价涨不起来）。\n" +
            " 2.锐角向下坚决卖；\n" +
            " 3.博对了大反弹，股票平稳涨跌没有出现三个点的大跌则相交时候卖；\n" +
            " 4.如果股票反弹很强势，一直在5日线上，则暂时稳住，大跌卖出；\n" +
            " 5.如果在k下上车，如果连续两天k很若，相交也很弱，+绿线有明显上去的趋势，这时候全清；"


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
        // TypefaceUtil.setTextViewFontToDIN(requireContext(),binding.content)
        binding.buycontent1.text = buyStatus1
        binding.salecontent1.text = saleStatus1
    }
}