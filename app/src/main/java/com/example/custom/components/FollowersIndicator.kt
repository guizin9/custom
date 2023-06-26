package com.example.custom.components

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.custom.R
import com.example.custom.databinding.ResFollowersIndicatorBinding

class FollowersIndicator(context: Context, attrs: AttributeSet) : FrameLayout(context, attrs) {

    private val binding: ResFollowersIndicatorBinding = ResFollowersIndicatorBinding.inflate(
        LayoutInflater.from(context), this, true
    )

    init{
        context.obtainStyledAttributes(attrs, R.styleable.FollowersIndicator).apply {
            getString(R.styleable.FollowersIndicator_counter)?.let { setCounter(it) }
            getString(R.styleable.FollowersIndicator_indicator)?.let { setIndicator(it) }
            setBold(getBoolean(R.styleable.FollowersIndicator_bold, true))
        }

    }

    fun setCounter(count : String){
        this.binding.tcCounter.text = count
    }

    fun setIndicator(indicator : String){
        this.binding.tcIndicator.text = indicator
    }

    fun setBold(isBold : Boolean){
        if (isBold){
            this.binding.tcCounter.typeface = Typeface.DEFAULT_BOLD
        } else {
            this.binding.tcCounter.typeface = Typeface.DEFAULT
        }
    }
}