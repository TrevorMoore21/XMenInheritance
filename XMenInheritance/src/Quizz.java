import java.util.Scanner;


public class Quizz
	{
		public static int strike45;
		public static int qNum;
		static Scanner userIntInput = new Scanner(System.in);
		
		public static void question1()
		{
			
			System.out.println("                    SupaPower a = new SupaPower();");
			System.out.println("                    a.famous()");
			System.out.println();
			System.out.println("What will the result be?");
			System.out.println("(1) I'm awesome");
			System.out.println("(2) Bow before thee!?");
			System.out.println("(3) Kardashians where you at?");
			System.out.println("(4) I have money");
			System.out.println("(5) THE SKY IS FALLING");
			int q1 = userIntInput.nextInt();
			qNum++;
			
			if (q1 == 2)
				{
					strike45++;
					System.out.println("You have " + strike45 + " out of " + qNum + " correct");
				}
			else
				{
					System.out.println("Answer 2 was the right answer");
					System.out.println("You have " + strike45 + " out of " + qNum + " correct");
				}
				
			System.out.println();
			
		}
		
		public static void question2()
		{

			System.out.println("                    SupaPower a = new SupaPower();");
			System.out.println("                    a.goodOrEvil()");
			System.out.println();
			System.out.println("What will the result be?");
			System.out.println("(1) I'm bad");
			System.out.println("(2) I'm good");
			System.out.println("(3) Full Send");
			System.out.println("(4) Do I save this baby?");
			System.out.println("(5) Michael Jackson");
			int q1 = userIntInput.nextInt();
			qNum++;
			
			if (q1 == 4)
				{
					strike45++;
					System.out.println("You have " + strike45 + " out of " + qNum + " correct");
				}
			else
				{
					System.out.println("Answer 4 was the right answer");
					System.out.println("You have " + strike45 + " out of " + qNum + " correct");
				}
			System.out.println();
		}
		
		public static void question3()
			{

				System.out.println("                    SupaPower a = new SupaPower();");
				System.out.println("                    a.runFast()");
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("(1) Usain Bolt who");
				System.out.println("(2) Blurr");
				System.out.println("(3) Error");
				System.out.println("(4) I'm  faster than the flash");
				System.out.println("(5) Michael Jackson");
				int q1 = userIntInput.nextInt();
				qNum++;
				
				if (q1 == 3)
					{
						strike45++;
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				else
					{
						System.out.println("Answer 3 was the right answer");
						System.out.println("The method runFast() is not in the SupaPower superclass");
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				System.out.println();
			}
		
		public static void question4()
			{

				System.out.println("                    Speed a = new Speed();");
				System.out.println("                    a.runFast()");
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("(1) Usain Bolt who");
				System.out.println("(2) Blurr");
				System.out.println("(3) Error");
				System.out.println("(4) I'm  faster than the flash");
				System.out.println("(5) Michael Jackson");
				int q1 = userIntInput.nextInt();
				qNum++;
				
				if (q1 == 1)
					{
						strike45++;
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				else
					{
						System.out.println("Answer 1 was the right answer");
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				System.out.println();
			}
		
		public static void question5()
			{

				System.out.println("                    SupaPower a = new Speed();");
				System.out.println("                    a.timeTravel()");
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("(1) Hitler is in danger");
				System.out.println("(2) Gandhi was a nice man");
				System.out.println("(3) The 80's were more fun than they say");
				System.out.println("(4) I'm so fast I can break the space-time continuum");
				System.out.println("(5) Error");
				int q1 = userIntInput.nextInt();
				qNum++;
				
				if (q1 == 5)
					{
						strike45++;
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				else
					{
						System.out.println("Answer 5 was the right answer");
						System.out.println("The method timeTravel() is not in the superclass SupaPower and it is not overriden or cast");
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				System.out.println();
			}
		
		public static void question6()
			{

				System.out.println("                    SupaPower a = new Speed();");
				System.out.println("                    a.goodOrEvil()");
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("(1) Error");
				System.out.println("(2) The Rock is not actually a rock");
				System.out.println("(3) All speedsters are good");
				System.out.println("(4) Do I save this baby?");
				System.out.println("(5) Mr. McGuire rocks");
				int q1 = userIntInput.nextInt();
				qNum++;
				
				if (q1 == 3)
					{
						strike45++;
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				else
					{
						System.out.println("Answer 3 was the right answer");
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				System.out.println();
			}
		
		public static void question7()
			{

				System.out.println("                    SupaPower a = new Flight();");
				System.out.println("                    a.flying()");
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("(1) Superman sucks");
				System.out.println("(2) I don't buy plane tickets");
				System.out.println("(3) Error");
				System.out.println("(4) A bird?");
				System.out.println("(5) A plane?");
				int q1 = userIntInput.nextInt();
				qNum++;
				
				if (q1 == 3)
					{
						strike45++;
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				else
					{
						System.out.println("Answer 3 was the right answer");
						System.out.println("The method flying() is not in the superclass SupaPower and it is not overriden or cast");
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				System.out.println();
			}
		
		public static void question8()
			{

				System.out.println("                    SupaPower a = new Flight();");
				System.out.println("                    a.goggles()");
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("(1) I hate bugs");
				System.out.println("(2) I don't buy plane tickets");
				System.out.println("(3) I need goggles so bugs don't fly into my eyes");
				System.out.println("(4) Error");
				System.out.println("(5) Lumberjacks?");
				int q1 = userIntInput.nextInt();
				qNum++;
				
				if (q1 == 4)
					{
						strike45++;
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				else
					{
						System.out.println("Answer 4 was the right answer");
						System.out.println("The method goggles() is not in the superclass SupaPower and it is not overriden or cast");
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				System.out.println();
			}
		
		public static void question9()
			{

				System.out.println("                    Speed a = new SupaPower();");
				System.out.println("                    a.goggles()");
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("(1) I'm just fast");
				System.out.println("(2) I can walk on water");
				System.out.println("(3) 70's have better music");
				System.out.println("(4) Michael Jordan");
				System.out.println("(5) Error");
				int q1 = userIntInput.nextInt();
				qNum++;
				
				if (q1 == 5)
					{
						strike45++;
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				else
					{
						System.out.println("Answer 5 was the right answer");
						System.out.println("You cannot do this instantiation");
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				System.out.println();
			}
		
		public static void question10()
			{

				System.out.println("                    Speed a = new Flight();");
				System.out.println("                    a.goggles()");
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("(1) Skunk Spray");
				System.out.println("(2) Error");
				System.out.println("(3) Cheddar");
				System.out.println("(4) Gas");
				System.out.println("(5) Heat");
				int q1 = userIntInput.nextInt();
				qNum++;
				
				if (q1 == 2)
					{
						strike45++;
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				else
					{
						System.out.println("Answer 2 was the right answer");
						System.out.println("You cannot do this instantiation");
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				System.out.println();
			}
		
		public static void question11()
			{

				System.out.println("                    Flight a = new Flight();");
				System.out.println("                    a.flying()");
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("(1) Superman sucks");
				System.out.println("(2) I don't buy plane tickets");
				System.out.println("(3) Error");
				System.out.println("(4) A bird?");
				System.out.println("(5) A plane?");
				int q1 = userIntInput.nextInt();
				qNum++;
				
				if (q1 == 2)
					{
						strike45++;
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				else
					{
						System.out.println("Answer 2 was the right answer");
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				System.out.println();
			}
		
		public static void question12()
			{

				System.out.println("                    Flight a = new Flight();");
				System.out.println("                    a.goggles()");
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("(1) I hate bugs");
				System.out.println("(2) I don't buy plane tickets");
				System.out.println("(3) I need goggles so bugs don't fly into my eyes");
				System.out.println("(4) Error");
				System.out.println("(5) Lumberjacks?");
				int q1 = userIntInput.nextInt();
				qNum++;
				
				if (q1 == 3)
					{
						strike45++;
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				else
					{
						System.out.println("Answer 3 was the right answer");
						System.out.println("You have " + strike45 + " out of " + qNum + " correct");
					}
				System.out.println();
			}
		
	}
