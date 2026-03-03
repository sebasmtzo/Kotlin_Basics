package example.myapp

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}


fun makeFish01() {
    val pleco = Plecostomus01()
    println("Plecostomus color: ${pleco.color}")
    pleco.eat()

    val shark = Shark01(fishColor = object : FishColor01 {
        override val color = "grey"
    })
    println("Shark color: ${shark.color}")
    shark.eat()
}


fun buildAquarium() {

    val aquariumo = Aquarium(numberOfFish = 29)
    aquariumo.printSize()

    aquariumo.volume = 70
    aquariumo.printSize()

    println()

    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main() {
    buildAquarium()

    println("\n\n ================ Make Fish ===============")
    makeFish()

    println("\n\n ================ Make Fish 01 ===============")
    makeFish01()
}