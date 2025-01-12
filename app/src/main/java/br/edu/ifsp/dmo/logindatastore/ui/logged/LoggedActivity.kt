package br.edu.ifsp.dmo.logindatastore.ui.logged

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import br.edu.ifsp.dmo.logindatastore.R
import br.edu.ifsp.dmo.logindatastore.databinding.ActivityLoggedBinding
import br.edu.ifsp.dmo.logindatastore.ui.main.MainActivity

class LoggedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoggedBinding
    private lateinit var viewModel: LoggedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoggedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(LoggedViewModel::class.java)
        binding.textMessage.text = getString(R.string.welcome_message)

        setListeners()
    }

    private fun setListeners() {
        binding.buttonLogout.setOnClickListener {
            viewModel.logout()
            handleLogout()
        }
    }

    private fun handleLogout() {
        val mIntent = Intent(this, MainActivity::class.java)
        startActivity(mIntent)
        finish()
    }
}