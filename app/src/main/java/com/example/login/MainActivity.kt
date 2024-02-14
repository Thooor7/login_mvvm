package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var _binding: ActivityMainBinding
    private val binding get() = _binding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.btLogin.setOnClickListener(this)
        observers()
    }

    override fun onClick(p0: View?) {
        var name = binding.etEmail.text.toString()
        viewModel.doLogin(name)
    }

    fun observers(){
        viewModel.welcome().observe(this, Observer {
            binding.welcome.text = it
        })
        viewModel.login().observe(this, Observer{
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        })
    }

}