package lab_assignment_10.unit3.task6;

public class Explain {
    public static void main(String[] args) {
        System.out.println(
                "\n" +
                "        Race Condition Documentation\n" +
                "1. Why incorrect value occurs?\n" +
                "\n" +
                "Incorrect value occurs because multiple threads access and modify the same shared variable (counter) simultaneously without synchronization.\n" +
                "\n" +
                "Each thread tries to update the value independently, which leads to overlapping operations. As a result, some updates are lost.\n" +
                "\n" +
                "This problem is known as the lost update problem.\n" +
                "\n" +
                "Expected value: 2000\n" +
                "Actual value: Varies (e.g., 1832, 1975, etc.)\n" +
                "\n" +
                "2. Where context switch may happen?\n" +
                "\n" +
                "Context switching can occur at any step during the execution of the increment operation.\n" +
                "\n" +
                "The operation count++ is internally executed as:\n" +
                "\n" +
                "Read value of count\n" +
                "Increment the value\n" +
                "Write the updated value back\n" +
                "\n" +
                "A context switch may happen:\n" +
                "\n" +
                "After reading the value\n" +
                "Before writing the updated value\n" +
                "Between increment steps\n" +
                "\n" +
                "Example:\n" +
                "\n" +
                "Thread-1 reads count = 5\n" +
                "(Thread switch)\n" +
                "Thread-2 reads count = 5\n" +
                "Thread-2 writes 6\n" +
                "(Thread switch back)\n" +
                "Thread-1 writes 6\n" +
                "\n" +
                "Final result becomes incorrect.\n" +
                "\n" +
                "3. Why increment is not atomic?\n" +
                "\n" +
                "The operation count++ is not atomic because it consists of multiple steps:\n" +
                "\n" +
                "Read current value\n" +
                "Add 1\n" +
                "Write updated value\n" +
                "\n" +
                "Since these steps are not executed as a single indivisible operation, interruption can occur between them.\n" +
                "\n" +
                "This allows multiple threads to interfere with each other, causing inconsistent results.\n" +
                "\n" +
                "Conclusion\n" +
                "\n" +
                "Race condition occurs when multiple threads access shared data without proper synchronization, leading to unpredictable and incorrect results.\n" +
                "\n" +
                "To prevent this, synchronization mechanisms such as synchronized or atomic classes should be used.");
    }
}
