package com.hl.ssnh.ui.model

data class GpInfoModel(
    val gpName: String,
    val totalyear: String,
    val hangye: String,
    val shizhi: String,
    val zhuangtai: String,
    val thisYearzd: String,
    val yearprofit: Array<String>,
    val yearRoe: Array<String>,
    val yearIncreamProfit: Array<String>,
    val yearIncreamProfitSpeed: Array<String>
)