package com.example.lenovo.helokotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.*


class DetailClub : AppCompatActivity() {

    lateinit var nameTextView : TextView
    lateinit var imgimageView: ImageView
    lateinit var deskTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent
        var name    = intent.getStringExtra("name")
        var image   = intent.getIntExtra("image",0)
        var deskripsi    = intent.getStringExtra("deskripsi")

        verticalLayout{
            backgroundColor = Color.WHITE
            gravity = Gravity.CENTER_HORIZONTAL

            imgimageView  =
                    imageView().lparams(width = dip(90), height = dip(90)){
                        topMargin = dip(12)
                        gravity   = Gravity.CENTER
                    }
            nameTextView =
                    textView(){
                                gravity = Gravity.CENTER

                            }.lparams(
                                width = matchParent,
                                height = dip(30)){topMargin = dip(3)}
            deskTextView =
                    textView(){
                        textAlignment = View.TEXT_ALIGNMENT_INHERIT
                    }. lparams(
                            width = wrapContent
                    ){topMargin = dip(9)}
        }
        nameTextView.text = name
        imgimageView.image = getDrawable(image)
        deskTextView.text = deskripsi
    }
}
