package Day1

import kotlin.math.absoluteValue

class Day1 {
    fun part1(input: String): Int {
        val preprocessed = input.split("\n").map { line -> line.split("   ").map { item -> item.toInt() } }
        val left = preprocessed.map { line -> line[0] }.sorted()
        val right = preprocessed.map { line -> line[1] }.sorted()
        return (left zip right).sumOf { line -> (line.first - line.second).absoluteValue }
    }

    fun part2(input: String): Int {
        val preprocessed = input.split("\n").map { line -> line.split("   ").map { item -> item.toInt() } }
        val left = preprocessed.map { line -> line[0] }
        val right = preprocessed.map { line -> line[1] }.groupingBy { i -> i }.eachCount();
        return left.sumOf { i -> i * (right[i] ?: 0) }
    }
}