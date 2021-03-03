package com.aquayer.presentation.binding

import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.UnderlineSpan
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.aquayer.R


class TextViewBinding {
    @BindingAdapter("styledDosage")
    fun TextView.setupSpannable(value: String) {
        val spannable = SpannableString(value)

        val start = value.indexOf("Удо")
        val end = value.indexOf("+") + 1

        if (start == -1 || end == 0) return

        spannable
            .setSpan(
                ForegroundColorSpan(ContextCompat.getColor(context, R.color.blue)),
                start,
                end,
                Spanned.SPAN_INCLUSIVE_EXCLUSIVE
            )
        spannable.setSpan(UnderlineSpan(), start, end, 0)
        this.text = spannable
    }


}