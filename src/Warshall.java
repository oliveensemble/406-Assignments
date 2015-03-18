import java.util.*;

public class Warshall {

	public static int[][] transitiveClosure(Graph graph, int [][] theMatrix){
		int [][] matrix = theMatrix;
		for(int k = 1; k < graph.numNodes + 1; k++){
			for(int i = 1; i < graph.numNodes + 1; i++){
				for(int j = 1; j < graph.numNodes + 1; j++ ){
					if((matrix [i][k] == 1) && (matrix[k][j] == 1)){
						matrix[i][j] = 1;
					}
				}
			}
		}
		return matrix;
	}
}