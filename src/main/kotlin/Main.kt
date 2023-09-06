fun main() {
    val garage = GestordeGarage(10.0,4)

    val auto1 = Coche("Fiat",100,4, 4)
    val auto2 = Coche("Renault",300,4, 6)
    val auto3 = Coche("Ford",500,4, 6)

    val moto1 = Moto("Honda",2000,2,190)
    val moto2 = Moto("Yamaha",500,2,250)

    garage.agregarVehiculo(auto1)
    garage.agregarVehiculo(auto2)
    garage.agregarVehiculo(moto1)
    garage.agregarVehiculo(moto2)

    println("El costo de cambiar todas las ruedas es $"+garage.cambiarRuedas())
    println("El kilometraje medio es "+garage.kilometrajeMedio())
    println("\n----VEHICULOS----\n" + garage.verGuardados() + "----VEHICULOS----\n")

    println("HAY ${garage.contadorParcial} VEHICULOS")
    garage.agregarVehiculo(auto3)

    garage.retirarVehiculo(moto2)
    println("\n----VEHICULOS----\n" + garage.verGuardados() + "----VEHICULOS----\n")
    println("HAY ${garage.contadorParcial} VEHICULOS")
    garage.agregarVehiculo(auto3)
    println("HAY ${garage.contadorParcial} VEHICULOS")

}