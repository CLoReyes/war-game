
public class TWO_DEE_ARRAY
	{
		static int map [] [] = new int [8] [6];
		
		public static void main(String[] args)
			{
				war_map_display();
				createMap();
			}

		private static void createMap()
			{
				
				for (int row = 0; row < map.length; row++)
					{
						for (int col = 0; col < map[row].length; col++)
							{
								System.out.print(" ");
							}
						System.out.println();
					}
			}

		private static void war_map_display()
			{
				System.out.println("      1          2          3          4          5          6");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("1 |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("2 |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |");				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("3 |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |");				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("4 |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |");				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("5 |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |");				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("6 |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |");				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("7 |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |");				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("8 |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |  |   " + map [0] [0] + "   |");				System.out.println("  |       |  |       |  |       |  |       |  |       |  |       |");
				System.out.println("  ---------  ---------  ---------  ---------  ---------  ---------");
			}

	}
