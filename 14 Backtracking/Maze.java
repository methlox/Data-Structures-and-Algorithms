import java.util.ArrayList;

// no of ways to go from (3,3) to (1,1). you can only move down and right

public class Maze {
	public static void main(String[] args) {
//		System.out.println(count(3, 3));
//		path("", 3, 3);
//		System.out.println(pathList("", 3, 3));
//		System.out.println(pathDia("", 3, 3));
		
		boolean[][] board = {
				{true, true, true},
				{true, false, true},
				{true, true, true}
		};
		
		pathWithObstacles("", board, 0, 0);
		
	}
	
	static int count(int r, int c) {
		if (r == 1 || c == 1) {
			return 1;
		}
		
		int left = count(r-1, c);
		int right = count(r, c-1);
		return left + right;
	}
	
	static void path(String p, int r, int c) {
		if (r == 1 && c == 1) {
			System.out.println(p);
			return;
		}
		
		if (r > 1) {
			path(p + 'D', r - 1, c);
		}
		
		if (c > 1) {
			path(p + 'R', r, c-1);
		}
	}
	
	static ArrayList<String> pathList(String p, int r, int c) {
		if (r == 1 && c == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		if (r > 1) {
			list.addAll(pathList(p + 'D', r - 1, c));
		}
		
		if (c > 1) {
			list.addAll(pathList(p + 'R', r, c-1));
		}
		
		return list;
	}
	
	static ArrayList<String> pathDia(String p, int r, int c) {
		
		// now you can move down, right and in diagonal
		// D diagonal, V vertical, H horizontal
		
		if (r == 1 && c == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		if (r > 1 && c > 1) {
			list.addAll(pathDia(p + 'D', r - 1, c - 1));
		}
		
		if (r > 1) {
			list.addAll(pathDia(p + 'V', r - 1, c));
		}
		
		if (c > 1) {
			list.addAll(pathDia(p + 'H', r, c-1));
		}
		
		return list;
	}
	
	static void pathWithObstacles(String p, boolean[][] maze, int r, int c) {
		// There's a river in between in the center of the maze
		// we're not starting from 3,3 but instead from 0, 0 to 2, 2
		
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		
		if (!maze[r][c]) {
			return;
		}
		
		if (r < maze.length - 1) {
			pathWithObstacles(p + 'D', maze, r + 1, c);
		}
		
		if (c < maze[0].length - 1) {
			pathWithObstacles(p + 'R', maze, r, c +  1);
		}
	}
}