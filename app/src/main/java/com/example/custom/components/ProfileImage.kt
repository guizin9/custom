package com.example.custom.components

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import com.example.custom.R
import com.example.custom.databinding.ResProfileImgBinding

class ProfileImage(context: Context, attrs: AttributeSet) : FrameLayout(context, attrs) {

    private val binding: ResProfileImgBinding = ResProfileImgBinding.inflate(
        LayoutInflater.from(context), this, true
    )

    init {
        context.obtainStyledAttributes(attrs, R.styleable.ProfileImage).apply {
            setImageProfile(getResourceId(R.styleable.ProfileImage_src, R.drawable.user_profile))
            setVisualized(getBoolean(R.styleable.ProfileImage_visualized, false))
        }
    }

    fun setImageProfile(resourceId: Int) {
        this.binding.imgProfile.setImageResource(resourceId)
    }

    fun setVisualized(isVisualized: Boolean) {
        if (!isVisualized) {
            this.binding.cvProfileImg.setBackgroundColor(Color.parseColor("#c6c6c6"))
        } else {
            this.binding.cvProfileImg.setCardBackgroundColor(
                ContextCompat.getColor(
                    context,
                    R.color.instagram_color
                )
            )
        }
    }
}