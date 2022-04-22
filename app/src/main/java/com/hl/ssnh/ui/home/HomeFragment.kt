package com.hl.ssnh.ui.home

import android.app.ActionBar
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.hl.ssnh.R
import com.hl.ssnh.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    fun initView(){
        var datas = mutableListOf<HomeEntity>()
        datas.add(HomeEntity(R.mipmap.icon_gtjler,"钢铁纪律"))
        datas.add(HomeEntity(R.mipmap.icon_sbfm1,"上兵伐谋"))
        datas.add(HomeEntity(R.mipmap.icon_hhb,"红黑榜单"))
        datas.add(HomeEntity(R.mipmap.icon_shsj,"十虎上将"))

        var adapter = TzAdapter(datas)
        _binding?.recylerview!!.layoutManager = GridLayoutManager(requireContext(),2,GridLayoutManager.VERTICAL,false)


        adapter.setOnItemChildClickListener{ adapter, view, position ->
            if (position == 0) {
                startActivity(Intent(requireActivity(),GTJlActivity::class.java))
            } else if (position == 1) {
                startActivity(Intent(requireActivity(), SbfmActivity::class.java))
            } else if (position == 2) {
                startActivity(Intent(requireActivity(), HhBdActivity::class.java))
            } else {

            }
        }

        binding.recylerview.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}