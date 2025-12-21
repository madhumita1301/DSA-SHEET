// Approach 2 without extra stack

class MinStack {
    Stack<Long> st = new Stack<>();
    long min = 0;

    public MinStack() {
    }

    public void push(int val) {
        long x = (long) val;
        if (st.size() == 0) {
            st.push(x);
            min = x;
        }
        // top=2*val-min
        else {
            if (x <= min) {
                st.push(2 * x - min);
                min = x;
            } else {
                st.push(x);
            }
        }
    }

    public void pop() {
        if (st.size() > 0) {
            long x = st.peek();
            if (x > min)
                st.pop();
            else {  //peek pe fake value hai
                min = 2 * min - x;
                st.pop();
            }
        }
    }

    public int top() {
        if (st.size() > 0) {
            long x = st.peek();
            if (x > min)
                return (int) x;
            else { //peek pe fake value hai
                return (int) min;
            }
        } else
            return 0;
    }

    public int getMin() {
        if (st.size() > 0)
            return (int) min;
        else
            return 0;  // or -1
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

// APPROACH 1
// class MinStack {
// Stack<Integer> st = new Stack<>();
// Stack<Integer> min = new Stack<>(); // Extra Stack Occupies space of O(n)

// public MinStack() {
// // constructor
// }

// public void push(int val) {
// if (st.size() == 0) {
// st.push(val);
// min.push(val);
// } else {
// st.push(val);
// if (min.peek() < val)
// min.push(min.peek());  //push the same element thats on the top
// else
// min.push(val);
// }
// }

// public void pop() {
// st.pop();
// min.pop();
// }

// public int top() {
// return st.peek();
// }

// public int getMin() {
// return min.peek();
// }
// }