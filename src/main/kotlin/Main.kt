fun main() {
    // Crea una instancia de GestordeGarage con un costo de rueda de 10.0 y una cantidad máxima de 4 vehículos.
    val garage = GestordeGarage(10.0, 4)

    // Crea instancias de objetos de tipo Coche.
    val auto1 = Coche("Fiat", 100, 4, 4)
    val auto2 = Coche("Renault", 300, 4, 6)
    val auto3 = Coche("Ford", 500, 4, 6)

    // Crea instancias de objetos de tipo Moto.
    val moto1 = Moto("Honda", 2000, 2, 190)
    val moto2 = Moto("Yamaha", 500, 2, 250)

    // Agrega los vehículos al garaje utilizando el método agregarVehiculo de GestordeGarage.
    garage.agregarVehiculo(auto1)
    garage.agregarVehiculo(auto2)
    garage.agregarVehiculo(moto1)
    garage.agregarVehiculo(moto2)

    // Imprime el costo de cambiar todas las ruedas en el garaje.
    println("El costo de cambiar todas las ruedas es $" + garage.cambiarRuedas())

    // Imprime el kilometraje medio de todos los vehículos en el garaje.
    println("El kilometraje medio es " + garage.kilometrajeMedio())

    // Imprime información sobre todos los vehículos en el garaje.
    println("\n----VEHICULOS----\n" + garage.verGuardados() + "----VEHICULOS----\n")

    // Imprime la cantidad de vehículos en el garaje (contadorParcial).
    println("HAY ${garage.vehiculos.size} VEHICULOS")

    // Intenta agregar otro vehículo al garaje (auto3) pero el garage ya está lleno
    garage.agregarVehiculo(auto3)

    // Retira un vehículo del garaje (moto2).
    garage.retirarVehiculo(moto2)

    // Imprime información actualizada sobre todos los vehículos en el garaje.
    println("\n----VEHICULOS----\n" + garage.verGuardados() + "----VEHICULOS----\n")

    // Imprime la cantidad actualizada de vehículos en el garaje.
    println("HAY ${garage.vehiculos.size} VEHICULOS")

    // Intenta agregar otro vehículo al garaje (auto3)
    garage.agregarVehiculo(auto3)

    // Imprime la cantidad final de vehículos en el garaje.
    println("HAY ${garage.vehiculos.size} VEHICULOS")
}