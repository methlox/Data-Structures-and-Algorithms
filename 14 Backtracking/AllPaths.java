import java.util.Arrays;
// we can go up down right left

public class AllPaths {
	public static void main(String[] args) {
		boolean[][] board = {
				{true, true, true},
				{true, true, true},
				{true, true, true}
		};
		
//		pathAll("", board, 0, 0);
		int[][] path = new int[board.length][board[0].length];
		pathAllPrint("", board, 0, 0, path, 1);
	}
	
	static void pathAll(String p, boolean[][] maze, int r, int c) {
		// we're not starting from 3,3 but instead from 0, 0 to 2, 2
		
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		
		if (!maze[r][c]) {
			return;
		}
		
		// mark the visited block as false
		maze[r][c] = false;
		
		if (r < maze.length - 1) {
			pathAll(p + 'D', maze, r + 1, c);
		}
		
		if (c < maze[0].length - 1) {
			pathAll(p + 'R', maze, r, c +  1);
		}
		
		if (r > 0) {
			pathAll(p + 'U', maze, r - 1, c);
		}
		
		if (c > 0) {
			pathAll(p + 'L', maze, r, c -  1);
		}
		
		// function ends so remark the blocks as true
		maze[r][c] = true;
	}
	
	static void pathAllPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
		// behenchod
		// mark the steps that we are taking
		// we're not starting from 3,3 but instead from 0, 0 to 2, 2
		
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			path[r][c] = step;
			for(int[] arr : path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return;
		}
		
		if (!maze[r][c]) {
			return;
		}
		
		// mark the visited block as false
		maze[r][c] = false;
		path[r][c] = step;
		
		if (r < maze.length - 1) {
			pathAllPrint(p + 'D', maze, r + 1, c, path, step+1);
		}
		
		if (c < maze[0].length - 1) {
			pathAllPrint(p + 'R', maze, r, c + 1, path, step+1);
		}
		
		if (r > 0) {
			pathAllPrint(p + 'U', maze, r - 1, c, path, step+1);
		}
		
		if (c > 0) {
			pathAllPrint(p + 'L', maze, r, c - 1, path, step+1);
		}
		
		// function ends so remark the blocks as true
		maze[r][c] = true;
		path[r][c] = 0;
	}
}
