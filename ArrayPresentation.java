package student;

public class ArrayPresentation {
	public static void main(String[] args) {
		
		System.out.println("\n2D Array-------------------\n");
		
		int[][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;

		int element = matrix[0][0];
		System.out.println(element);

		for (int[] row : matrix) {
		    for (int num : row) {
		        System.out.print(num + " ");
		    }
		    System.out.println();
		}
		
		System.out.println("\nJagged Array-------------------\n");

		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		
		//Initializing 
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		
		//Traversing
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
