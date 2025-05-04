package linkedList;

import java.util.LinkedHashMap;

import linkedListNeeds.Task;

public class RoundRobinScheduler {
LinkedHashMap<String,String> response = new LinkedHashMap<>();
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

    public LinkedHashMap<String, String> runScheduler(int timeQuantum) {
        if (tail == null) {
            System.out.println("No tasks to run.");
            response.put("Exit-", " No tasks to run.");
            return response;
        }
        response.put("Output-","Starting Round-Robin Scheduling");
        System.out.println("Starting Round-Robin Scheduling");
        Task current = tail.getNext();
        int i=1;
        while (true) {
            if (current.getBurstTime() > 0) {
                int timeUsed = Math.min(timeQuantum, current.getBurstTime());
                current.setBurstTime(current.getBurstTime() - timeUsed);
                System.out.println(i+" 🔧 Running " + current.getName() + " for " + timeUsed + " units");
                response.put(i+". Running!! " + current.getName() + " for " + timeUsed + " units ", "");
                if (current.getBurstTime() == 0) {
                    System.out.println("✅ " + current.getName() + " completed!");
                    response.put("✅ " + current.getName() + " completed!", "");
                }
                i++;
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
        response.put(" All tasks completed.", "");
        return response;
    }
}
