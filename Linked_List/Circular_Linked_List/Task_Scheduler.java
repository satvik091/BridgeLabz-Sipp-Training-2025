class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    public TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}


public class TaskCircularList {
    private TaskNode head = null;
    private TaskNode tail = null;
    private TaskNode currentTask = null;

    public boolean isEmpty() {
        return head == null;
    }

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (isEmpty()) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    // Add at end
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (isEmpty()) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Add at specific position (1-based)
    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1 || isEmpty()) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current.next == head) {
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == tail) {
            tail = newNode;
        }
    }

    // Remove by Task ID
    public void removeByTaskId(int id) {
        if (isEmpty()) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode current = head;
        TaskNode prev = tail;
        boolean found = false;

        do {
            if (current.taskId == id) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("Task ID not found.");
            return;
        }

        if (head == tail && head.taskId == id) {
            head = tail = null;
        } else {
            if (current == head) head = head.next;
            if (current == tail) tail = prev;
            prev.next = current.next;
            tail.next = head;
        }

        if (currentTask == current) {
            currentTask = current.next;
        }

        System.out.println("Task with ID " + id + " removed.");
    }

    // View current task and move to next
    public void viewAndMoveToNext() {
        if (isEmpty()) {
            System.out.println("No tasks to view.");
            return;
        }

        if (currentTask == null) {
            currentTask = head;
        }

        System.out.println("Current Task:");
        displayTask(currentTask);

        currentTask = currentTask.next;
    }

    // Display all tasks from head (1 full cycle)
    public void displayAll() {
        if (isEmpty()) {
            System.out.println("No tasks in the list.");
            return;
        }

        System.out.println("All Tasks:");
        TaskNode current = head;
        do {
            displayTask(current);
            current = current.next;
        } while (current != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {
        if (isEmpty()) {
            System.out.println("No tasks in the list.");
            return;
        }

        boolean found = false;
        TaskNode current = head;
        do {
            if (current.priority == priority) {
                displayTask(current);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) System.out.println("No tasks found with priority " + priority);
    }

    // Display a single task
    private void displayTask(TaskNode node) {
        System.out.println("Task ID: " + node.taskId +
                           ", Name: " + node.taskName +
                           ", Priority: " + node.priority +
                           ", Due Date: " + node.dueDate);
    }
}

public class Main {
    public static void main(String[] args) {
        TaskCircularList scheduler = new TaskCircularList();

        scheduler.addAtEnd(1, "Design System", 2, "2025-07-10");
        scheduler.addAtBeginning(2, "Write Report", 1, "2025-07-05");
        scheduler.addAtPosition(2, 3, "Code Review", 3, "2025-07-08");

        scheduler.displayAll();

        scheduler.viewAndMoveToNext();
        scheduler.viewAndMoveToNext();

        scheduler.searchByPriority(2);
        scheduler.removeByTaskId(1);

        scheduler.displayAll();
    }
}
