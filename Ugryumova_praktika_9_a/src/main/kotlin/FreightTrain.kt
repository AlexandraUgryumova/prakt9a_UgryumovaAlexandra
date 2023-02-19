import Trains.*
open class FreightTrain (var kg: Int,var purpose: String, empnumber : Int, emppunktStart: String, emppunktFinish: String, empdateStart: String, emptimeStart: String,  empwayTime: String) : Train(empnumber, emppunktStart, emppunktFinish, empdateStart, emptimeStart, empwayTime){
    open fun Kilo(){
        println("поезд №$number везёт $kg килограммов")
    }
    open fun Purposee(){
        println("цель поезда: $purpose ")
    }
}