package com.hl.ssnh.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hl.ssnh.R
import com.hl.ssnh.databinding.ActivityGtjlBinding
import com.hl.ssnh.databinding.ActivitySbfmBinding

class GTJlActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGtjlBinding

    var content = "1.铁律\n" +
            "股票操作一定是要遵守纪律操作的，纪律高于一切，单次的成功不代表多次的成功，不能瞎几把操作，已经太多太多血的教训；\n" +
            "\n" +
            "1.牢记牢记股票市场就是一个战场，是一场博弈，是去抢别人口袋里面的钱，各种尔虞我诈下套，你知道的利好，机构早已知道，你知道的利空，机构也早已知道。机构就是想方设法把你口袋里面的钱抢走，所以要有纪律，只有记录才能保证你克服人性大概率的赚钱" +
            " 保住自己的本金，保住本金，保住本金才是王道，珍惜每一份挣来的利润100 也是钱；\n" +
            "\n" +
            "2.仓位控制高于一切，不管多好的股票，业绩再好，再牛逼单股最大仓位在10万；不能越涨越买，通策医疗，昭衍新药这些都是血的教训，折腾了一年多，股票都涨了40%自己还\n" +
            "倒亏30%，这就是越涨越买的下场；\n" +
            "\n" +
            "3.千万不要与人讨论股票，不要与人讨论股票，没有用反而会影响你的判断，\n" +
            "\n" +
            "4.不要朝三暮四，选定了这7只股票就选定了，不要去羡慕别人的票涨了多少，除非基本面发生了变化；不要忘了血的教训，一顿操作，一天2万没了；\n" +
            "\n" +
            "5.不要贪心，要有耐心，总想着每天能涨3，4 个点，一周能赚个20多个点，一只固定股票一年操作固定的仓位20个点就足以了；你就是大牛了；\n" +
            "\n" +
            "6.亏损超过五个点后，不要补仓,果断清仓，后市起来也不用后悔，股市是大概率博弈；\n" +
            "\n" +
            "7.不要去追那些打板的股票，三天让你高位跌30%的盘龙药业，楚天龙不要忘了；\n" +
            "\n" +
            "8.早盘不操作，早盘不操作，早盘不操作，买卖都不操作，宁可做错；你早盘买卖已经错了太多，太多次了\n" +
            "\n" +
            "9.股票操作的机会很多，很多，不要觉得错过了这一次就错过了好几万似的。\n"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gtjl)

        binding = ActivityGtjlBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()

        binding.content.text = content
    }

    fun initView(){
        binding.ivBack.setOnClickListener {
            finish()
        }
    }
}