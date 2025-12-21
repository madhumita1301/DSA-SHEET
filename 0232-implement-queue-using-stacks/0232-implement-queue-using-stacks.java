
// // Push efficient code
// // Space complexity = oN
// // time complexity of  push = o1
// // time complexity of pop = oN
// // time complexity of peek = oN

// class MyQueue {
//     Stack<Integer> st1 = new Stack<>();
//     Stack<Integer> st2 = new Stack<>();

//     public MyQueue() {

//     }

//     public void push(int x) {
//         st1.push(x); // o(1)
//     }

//     public int pop() {
//         while (st1.size() > 1) {
//             st2.push(st1.pop());
//         }
//         int x = st1.pop();
//         while (st2.size() > 0) {
//             st1.push(st2.pop());
//         }
//         return x;
//     }

//     public int peek() {
//         while (st1.size() > 1) {
//             st2.push(st1.pop());
//         }
//        int x = st1.peek();
//         while (st2.size() > 0) {
//             st1.push(st2.pop());
//         }
//         return x;
//     }

//     public boolean empty() {
//         if (st1.size() == 0)
//             return true;
//         else
//             return false;
//     }
// }

// /**
//  * Your MyQueue object will be instantiated and called as such:
//  * MyQueue obj = new MyQueue();
//  * obj.push(x);
//  * int param_2 = obj.pop();
//  * int param_3 = obj.peek();
//  * boolean param_4 = obj.empty();
//  */

// Pop efficient code
// Space complexity = oN
// time complexity of  push = oN
// time complexity of pop = o1
// time complexity of peek = o1

class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        if (st.size() == 0)
            st.push(x);
            else{
              while(st.size()>0){
                helper.push(st.pop());
               }
              st.push(x);
                while(helper.size()>0){
                st.push(helper.pop());
               }
            }
    }

    public int pop() {
        return st.pop(); // o(1)
    }

    public int peek() {
        return st.peek(); // o(1)
    }

    public boolean empty() {
        if (st.size() == 0)
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */