package parking

fun main() {
    val firstInput = readLine()!!.split(" ")
    var spots: Int
    val lot = ParkingLot()
    loop@ while (true) {
        when (firstInput[0]) {
            "exit" -> break
            "park" -> println(message)
            "leave" -> println(message)
            "status" -> println(message)
            "create" -> {
                spots = firstInput[1].toInt()
                createLot(lot, spots)
            }
        }
        while (true) {
            val cars = readLine()!!.split(" ")
            when (cars[0]) {
                "exit" -> break@loop
                "park" -> parkCars(lot, cars)
                "leave" -> leaveLot(lot, cars)
                "create" -> {
                    spots = cars[1].toInt()
                    createLot(lot, spots)
                }
                "status" -> checkStatus(lot)
            }
        }
    }
}

const val message = "Sorry, a parking lot has not been created."
fun checkStatus(lot: ParkingLot) {
    if (lot.parkedCars.isEmpty() && lot.freeSpots.isNotEmpty()) {
        println("Parking lot is empty.")
    } else if (lot.parkedCars.isEmpty() && lot.freeSpots.isEmpty()) {
        println(message)
    } else {
        for (index in lot.parkedCars.indices) {
            println(lot.parkedCars[index])
        }
    }
}

fun createLot(lot: ParkingLot, spots: Int) {
    if (lot.freeSpots.isEmpty() && lot.parkedCars.isEmpty()) {
        lot.addFreeSpots(spots)
        println("Created a parking lot with $spots spots.")
    } else if (lot.freeSpots.isEmpty() && lot.freeSpots.isNotEmpty() || lot.freeSpots.isNotEmpty()) {
        lot.freeSpots.clear()
        lot.parkedCars.clear()
        lot.addFreeSpots(spots)
        println("Created a parking lot with $spots spots.")
    }
}

fun leaveLot(lot: ParkingLot, cars: List<String>) {
    if (lot.parkedCars.isNotEmpty()) {
        stop@ for (index in lot.parkedCars.indices) {
            if (lot.parkedCars[index].first().toString() == cars[1]) {
                lot.parkedCars.removeAt(index)
                break@stop
            }
        }
        lot.parkedCarsKey.remove(cars[1].toInt())
        lot.freeSpots.add(cars[1].toInt())
        println("Spot ${cars[1]} is free.")
    } else if (lot.freeSpots.isNotEmpty() && lot.parkedCars.isEmpty()) {
        println("There is no car in the parking lot.")
    } else if (lot.freeSpots.isEmpty() && lot.parkedCars.isEmpty()) {
        println(message)
    }
}

fun parkCars(
    lot: ParkingLot,
    cars: List<String>
) {
    if (lot.freeSpots.isNotEmpty()) {
        // Park the cars in the parking lot free spaces
        lot.sortFreeSpots()
        lot.parkedCars.add(lot.sortedFreeSpots[0].toString() + " " + cars[1] + " " + cars[2])
        lot.parkedCarsKey.add(lot.sortedFreeSpots[0])
        println("${cars[2]} car parked in spot ${lot.sortedFreeSpots[0]}.")
        lot.freeSpots.remove(lot.sortedFreeSpots[0])
    } else println("Sorry, the parking lot is full.")

}

class ParkingLot {
    val freeSpots = mutableListOf<Int>()
    var sortedFreeSpots = freeSpots.sorted()
    val parkedCars = mutableListOf<String>()
    val parkedCarsKey = mutableListOf<Int>()

    fun addFreeSpots(spots: Int) {
        for (i in 1..spots) {
            freeSpots.add(i)
        }
        sortedFreeSpots = freeSpots.sorted().toMutableList()
    }

    fun sortFreeSpots() {
        sortedFreeSpots = freeSpots.sorted().toMutableList()
    }
}
