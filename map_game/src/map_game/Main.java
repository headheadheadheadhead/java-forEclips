package map_game;

public class Main {
	public static char setPosition(char object, char[][] map) {
		int y;
		int x;
		do {
			y = new java.util.Random().nextInt(5);
		    x = new java.util.Random().nextInt(5);
		} while(map[y][x] != '.');
		return map[y][x] = object;
	}

	public static void oneCreateTwoPrintMap(char[][] map, int j) {
		for (int y = 0; y < map.length; y++){
			if (j == 2) {
			for (int x = 0; x < map.length; x++) {
				System.out.print("|" + map[y][x]);
			}
			System.out.println("|");
			} else {
				for (int x = 0; x < map.length; x++) {
					map[y][x] = '.';
				}
			}
		}
	}
	public static void main(String[] args) {
		char[][] map = new char[5][5];

				oneCreateTwoPrintMap(map, 1);
				setPosition('g', map);
				setPosition('s', map);
				setPosition('p', map);

				oneCreateTwoPrintMap(map, 2);

	}
}
