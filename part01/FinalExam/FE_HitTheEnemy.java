package RepeatedExams;

public class FE_HitTheEnemy {

	public static void main(String[] args) {

		int[][] gameArea = new int[100][100];
		for (int row = 0; row < gameArea.length; row++) {
			for (int col = 0; col < gameArea[row].length; col++) {
				gameArea[row][col] = (int) (Math.random() * 2);
			}
		}
		int cx = (int) (Math.random() * 100) + 1;
		int cy = (int) (Math.random() * 100) + 1;

		System.out.println("Spaceship coordinates are " + cx + " and " + cy);
		System.out.println("The game area is " + gameArea[cx][cy]);
		System.out.println(hitEnemy(gameArea, cx, cy));
	}

	public static boolean hitEnemy(int gameArea[][], int cx, int cy) {

		if (gameArea[cx][cy] == 1) {
			gameArea[cx][cy] = 0;
			return true;
		}
		return false;
	}

}
