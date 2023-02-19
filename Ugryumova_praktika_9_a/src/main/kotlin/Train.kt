package Trains
open class Train (var number : Int, var punktStart: String, var punktFinish: String, var dateStart: String, var timeStart: String, var wayTime: String) {
    open fun TrainGo(){
        println("поезд №$number едет из $punktStart в $punktFinish")
    }
    open fun GetInfo(){
        println("поезд №$number едет $dateStart в $timeStart")
    }
    open fun Finish(){
        println("поезд №$number ехал $wayTime")
    }
}