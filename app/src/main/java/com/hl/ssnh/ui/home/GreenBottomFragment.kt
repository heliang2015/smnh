package com.hl.ssnh.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hl.ssnh.R
import com.hl.ssnh.databinding.FragmentGreenBottomBinding
import com.hl.ssnh.databinding.FragmentGreenMiddleBinding

class GreenBottomFragment : Fragment() {

    var content =    " 绿线托盘：\n" +
            "     这时候股价处于亢奋的上升期间，这时候赔钱概率比较低；\n" +
            "\n" +
            "  买入点：\n" +
            "     1.如果kdj相交下去后，k收盘是红的就可以参与不用等相交，亏损超过五个点后及时止损失；（这种情况根据大概率情况，胜率在70%以上，但是要担心最后一次的趋势反转那时候是大跌的开始，所以设置5个点的止损位）\n" +
            "\n" +
            "  卖出点：\n" +
            "     1.k>90 后钝化坚决全部清仓卖出；\n" +
            "     2.k>85 这时候股价会钝化，会出现钝化相交，这时候如果股价一直在5日线以上则暂时不卖或卖一少部分落袋为安；\n" +
            "     3.其他情况相交后卖出；\n" +
            "     4.突破历史股价高位后，连续2天滞涨，突破不了高点全仓卖出；\n" +
            "\n" +
            "   备注：\n" +
            "    这时候要特别注意最后一个的趋势反转基本都是一个大跌，可能是连续的所以这时候如果，绿线要翻上去，，5，10下这时候四根线会间隔非常近，要特别注意，最好是k<40的低位红K，轻仓参与。等待趋势明朗"

    private lateinit var binding: FragmentGreenBottomBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGreenBottomBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.content.text = content
    }
}