package map_game;

public class Main {
	public static void main(String[] args) {
		char[][] map = new char[5][5];
		int y, x;
		
		for (y = 0; y < map.length; y++){
			for (x = 0; x < map.length; x++) {
				map[y][x] = '.';
			}
		}
		
		do {
			y = new java.util.Random().nextInt(5);
		    x = new java.util.Random().nextInt(5);
		} while(map[y][x] != '.');
		map[y][x] = 'g';
		
		do {
			y = new java.util.Random().nextInt(5);
		    x = new java.util.Random().nextInt(5);
		} while(map[y][x] != '.');
		map[y][x] = 'p';
		
		do {
			y = new java.util.Random().nextInt(5);
		    x = new java.util.Random().nextInt(5);
		} while(map[y][x] != '.');
		map[y][x] = 's';
		
		for (y = 0; y < map.length; y++){
			for (x = 0; x < map.length; x++) {
				System.out.print("|" + map[y][x]);
			}
			System.out.println("|");
		}
	}
}
