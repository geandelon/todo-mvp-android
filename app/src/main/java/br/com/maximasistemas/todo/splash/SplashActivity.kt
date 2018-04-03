package br.com.maximasistemas.todo.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import br.com.maximasistemas.todo.R
import br.com.maximasistemas.todo.pontovenda.PDVActivity
import br.com.maximasistemas.todo.util.Constantes

class SplashActivity : AppCompatActivity(), Runnable {

    var redirecionar: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        agendarRedirecionamento()
    }

    private fun agendarRedirecionamento() {
        val handler = Handler()
        handler.postDelayed(this, Constantes.DELAY_SPLASH_SCREEN)
        redirecionar = true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        redirecionar = false
    }

    override fun run() {
        startActivity(Intent(this, PDVActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
        })
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        finish()
    }

}