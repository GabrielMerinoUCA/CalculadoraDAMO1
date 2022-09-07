package ni.edu.uca.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ni.edu.uca.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding //actividad principal, el xml de layout permite usar todos los elementos de este xml

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //se le asigna a binding como una especie de constructor, llena el binding de todos los cosos que hay en el activity main
        setContentView(binding.root) //

        Iniciar();
    }

    private fun Iniciar() {
        binding.btnSumar.setOnClickListener {
            val num1: Int = binding.etnNum1.text.toString().toInt()
            val num2: Int = binding.etnNum2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val suma = op.sumar()
            binding.tvResultado.text = suma.toString()
        }
        binding.btnMultiplicar.setOnClickListener {
            val num1: Int = binding.etnNum1.text.toString().toInt()
            val num2: Int = binding.etnNum2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val suma = op.multiplicar()
            binding.tvResultado.text = suma.toString()
        }
        binding.btnRestar.setOnClickListener {
            val num1: Int = binding.etnNum1.text.toString().toInt()
            val num2: Int = binding.etnNum2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val suma = op.restar()
            binding.tvResultado.text = suma.toString()
        }
        binding.btnDividir.setOnClickListener {
            val num1: Int = binding.etnNum1.text.toString().toInt()
            val num2: Int = binding.etnNum2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val suma = op.dividir()
            binding.tvResultado.text = suma.toString()
        }
    }


}
