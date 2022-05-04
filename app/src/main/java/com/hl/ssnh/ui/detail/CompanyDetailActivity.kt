package com.hl.ssnh.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bin.david.form.data.column.Column
import com.bin.david.form.data.table.TableData
import com.hl.ssnh.databinding.ActivityCompanyDetailBinding
import com.hl.ssnh.ui.model.CompanyYearProfitModel


/**
 * companyInfo Detail
 */
class CompanyDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCompanyDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompanyDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    fun initView() {
        buidTableHeadView()
    }

    fun buidTableHeadView() {
        var datas = mutableListOf<Any>()
        datas.add(CompanyYearProfitModel("2022","44","15"))

        val column1: Column<String> = Column("区间", "currencyYear")
        val column2: Column<String> = Column("Apple", "companyProfit")
        val column3: Column<String> = Column("hs300Profit", "hs300Profit")

        val totalColumn1: Column<*> = Column<Any?>("组合列名", column2, column3)

      //  var tableData = TableData("yearProfit",datas,column1,column2,column3)


        binding.table.config
            .setShowXSequence(false)
            .setShowYSequence(false)
            .setShowTableTitle(false)

        binding.table.tableData = TableData("yearProfit",
            datas ,column1,totalColumn1)

    }
}