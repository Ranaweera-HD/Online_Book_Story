import java.util.*;
import java.time.LocalDate;
class OnlineBookStory {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	double CR_Book = 80.00;
	double Pen = 20.00;
	double Pencil = 15.00;
	double Eraser = 10.00;
	double Glue = 40.00;
	double Pencil_Box = 100.00;
	double Water_Bottle = 230.00;
	double Lunch_Box = 250.00;
	double Calculator = 250.00;
	double School_Bag = 1000.00;
	double Ruler = 10.00;
	double Highlighter = 50.00;
	double Cardboard_File = 25.00;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	System.out.println(" ");
	System.out.println("\t\t\t\t______             _      _____ _                  ");
	System.out.println("\t\t\t\t| ___ \\           | |    /  ___| |                 ");
	System.out.println("\t\t\t\t| |_/ / ___   ___ | | __ \\ `--.| |__   ___  _ __   ");
	System.out.println("\t\t\t\t| ___ \\/ _ \\ / _ \\| |/ /  `--. \\ '_ \\ / _ \\| '_ \\  ");
	System.out.println("\t\t\t\t| |_/ / (_) | (_) |   <  /\\__/ / | | | (_) | |_) | ");
	System.out.println("\t\t\t\t\\____/ \\___/ \\___/|_|\\_\\ \\____/|_| |_|\\___/| .__/  ");
	System.out.println("\t\t\t\t                                           | |     ");
	System.out.println("\t\t\t\t                                           |_|     ");
	System.out.println("\t\t\t\t                                                   ");
	System.out.println("\t\t\t================================================================");
	System.out.println("\n");
	LocalDate myObj = LocalDate.now();
	System.out.print("\t\t\t\tEnter Date\t\t: "+myObj);
	System.out.println("\n");
	System.out.print("\t\t\t\tCustomer Number\t\t: ");
	String cusNumber = input.next();
	System.out.println("\n");
	System.out.print("\t\t\t\tEnter Customer Name\t: ");
	String cusName = input.next();
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\t\t\t\t");
	System.out.println("\t\t\t\t  ____       _                 _   ___ _                      ");
	System.out.println("\t\t\t\t / ___|  ___| |__   ___   ___ | | |_ _| |_ ___ _ __ ___  ___  ");
	System.out.println("\t\t\t\t \\___ \\ / __| '_ \\ / _ \\ / _ \\| |  | || __/ _ \\ '_ ` _ \\/ __| ");
	System.out.println("\t\t\t\t  ___) | (__| | | | (_) | (_) | |  | || ||  __/ | | | | \\__ \\ ");
	System.out.println("\t\t\t\t |____/ \\___|_| |_|\\___/ \\___/|_| |___|\\__\\___|_| |_| |_|___/ ");
	System.out.println("\t\t\t\t                                                              ");
	System.out.println("\t\t\t============================================================================");
	System.out.println("\n");
	System.out.print("\t\t\t\tCR Book (QTY)  \t\t: ");
	int crbookQty = input.nextInt();
	System.out.println("\n");
	System.out.print("\t\t\t\tPen (QTY) \t\t: ");
	int penQty = input.nextInt();
	System.out.println("\n");
	System.out.print("\t\t\t\tPencil (QTY) \t\t: ");
	int pencilQty = input.nextInt();
	System.out.println("\n");
	System.out.print("\t\t\t\tEraser (QTY) \t\t: ");
	int eraserQty = input.nextInt();
	System.out.println("\n");
	System.out.print("\t\t\t\tPencil Box (QTY) \t: ");
	int pencilboxQty = input.nextInt();
	System.out.println("\n");
	System.out.print("\t\t\t\tGlue Bottle (QTY) \t: ");
	int gluebottleQty = input.nextInt();
	System.out.println("\n");
	System.out.print("\t\t\t\tRuler- (MEDIUM) (QTY) \t: ");
	int rullerQty = input.nextInt();
	System.out.println("\n");
	System.out.println("\n");

    }
}
