package com.hl.ssnh.ui.home

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.hl.ssnh.R

class TzAdapter(data: MutableList<HomeEntity>) :
    BaseQuickAdapter<HomeEntity, BaseViewHolder>(R.layout.home_item, data) {

    init {
        addChildClickViewIds(R.id.tab_content)
    }
    override fun convert(helper: BaseViewHolder, item: HomeEntity) {
        helper.setText(R.id.tab_name, item.tabName)
        helper.setImageResource(R.id.icon,item.icon)
    }


}