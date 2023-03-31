package org.example;

import java.util.*;

public class LinkedList
{
    public Node head;
    public Node tail;

    public LinkedList()
    {
        head = null;
        tail = null;
    }

    public void addInTail(Node item) {
        if (this.head == null)
            this.head = item;
        else
            this.tail.next = item;
        this.tail = item;
    }

    public Node find(int value) {
        Node node = this.head;
        while (node != null) {
            if (node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    public ArrayList<Node> findAll(int _value) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Node node = this.head;
        while (node != null) {
            if (node.value == _value) {
                nodes.add(node);
            }
            node = node.next;
        }
        return nodes;    }

    public boolean remove(int _value)
    {
        Node findedNode = find(_value);
        Node node = this.head;
        Node prevNode = node;
        while (node != null) {
            if (findedNode == node) {
                if (node == this.head && node == this.tail) {
                    this.head = null;
                    this.tail = null;
                    return true;
                }

                if (node == this.head) {
                    this.head = node.next;
                    return true;
                } else {
                    prevNode.next = node.next;
                    if (node == this.tail) {
                        this.tail = prevNode;
                    }
                    return  true;
                }
            }
            prevNode = node;
            node = node.next;
        }
        return false;
    }

    public void removeAll(int _value)
    {
        Node deletedNode = find(_value);
        Node node = deletedNode;
        while (node != null) {
            if (node.value == deletedNode.value)
                remove(node.value);
            node = node.next;
        }
    }

    public void clear()
    {
        head = null;
        tail = null;
    }

    public int count()
    {
        int count = 0;
        Node node = this.head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public void insertAfter(Node _nodeAfter, Node _nodeToInsert)
    {
        if (_nodeAfter == null) {
            if (this.head == null && this.tail == null) {
                this.head = _nodeToInsert;
                this.tail = _nodeToInsert;
            } else {
                _nodeToInsert.next = this.head;
               this. head = _nodeToInsert;
            }
        } else {
            Node node = this.head;
            while (node != null) {
                if (_nodeAfter.value == node.value) {
                    if (node.next == null) {
                        tail = _nodeToInsert;
                    }
                    _nodeToInsert.next = node.next;
                    node.next = _nodeToInsert;
                    return;
                }
                node = node.next;
            }
        }
    }

}

class Node
{
    public int value;
    public Node next;
    public Node(int _value)
    {
        value = _value;
        next = null;
    }
}
