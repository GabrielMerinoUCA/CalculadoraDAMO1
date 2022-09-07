package ni.edu.uca.calculadora

class Operacion (var num1: Int = 0, var num2: Int = 0){

    public fun sumar() = num1 + num2;
    public fun restar() = num1 - num2;
    public fun multiplicar() = num1 * num2;
    public fun dividir(): Double {
        if (num2 !=0) {
            return (num1 / num2).toDouble();
        }
        return 0.0
    }

}