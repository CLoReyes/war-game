import java.util.Scanner;

public class TWO_DEE_ARRAY


	{
		static String map [] [] = new String [8] [6];
		
		public static void main(String[] args)
			{
				createMap();
				
				playerInput();
				
				war_map_display();
				
				
			}

		

		private static void createMap()
			{
				
				for (int row = 0; row < map.length; row++)
					{
						for (int col = 0; col < map[row].length; col++)
							{
								
								map[row][col] = " ";
							}
						System.out.println();
					}
			}
	
		private static void playerInput()
		
			{
				Scanner mapType = new Scanner (System.in);
				System.out.println("Type in the number of map you would like to play in:");
				System.out.println("1. Bridge");
				System.out.println("2. Mountainous");
				System.out.println("3. Lava");
				System.out.println("4. Water");
				
				int mapChoice = mapType.nextInt();
				
					if (mapChoice == 1)
						{
							
						}
				
				
				
			}
		private static void war_map_display()
			{
				System.out.println("      0          1          2          3          4          5");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("0 |   " + map [0] [0] + "   |  |   " + map [0] [1] + "   |  |   " + map [0] [2] + "   |  |   " + map [0] [3] + "   |  |   " + map [0] [4] + "   |  |   " + map [0] [5] + "   |");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("1 |   " + map [1] [0] + "   |  |   " + map [1] [1] + "   |  |   " + map [1] [2] + "   |  |   " + map [1] [3] + "   |  |   " + map [1] [4] + "   |  |   " + map [1] [5] + "   |");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("2 |   " + map [2] [0] + "   |  |   " + map [2] [1] + "   |  |   " + map [2] [2] + "   |  |   " + map [2] [3] + "   |  |   " + map [2] [4] + "   |  |   " + map [2] [5] + "   |");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("3 |   " + map [3] [0] + "   |  |   " + map [3] [1] + "   |  |   " + map [3] [2] + "   |  |   " + map [3] [3] + "   |  |   " + map [3] [4] + "   |  |   " + map [3] [5] + "   |");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("4 |   " + map [4] [0] + "   |  |   " + map [4] [1] + "   |  |   " + map [4] [2] + "   |  |   " + map [4] [3] + "   |  |   " + map [4] [4] + "   |  |   " + map [4] [5] + "   |");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("5 |   " + map [5] [0] + "   |  |   " + map [5] [1] + "   |  |   " + map [5] [2] + "   |  |   " + map [5] [3] + "   |  |   " + map [5] [4] + "   |  |   " + map[5] [5] + "   |");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("6 |   " + map [6] [0] + "   |  |   " + map [6] [1] + "   |  |   " + map [6] [2] + "   |  |   " + map [6] [3] + "   |  |   " + map [6] [4] + "   |  |   " + map [6] [5] + "   |");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("7 |   " + map [7] [0] + "   |  |   " + map [7] [1] + "   |  |   " + map [7] [2] + "   |  |   " + map [7] [3] + "   |  |   " + map [7] [4] + "   |  |   " + map [7] [5] + "   |");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
			}

	}
