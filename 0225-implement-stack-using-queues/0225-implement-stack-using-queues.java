class MyStack {
    // Pop efficient method
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        if (q.size() == 0)
            q.add(x);
        else {
            q.add(x);
            for (int i = 0; i < q.size() - 1; i++) {
                q.add(q.remove());
            }
        }
    }

    public int pop() { // remove the top element of the stack
        return q.remove();  //o(1)
    }

    public int top() { // peek the top element of the stack
        return q.peek();  //o(1)
    }

    public boolean empty() {
        if (q.size() == 0)
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

// class MyStack {
// Queue<Integer> q = new LinkedList<>();

// public MyStack() {

// }
// //Space complexity = O(1)
// // This method using only 1 queue is push efficient (push requires o1 while
// others take oN)
// // push = tc = o(1)
// // peek / top = tc = o(n)
// // pop / remove = tc = o(n)

// // to make it pop efficient (pop and peek in o(1)) we will add the elements
// at the front(left) of the first element so that we can easily pop out the
// first element(the right most element)
// //1 -> 2 1 -> 3 2 1 -> 4 3 2 1 --> pop "1" in o(1) because its a queue and
// follows fifo therefore 1 will be popped

// public void push(int x) {
// q.add(x);
// }

// public int pop() { // 1 2 3 4
// for (int i = 0; i < q.size() - 1; i++) {
// q.add(q.remove()); // 4 3 2 1
// }
// int val = q.remove(); // 4 1 2 3
// return val;
// }

// public int top() { // peek the topmost element of the stack
// for (int i = 0; i < q.size() - 1; i++) {
// q.add(q.remove());
// }
// int val = q.peek();
// q.add(q.remove()); // remove the front element and push it as the last
// element back to the queue
// return val;
// }
// public boolean empty() {
// if (q.size() == 0)
// return true;
// else
// return false;
// }
// }
