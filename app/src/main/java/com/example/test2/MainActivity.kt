package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test2.adapter.Adapter
import com.example.test2.databinding.ActivityMainBinding
import com.example.test2.model.ItemModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.recItem.layoutManager=GridLayoutManager(this,2)
        binding.recItem.adapter=Adapter(listOf(
            ItemModel(R.drawable.ic_baseline_person_24,"Android"),
            ItemModel(R.drawable.ic_baseline_fastfood_24,"Android"),
            ItemModel(R.drawable.ic_baseline_fingerprint_24,"Android"),
            ItemModel(R.drawable.ic_baseline_person_24,"Android"),
            ItemModel(R.drawable.ic_baseline_person_24,"Android"),
            ItemModel(R.drawable.ic_baseline_person_24,"Android"),
            ItemModel(R.drawable.ic_baseline_person_24,"Android"),
            ItemModel(R.drawable.ic_baseline_person_24,"Android"),
            ItemModel(R.drawable.ic_baseline_person_24,"Android"),
            ItemModel(R.drawable.ic_baseline_person_24,"Android"),
        ))
    }
}