package Day3

class Day3 {
    fun part1(input: String): Int {
        val r = Regex("""mul\((\d+),(\d+)\)""")
        val matches = r.findAll(input)
        return matches.map { m -> m.groupValues[1].toInt() * m.groupValues[2].toInt() }.sum()
    }

    fun part2(input: String): Int {
        val r = Regex("""mul\((\d+),(\d+)\)|do\(\)|don't\(\)""")
        val matches = r.findAll(input)
        var total = 0
        var enabled = true
        for (m in matches)
        {
            if (m.value.startsWith("mul")) {
                if (enabled) {
                    total += m.groupValues[1].toInt() * m.groupValues[2].toInt()
                }
            }
            else if (m.value == "do()") {
                enabled = true
            }
            else if (m.value == "don't()") {
                enabled = false
            }
        }
        return total
    }
}