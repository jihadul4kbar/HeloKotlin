package com.example.lenovo.helokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import org.jetbrains.anko.*

class DetailClub : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_detail_club)
        MainActivityUI().setContentView(this)
    }
}
class MainActivityUI : AnkoComponent<DetailClub> {
    override fun createView(ui: AnkoContext<DetailClub>) = with(ui) {
        verticalLayout{

            gravity = Gravity.CENTER

            imageView(R.drawable.img_barca).
                lparams(width= dip(60), height = dip(60)) {
                    padding = dip(20)
                    margin = dip(15)
                    gravity = Gravity.CENTER
                }
        }
    }
}
