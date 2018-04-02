package digaoperadora.delon.br.teste.mvvm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import digaoperadora.delon.br.teste.R
import kotlinx.android.synthetic.main.activity_contador.*

class ActivityContador : MvvmActivity<VmContador>() {
    override fun getLayoutID(): Int {
       return  R.layout.activity_contador
    }

    override fun getClassePresenter(): Class<VmContador> {
        return VmContador::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }





}
