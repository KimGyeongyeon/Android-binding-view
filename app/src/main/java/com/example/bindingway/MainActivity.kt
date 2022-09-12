package com.example.bindingway

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bindingway.databinding.ActivityMainBinding
import com.example.bindingway.databinding.ActivityMainDbBinding

data class TextInfo(var text : String, var colorId : Int)

class MainActivity : AppCompatActivity() {

//    // ver 1-1. Id 이용하기
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

//    //ver 1-2. onCreate의 다른 버전
//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        super.onCreate(savedInstanceState, persistentState)
//      //이 상태에서는 아무것도 보이지 않음
//        setContentView(R.layout.activity_main)
//      //line 11을 AppCompatActivity(R.layout.activity_main)로 바꾸면 자동으로 inflate됨
//    }

//    // ver2. View binding
//    // activity_main.xml -> ActivityMainBinding
//    private lateinit var binding: ActivityMainBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//    }
//
//    // ver3. Data Binding
//    // activity_main_db.xml -> ActivityMainDbBinding
//    private lateinit var binding: ActivityMainDbBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_db)
//        val textinfo = TextInfo("Data binding", R.color.white)
//        binding.textbox = textinfo
//    }


}