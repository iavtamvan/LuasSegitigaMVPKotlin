package com.iavariav.root.luassegitigamvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    lateinit var presenterImp: HitungPresenterImp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initPresenter()
        initView()
    }

    private fun initView() {
        btnHitung.setOnClickListener {
            presenterImp.hitungHasil(edtLuas, edtTinggi)
        }
    }

    private fun initPresenter() {
        presenterImp = HitungPresenterImp(this)

    }

    override fun kosong() {
        Toast.makeText(this, "Kosong gan" , Toast.LENGTH_SHORT).show()
    }

    override fun hasil(nilai: String) {
        tvHasil.text = nilai
    }

}
