package linkedList;

import linkedListNeeds.Task;

public class RoundRobinScheduler {

	Task tail = null;

    public void addTask(String name, int burstTime) {
        Task newTask = new Task(name, burstTime);
        if (tail == null) {
            tail = newTask;
            tail.setNext(newTask);
        } else {
            newTask.setNext(tail.getNext());
            tail.setNext(newTask);
            tail = newTask;
        }
    }

    public void runScheduler(int timeQuantum) {
        if (tail == null) {
            System.out.println("No tasks to run.");
            return;
        }

        System.out.println("Starting Round-Robin Scheduling:");
        Task current = tail.getNext();

        while (true) {
            if (current.getBurstTime() > 0) {
                int timeUsed = Math.min(timeQuantum, current.getBurstTime());
                current.setBurstTime(current.getBurstTime() - timeUsed);
                System.out.println("🔧 Running " + current.getName() + " for " + timeUsed + " units");

                if (current.getBurstTime() == 0) {
                    System.out.println("✅ " + current.getName() + " completed!");
                }
            }

            // Check if all are done
            Task check = tail.getNext();
            boolean allDone = true;
            do {
                if (check.getBurstTime() > 0) {
                    allDone = false;
                    break;
                }
                check = check.getNext();
            } while (check != tail.getNext());

            if (allDone) break;

            current = current.getNext();
        }

        System.out.println("🎉 All tasks completed.");
    }
}
