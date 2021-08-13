package com.example.learningmvpkotlin.presenter

import com.example.learningmvpkotlin.ui.MainActivity
import com.example.learningmvpkotlin.model.Data

/**
 * Created by Mochamad Arifin on 8/13/21
 */
class MainPresenter(val data: MainView) {

    fun hitung(numberOne: Int, numberTwo: Int) {
        // min (-)
        // plus (+)
        // times (*)
        // div (/)
        // rem (%)
        var hasil = numberOne.plus(numberTwo)

        val model = Data()
        //panggil model
        model.dataHasil = hasil
        data.hasilPresenter(model)
    }


}