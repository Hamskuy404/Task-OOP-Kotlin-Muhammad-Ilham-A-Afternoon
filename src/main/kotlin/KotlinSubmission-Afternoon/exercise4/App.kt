package id.infinitelearning.KotlinSubmission.exercise4


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun main() {
        try {
            val result = 10 / 0
            println("Result: $result")
        } catch (e: ArithmeticException) {
            println("Error: Division by zero is not allowed.")
        } catch (e: Exception) {
            println("An unexpected error occurred: ${e.message}")
        } finally {
            println("Finally block executed.")
        }
    }


