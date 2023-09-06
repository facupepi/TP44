class Moto(
    marca : String,
    kilometraje : Int,
    ruedas : Int,
    private var cilindrada : Int,

    ) : Vehiculo(marca,kilometraje,ruedas)
{
    override fun toString(): String {
        return super.toString() + " - CILINDRADA: $cilindrada \n"
    }
}