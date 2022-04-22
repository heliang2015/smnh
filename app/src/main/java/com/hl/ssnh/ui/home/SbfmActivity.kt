package com.hl.ssnh.ui.home

import android.R
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.hl.ssnh.databinding.ActivitySbfmBinding
import com.hl.ssnh.ui.Pager2Adapter
import com.hl.ssnh.ui.RecordCenterNavAdapter
import com.hl.ssnh.ui.utils.INavigarorCallBack
import net.lucode.hackware.magicindicator.ViewPagerHelper
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
    private var mTitleDataList = mutableListOf<String>("绿线封顶", "绿线缠绕", "绿线托底")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySbfmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            finish()
        }

        initViewPager()
        val commonNavigator = CommonNavigator(this)
        commonNavigator.isAdjustMode = true
        commonNavigator.adapter = RecordCenterNavAdapter(this,mTitleDataList,object :INavigarorCallBack{
            override fun onNavTabClick(position: Int) {
                binding.viewPager.currentItem = position
            }
        })
        binding.magicindicator.setNavigator(commonNavigator)
    }

    fun initViewPager() {
        var up = GreenUpFragment()
        var middle = GreenMiddleFragment()
        var bottom = GreenBottomFragment()
        val listFragments = listOf(up, middle,bottom)
        var pagerAdapter = Pager2Adapter(this, listFragments as List<Fragment>)
        binding.viewPager.adapter = pagerAdapter
        binding.viewPager.offscreenPageLimit = 2

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.magicindicator.onPageSelected(position)
            }
        })
    }
}