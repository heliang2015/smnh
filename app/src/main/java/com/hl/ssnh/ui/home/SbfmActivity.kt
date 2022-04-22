package com.hl.ssnh.ui.home

import android.R
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.hl.ssnh.databinding.ActivitySbfmBinding
import net.lucode.hackware.magicindicator.buildins.UIUtil
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView


/**
 * 上兵伐谋
 */
class SbfmActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySbfmBinding
    private var mTitleDataList = mutableListOf<String>("绿线封顶","绿线缠绕","绿线托底")

    var text = "kdj+30日均线+画线\n" +
            "\n" +
            " 首先任何股票都不要用过往的辉煌来评测未来，不是业绩好，股票好他就一直要涨的。\n" +
            "\n" +
            " 绿线封顶：\n" +
            "    代表股价下行期间，上涨很弱，特别是斜坡向下的股票，进去基本70%的几率，就是要亏钱的要被埋的。为什么要参与，这时候基本上博的的是最后一个的趋势大反转。\n" +
            " 不要看跌的多了，然后一个小阳相交就冲进去了，埋的次数太多，太多了要涨记性\n" +
            "\n" +
            " 买入点：\n" +
            "  1.看K<= 20 + 收盘时大阳线（>4个点）+ 相交  (非相交的一日内大上扬不考虑)\n" +
            "  2.连续三天的小阳（0.1~0.9）+ 相交（这时候）可以上\n" +
            "\n" +
            "\n" +
            " 卖出点：\n" +
            " 1.平头2日或2日以上小跌坚决卖出（说明股价涨不起来）。\n" +
            " 2.锐角向下坚决卖；\n" +
            " 3.博对了大反弹，股票平稳涨跌没有出现三个点的大跌则相交时候卖；\n" +
            " 4.如果股票反弹很强势，一直在5日线上，则暂时稳住，大跌卖出；\n" +
            " 5.如果在k下上车，如果连续两天k很若，相交也很弱，+绿线有明显上去的趋势，这时候全清；\n" +
            "\n" +
            "\n" +
            "\n" +
            " 绿线缠绕：\n" +
            "    当绿线不在上面也不在下面，这时候股票处于盘整期，不要急于参与，如果可以用画线找到底最好，设置底位轻仓1/3买入，在顶部位置卖出。这时候风险比较大，多空博弈，主力吸筹吗，主力拉伸卖货都在这里，胜率在40%左右。所以亏损5个点及时止损。涨太多不要参与；\n" +
            "\n" +
            "    非买入点：\n" +
            "    1.三线往下，这时候低位+弱反弹不要参与；\n" +
            "\n" +
            "    卖点：\n" +
            "    1.将周期走完\n" +
            "\n" +
            "\n" +
            "\n" +
            " 绿线托盘：\n" +
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySbfmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.content.text = text

        val commonNavigator = CommonNavigator(this)
        commonNavigator.isAdjustMode = true
        commonNavigator.adapter = object : CommonNavigatorAdapter() {
            override fun getCount(): Int {
                return if (mTitleDataList == null) 0 else mTitleDataList.size
            }

            @SuppressLint("NewApi")
            override fun getTitleView(context: Context?, index: Int): IPagerTitleView? {
                val colorTransitionPagerTitleView = ColorTransitionPagerTitleView(context)
                colorTransitionPagerTitleView.normalColor = Color.GRAY
                colorTransitionPagerTitleView.selectedColor = Color.GREEN
                colorTransitionPagerTitleView.setText(mTitleDataList.get(index))
//                colorTransitionPagerTitleView.setOnClickListener(object : DialogInterface.OnClickListener() {
//                    fun onClick(view: View?) {
//                        mViewPager.setCurrentItem(index)
//                    }
//                })
                return colorTransitionPagerTitleView
            }

            override fun getIndicator(context: Context?): IPagerIndicator? {
                val indicator = LinePagerIndicator(context)
                indicator.mode = LinePagerIndicator.MODE_EXACTLY
                return indicator
            }
        }

     //   val titleContainer = commonNavigator.titleContainer // must after setNavigator

//        titleContainer.showDividers = LinearLayout.SHOW_DIVIDER_MIDDLE
//        titleContainer.dividerPadding = UIUtil.dip2px(this, 15.0)
       // titleContainer.dividerDrawable = resources.getDrawable(R.drawable.simple_splitter)
        binding.magicindicator.setNavigator(commonNavigator)
    }
}