package Day2

import kotlin.math.absoluteValue

class Day2 {
    fun part1(input: String): Int {
        val reports = input.split("\n").map { line -> line.split(" ").map { item -> item.toInt() } }
        return reports.count { report -> isSafe(report) }
    }

    fun part2(input: String): Int {
        val reports = input.split("\n").map { line -> line.split(" ").map { item -> item.toInt() } }
        return reports.count { report -> isSafeDampener(report) }
    }

    fun isSafeDampener(report: List<Int>): Boolean {
        if (isSafe(report)) {
            return true;
        }

        for (i in 0 until report.count()) {
            var reportClone = report.toMutableList()
            reportClone.removeAt(i)
            if (isSafe(reportClone)) {
                return true
            }
        }

        return false
    }

    fun isSafe(report: List<Int>): Boolean {
        val isIncreasing = report[1] > report[0]
        for (i in 1 until report.count()) {
            val levelIncreasing = report[i] > report[i - 1]
            val diff = (report[i] - report[i - 1]).absoluteValue
            if (!(diff >= 1 && diff <= 3 && ((levelIncreasing && isIncreasing) || (!levelIncreasing && !isIncreasing)))) {
                return false;
            }
        }
        return true;
    }
}