class GestordeGarage(
    private var costoRueda : Double,
    var cantidadMaxima : Int,
    private var vehiculos : ArrayList<Vehiculo> = arrayListOf()
){
    var contadorParcial = 0

    fun agregarVehiculo(vehiculoTemp : Vehiculo){
        if (contadorParcial==cantidadMaxima){
            println("\n\nGARAGE LLENO - EL SIGUIENTE VEHICULO NO GUARDADO\n"+vehiculoTemp.toString())
        }
        else{
            vehiculos.add(vehiculoTemp)
            contadorParcial++
            println("EL SIGUIENTE VEHICULO FUE GUARDADO! \n$vehiculoTemp")
        }
    }

    fun retirarVehiculo(vehiculoTemp: Vehiculo){
        vehiculos.remove(vehiculoTemp)
        contadorParcial--
        println("EL SIGUIENTE VEHICULO FUE RETIRADO! \n$vehiculoTemp")
    }

    fun cambiarRuedas() : Double{
        var sumador = 0.0
        for(vehiculoTemp in vehiculos){
            sumador += vehiculoTemp.ruedas * costoRueda
        }
        return sumador
    }

    fun kilometrajeMedio() : Double {
        var sumador = 0.0
        var contador = 0
        for(vehiculoTemp in vehiculos){
            sumador += vehiculoTemp.kilometraje
            contador++
        }

        if(contador!=0){
            return sumador / contador
        }
        else return 0.0

    }

    fun verGuardados() : String {
        var cadena = ""
        for(vehiculoTemp in vehiculos){
            cadena += vehiculoTemp.toString()
        }
        return cadena
    }

}