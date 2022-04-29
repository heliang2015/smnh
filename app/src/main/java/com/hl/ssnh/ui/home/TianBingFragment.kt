package com.hl.ssnh.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hl.ssnh.R
import com.hl.ssnh.ui.home.placeholder.PlaceholderContent
import com.hl.ssnh.ui.model.GpInfoModel

/**
 * A fragment representing a list of  Items.
 */
class TianBingFragment : Fragment() {

    private var columnCount = 1
    private var datas = mutableListOf<GpInfoModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_list, container, false)

        if(columnCount == 0){
            buildTjDatas()
        }else{
            buildTbDatas()
        }

        if (view is RecyclerView) {
            with(view) {
                adapter = MyTianBingRecyclerViewAdapter(datas)
            }
        }
        return view
    }

    /**
     * build TbDatas
     */
    fun buildTbDatas(){
        datas.add(GpInfoModel("tbname1","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name2","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("nam3","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name4","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name5","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name6","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name7","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name8","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name9","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
    }

    fun buildTjDatas(){
        datas.add(GpInfoModel("tjname1","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name2","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("nam3","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name4","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name5","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name6","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name7","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name8","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
        datas.add(GpInfoModel("name9","5","hangye","300","up","30", arrayOf("20,30"), arrayOf("15"), arrayOf("45","48"), arrayOf("22","12")))
    }

    companion object {
        const val ARG_COLUMN_COUNT = "column-count"
        @JvmStatic
        fun newInstance(columnCount: Int) =
            TianBingFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }
}