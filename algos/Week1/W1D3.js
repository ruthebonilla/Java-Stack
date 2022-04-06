class Node
{
    constructor(value)
    {
        this.next= null;
        this.value=value;
    }
};

class List
{
    constructor()
    {
        this.head=undefined;
    }

    /* Determine whether the list is empty. */
    IsEmpty()
    {
        if (this.head === null){
            console.log("there's no node")
        }
    }

    /* Insert a node with the given value to the end of the list */
    PushBack(value){
        var newNode = new Node(value);
        if (!this.head) {
            this.head = newNode;
        }else{
            var runner = this.head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
        return this.head;
    }

    /* Insert an array of nodes with the given values to the end of the list. */
    PushBackN(arr){
        for (let i = 0; i <arr.length; i++) {
            this.PushBack(arr[i])
        }
        return this;
    }

    printList(){
        if (this.IsEmpty()){
            return("Cannot print empty List")
        }
        var runner = this.head
        while (runner != null){
            console.log(runner.value)
            runner = runner.next
        }
    }

        /**
     * Creates a new node with the given data and inserts that node at the front
     * of this list.
     * @param {any} data The data for the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtFront(data) {
        if (!this.head) {
            return -1;
        }
        let temp = new Node(data);
        temp.next = this.head;
        this.head = temp;
    }

    /**
     * Removes the first node of this list.
     * @returns {any} The data from the removed node.
     */
    removeHead() {
        let temp = this.head;
        this.head = this.head.next;
        temp.next = null;
    }

    // EXTRA
    /**
     * Calculates the average of this list.
     * @returns {number|NaN} The average of the node's data.
     */
    average() {
        let temp = this.head;
        let sum = 0;
        let counter = 0;
        while (temp.next != null) {
            sum += temp.value;
            counter++;
            temp = temp.next;
        }
        return sum / counter;
    }

    /**
     * Removes the last node of this list.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {any} The data from the node that was removed.
     */
    removeBack() {
        if (this.IsEmpty()) {
            console.log("list is empty");
            return null
        }
        var runner = this.head;
        var tail = this.tail;
        while(runner.next.next != null) {
            runner = runner.next
        }
        console.log("value removed: " + runner.next.value);
        runner.next = null;
        tail = runner;
        return this
    }

    /**
     * Determines whether or not the given search value exists in this list.
     * - Time: O(?).
     * - Space: O(?).
     * @param {any} val The data to search for in the nodes of this list.
     * @returns {boolean}
     */
    contains(val) {
        if (this.IsEmpty()) {
            console.log("list is empty");
            return null
        }
        var runner = this.head;
        var value = val;
        while (runner != null) {
            console.log(runner.value)
            if (runner.value == value) {
                return true
            }
            runner = runner.next;
        }
        return false
    }

    /**
     * Determines whether or not the given search value exists in this list.
     * - Time: O(?).
     * - Space: O(?).
     * @param {any} val The data to search for in the nodes of this list.
     * @param {?ListNode} current The current node during the traversal of this list
     *    or null when the end of the list has been reached.
     * @returns {boolean}
     */
    containsRecursive(val, current = this.head) {
        if (this.IsEmpty()) {
            console.log("list is empty");
            return null
        }
        var value = val;
        if (current.value == value) {
            return true
        }
        if (current.next == null) {
            return false
        }
        return this.containsRecursive(val, current.next)
    }

    // EXTRA
    /**
     * Recursively finds the maximum integer data of the nodes in this list.
     * - Time: O(?).
     * - Space: O(?).
     * @param {ListNode} runner The start or current node during traversal, or null
     *    when the end of the list is reached.
     * @param {ListNode} maxNode Keeps track of the node that contains the current
     *    max integer as it's data.
     * @returns {?number} The max int or null if none.
     */
    recursiveMax(runner = this.head, maxNode = this.head) {
        if (this.head === null) {
            return null;
        }
        if (runner === null) {
            return maxNode.data;
        }
        if (runner.data > maxNode.data) {
            maxNode = runner;
        }
        return this.recursiveMax(runner.next, maxNode);
    }

};

let test_data1=123;
let test_data2=234;
let test_data3=345;
let test_data4=[111,222,333,444,555];

/* Create our list */
let list=new List();
/* Insert nodes into the list: */
list.PushBack(test_data1);
list.PushBack(test_data2);
list.PushBack(test_data3);
/* Insert array of nodes into the list: */
list.PushBackN(test_data4);

list.insertAtFront(77);
list.insertAtFront(771);

list.removeHead();

console.log(list.average());

list.removeBack();


list.printList(list);
/* Iterate our list, so we can see our node values */
// list.Iterate(value=>console.log(value));