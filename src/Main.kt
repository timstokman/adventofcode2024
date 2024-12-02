import Day1.Day1
import Day2.Day2
import Day3.Day3

fun main() {
    val day1 = Day1();
    val day1Input = object{}.javaClass.classLoader.getResource("day1").readText()
    println(day1.part1(day1Input))
    println(day1.part2(day1Input))

    val day2 = Day2();
    val day2Input = object{}.javaClass.classLoader.getResource("day2").readText()
    println(day2.part1(day2Input))
    println(day2.part2(day2Input))

    val day3 = Day3();
    val day3Input = object{}.javaClass.classLoader.getResource("day3").readText()
    println(day3.part1(day3Input))
    println(day3.part2(day3Input))
}