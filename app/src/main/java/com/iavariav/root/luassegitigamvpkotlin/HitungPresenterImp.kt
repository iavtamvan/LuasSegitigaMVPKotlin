package com.iavariav.root.luassegitigamvpkotlin

import android.widget.EditText

/**
 * Created by root on 2/17/18.
 */
class HitungPresenterImp : HitungPresenter{
    var modelView : MainView? = null

    constructor(modelView: MainView?) {
        this.modelView = modelView
    }

    override fun hitungHasil(nilai1: EditText, nilai2: EditText) {
        var a = nilai1.text.toString()
        var t = nilai2.text.toString()

        if (a.isNotEmpty()  || t.isNotEmpty()) {

            var alas = a.toDouble()
            var tinggi = t.toDouble()

            var hasil = 0.5 * alas * tinggi
//        masukin ke mainView
            modelView?.hasil(hasil.toString())
        }
    }

}