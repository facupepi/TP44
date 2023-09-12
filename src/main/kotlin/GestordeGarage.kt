class GestordeGarage(
    private var costoRueda : Double,
    var cantidadMaxima : Int,
    private var vehiculos : ArrayList<Vehiculo> = arrayListOf()
)
/*
Atributos:
costoRueda: Almacena el costo de una rueda, que se utilizará más adelante en el método cambiarRuedas.
cantidadMaxima: Representa la cantidad máxima de vehículos que el garaje puede contener.
vehiculos: Es una lista (ArrayList) de objetos de tipo Vehículo, que almacenará los vehículos en el garaje.

*/
{
    fun agregarVehiculo(vehiculoTemp : Vehiculo){

        if (vehiculos.size==cantidadMaxima){
            println("\n\nGARAGE LLENO - EL SIGUIENTE VEHICULO NO GUARDADO\n $vehiculoTemp")
        }
        else{
            vehiculos.add(vehiculoTemp)
            println("EL SIGUIENTE VEHICULO FUE GUARDADO! \n $vehiculoTemp")
        }
    }
    /*
    Comprueba si la cantidad actual de vehículos en el garaje es igual a la cantidad máxima permitida.

    Si está lleno, se imprime un mensaje indicando que el garaje está lleno y que el vehículo no se ha guardado,
    junto con la representación en cadena del vehículo.

    Si el garaje no está lleno, se agrega el vehículo especificado a la lista de vehículos en el garaje.
    También se incrementa el contador de la cantidad de vehiculos almacenados.
     */

    fun retirarVehiculo(vehiculoTemp: Vehiculo){
        vehiculos.remove(vehiculoTemp)
        println("EL SIGUIENTE VEHICULO FUE RETIRADO! \n $vehiculoTemp")
    }
    // Elimina el vehículo especificado de la lista de vehículos en el garaje. Automaticamente la lista lleva la cuenta de objetos mediante vehiculos.size

    fun cambiarRuedas() : Double{
        var sumador = 0.0
        for(vehiculoTemp in vehiculos){
            sumador += vehiculoTemp.ruedas * costoRueda
        }
        return sumador
    }
    // Calcula el costo total de cambiar las ruedas de todos los vehículos en el garaje

    fun kilometrajeMedio() : Double {
        var sumador = 0.0
        for(vehiculoTemp in vehiculos){
            sumador += vehiculoTemp.kilometraje
        }

        if(vehiculos.size!=0){ //Verificacion para no dividir por cero en caso que no haya vehiculos en el garage
            return sumador / vehiculos.size
        }
        else return 0.0

    }
    // Calcula el costo total de cambiar las ruedas de todos los vehículos en el garaje

    fun verGuardados() : String {
        var cadena = ""// Cadena que se utilizará para acumular la información sobre los vehículos.
        for(vehiculoTemp in vehiculos){ //Inicia un bucle for que itera a través de todos los vehículos en la lista de vehículos en el garaje.
            cadena += vehiculoTemp.toString() // Agrega la representación en cadena del vehículo actual a la cadena acumulada.
        }
        return cadena//Devuelve la cadena que contiene la información sobre todos los vehículos en el garaje.
    }
}
/*
Métodos:
agregarVehiculo(vehiculoTemp: Vehiculo): Agrega un vehículo a la lista de vehículos en el garaje, siempre que no haya alcanzado la cantidad máxima permitida.
retirarVehiculo(vehiculoTemp: Vehiculo): Retira un vehículo del garaje.
cambiarRuedas(): Calcula el costo total de cambiar las ruedas de todos los vehículos en el garaje.
kilometrajeMedio(): Calcula el kilometraje promedio de todos los vehículos en el garaje.
verGuardados(): Devuelve una cadena que contiene información sobre todos los vehículos en el garaje.
*/
