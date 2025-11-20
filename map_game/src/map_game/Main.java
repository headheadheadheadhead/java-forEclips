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

	public static void printMap(char[][] map) {
		for (int y = 0; y < map.length; y++){
			for (int x = 0; x < map.length; x++) {
				System.out.print("|" + map[y][x]);
			}
			System.out.println("|");
			}
	}

	public static void createMap(char[][] map) {
		for (int y = 0; y < map.length; y++){
			for (int x = 0; x < map.length; x++) {
				map[y][x] = '.';
			}
		}
	}

	public static void main(String[] args) {
		char[][] map = new char[5][5];

				createMap(map);
				setPosition('g', map);
				setPosition('s', map);
				setPosition('p', map);

				printMap(map);

	}
}


//　一つのクラスに、複数の指示を出すのはまずい書き方。似てても分ける