package pe.edu.appformulario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import pe.edu.appformulario.databinding.ActivityListaBinding

class ListaActivity : AppCompatActivity() {
    lateinit var binding: ActivityListaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_lista)
        var listaPersona = intent.getSerializableExtra("listaPersona")
                as ArrayList<String>
        val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, listaPersona)
        binding.lvpersonas.adapter = adapter
    }
}