package org.example.Task2

//В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
// Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//– Расходы на выплату зарплаты постоянных сотрудников;
//– Общие расходы по ЗП после прихода стажеров;
//– Среднюю ЗП одного сотрудника после устройства стажеров.
//
//Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.

fun main(){
    val allPeopleInCompany: Byte = 50
    val allPeopleSalarySenior: Int = 30000
    val junior: Byte = 30
    val allJuniorSalaryInCompany: Short = 20000


    var expenses: Int
    var allExpensesWithJun: Int
    var midelSalaryOneStaffBeforeJun: Float

    expenses = allPeopleSalarySenior * allPeopleInCompany
    allExpensesWithJun = expenses + (junior.toInt() * allJuniorSalaryInCompany.toInt())
    midelSalaryOneStaffBeforeJun = allExpensesWithJun/(allPeopleInCompany+junior.toFloat())

    println("Расходы на выплату зарплаты постоянных сотрудников: $expenses\n" +
            "Общие расходы по ЗП после прихода стажеров: $allExpensesWithJun \n" +
            "Средняя ЗП одного сотрудника после устройства стажеров: ${midelSalaryOneStaffBeforeJun.toInt()}")

}