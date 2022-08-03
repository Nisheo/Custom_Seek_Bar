package com.example.customseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import com.example.customseekbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
    ,SeekBar.OnSeekBarChangeListener
{
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seekBar.max = 100
        binding.seekBar.setOnSeekBarChangeListener(this)
        binding.seekBar.progress = 70
//        val value = binding.seekBar.progress
//        binding.tvPos.text = "$value"
//        val cur = binding.seekBar.width/binding.seekBar.max
//        binding.tvPos.x = (cur * value!!).toFloat() + 200
//        binding.tvPos.y = binding.seekBar?.pivotY!! + 10


//        binding.seekBar.setClickable(false)
//        binding.seekBar.setFocusable(false)
//        binding.seekBar.setEnabled(false)
//        binding.seekBar.setOnSeekBarChangeListener(this)
    }

    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
//        binding.tvPos.text = "$p1"
        val value = binding.seekBar?.progress
        binding.tvPos.text = "$value"
        val cur = binding.seekBar!!.width/binding.seekBar.max
        binding.tvPos.x = (cur * value!!).toFloat() + binding.seekBar.left
//        binding.tvPos.y = binding.seekBar?.pivotY!! + 10
//        Log.d("Pos", binding.tvPos.x.toString() + ": " +binding.seekBar!!.width+":" +binding.seekBar.x)
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {

    }

    override fun onStopTrackingTouch(p0: SeekBar?) {

    }
}