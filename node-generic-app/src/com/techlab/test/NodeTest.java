package com.techlab.test;

import com.techlab.model.Node;

public class NodeTest {

	public static void main(String[] args)  {

		Node<String> node1=new Node<String>("Gayatri");
		Node<String> node2=new Node<String>("Swabhav Techlabs");
		Node<String> node3=new Node<String>("AurionPro Solutions");

		node1.setNext(node2);
		node2.setNext(node3);

		display(node1);
		display(node2);
		display(node3);
	}

	private static void display(Node node) {

		while(node.checkNext())
		{
			System.out.println(node.getData());
			if(node.checkNext())
			{
				node=node.getNext();
				continue;
			}
		}
		System.out.println(node.getData());
		System.out.println();
	}
}
