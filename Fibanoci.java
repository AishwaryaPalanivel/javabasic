package week1.ass;

public class Fibanoci {

			public static void main(String[] args) {
				int fib = 0, s = 1, n = 8, num = 0;
					
				for (int i = 0; i < n; i++) {
					
					if(i<2)
						System.out.println(i);
					else
					{
					num = fib + s;
					fib = s;
					s = num;
					System.out.println(num);
					}
				}
			}

		}