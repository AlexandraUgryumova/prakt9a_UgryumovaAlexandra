import Trains.*
open class PassengerTrain (var numberOfSeats: Int,var occupieSeats: Int, empnumber : Int, emppunktStart: String, emppunktFinish: String, empdateStart: String, emptimeStart: String,  empwayTime: String) : Train(empnumber, emppunktStart, emppunktFinish, empdateStart, emptimeStart, empwayTime){
    open fun Seats(){
        println("поезд №$number имеет $numberOfSeats всего и $occupieSeats занятых мест")
    }
    open fun Seats2(){
        var freeSeats: Int = numberOfSeats-occupieSeats
        println("в поезде $freeSeats свободных места")
    }
}