package com.tandiera.project.foodmarket.utils

import android.widget.TextView
import java.text.DecimalFormat

object Helpers {

    fun TextView.formatPrice(value: String) {
        this.text = getCurrencyIDR(java.lang.Double.parseDouble(value))
    }

    fun getCurrencyIDR(price : Double) : String {
        val format = DecimalFormat("#,###,###")
        return "IDR"+format.format(price).replace(",".toRegex(),".")
    }
}