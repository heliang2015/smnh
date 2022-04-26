package com.hl.ssnh.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.hl.ssnh.databinding.ActivityHhBdBinding
import com.hl.ssnh.databinding.ActivityTbTjBinding
import com.hl.ssnh.ui.Pager2Adapter
import com.hl.ssnh.ui.RecordCenterNavAdapter
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator

class TbTjActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTbTjBinding
    private var mTitleDataList = mutableListOf("天将", "天兵")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTbTjBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack1.setOnClickListener {
            finish()
        }

        initViewPager()
        val commonNavigator = CommonNavigator(this)
        commonNavigator.isAdjustMode = true
        commonNavigator.adapter = RecordCenterNavAdapter(this,mTitleDataList
        ) { position -> binding.viewPager1.currentItem = position }
        binding.magicindicator1.setNavigator(commonNavigator)
    }

    fun initViewPager() {
        var up = TianBingFragment.newInstance(0)
        var middle = TianBingFragment.newInstance(1)
        val listFragments = listOf(up, middle)
        var pagerAdapter = Pager2Adapter(this, listFragments)
        binding.viewPager1.adapter = pagerAdapter
        binding.viewPager1.offscreenPageLimit = 2

        binding.viewPager1.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.magicindicator1.onPageSelected(position)
            }
        })
    }
}