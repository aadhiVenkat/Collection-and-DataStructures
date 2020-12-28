package DynamicArray;

public class DynamicArray {

	public static void main(String[] args) {
		Array array=new Array(3);
		array.insert(1);
		array.insert(2);
		array.insert(3);
		array.insert(4);
		array.insert(5);
		array.insert(6);
		array.insert(7);
		//array.removeAt(8);
		
		array.print();
		System.out.println("Index of value"+array.indexOf(4));
		
	}

}
