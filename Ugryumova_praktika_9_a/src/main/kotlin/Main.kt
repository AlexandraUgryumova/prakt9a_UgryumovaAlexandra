import Trains.Train
import  Trains.Train as NewTrain

fun main(args: Array<String>) {
    var train1 = Train(23143, "Хризолитово","Первомайская", "03.07.22", "14:55", "1 час" )
    train1.TrainGo()
    train1.GetInfo()
    train1.Finish()
    println()
    var train2 = PassengerTrain(54, 50, 54353,"Жд Вокзал","Каменск-Уральский","04.07.22","16:10","3 часа 15 минкт")
    train2.TrainGo()
    train2.GetInfo()
    train2.Seats()
    train2.Seats2()
    train2.Finish()
    println()
    var train3 = FreightTrain(454567, "почта",56323,"Тюмень","Краснодар", "06.08.22","1:10","3 дня 10 часов")
    train3.TrainGo()
    train3.GetInfo()
    train3.Kilo()
    train3.Purposee()
    train3.Finish()
}