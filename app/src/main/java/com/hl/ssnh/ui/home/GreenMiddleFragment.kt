package com.hl.ssnh.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hl.ssnh.R
import com.hl.ssnh.databinding.FragmentGreenMiddleBinding
import com.hl.ssnh.databinding.FragmentGreenUpBinding

class GreenMiddleFragment : Fragment() {

    var content =
            "            \"\\n\" +\n" +
            "            \" 绿线缠绕：\\n\" +\n" +
            "            \"    当绿线不在上面也不在下面，这时候股票处于盘整期，不要急于参与，如果可以用画线找到底最好，设置底位轻仓1/3买入，在顶部位置卖出。这时候风险比较大，多空博弈，主力吸筹吗，主力拉伸卖货都在这里，胜率在40%左右。所以亏损5个点及时止损。涨太多不要参与；\\n\" +\n" +
            "            \"\\n\" +\n" +
            "            \"    非买入点：\\n\" +\n" +
            "            \"    1.三线往下，这时候低位+弱反弹不要参与；\\n\" +\n" +
            "            \"\\n\" +\n" +
            "            \"    卖点：\\n\" +\n" +
            "            \"    1.将周期走完\\n\" +\n" +
            "            \"\\n\" +\n" +
            "            \"\\n\" +\n" +
            "            \"\\n\" +"

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
        binding.content.text = content
    }
}