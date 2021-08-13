package com.example.learningmvpkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.learningmvpkotlin.R
import com.example.learningmvpkotlin.model.Data
import com.example.learningmvpkotlin.presenter.MainPresenter
import com.example.learningmvpkotlin.presenter.MainView

class MainActivity : AppCompatActivity(), MainView {

    // variable dinamis -> var
    var hahaha: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hahaha = "hihihi"
        Log.e("TEST NULL VAR", "YEAY")

        // variable static -> val
        val numberOne = 20
        val numberTwo = 10

        //panggil presenter dimana proses logic dan bisnis ada disini
        val presenter = MainPresenter(this)

        //panggil fungsi yang ada di Presenter
        presenter.hitung(numberOne, numberTwo)
    }

    override fun hasilPresenter(data: Data) {
        //menampilkan datat
        Log.e("Hasil", data.dataHasil.toString())
    }
}