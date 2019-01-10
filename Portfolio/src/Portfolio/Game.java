package Portfolio;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Start(input);

	}
	public static void Start(Scanner input) {
        //Enter Asci art
        System.out.println("  ____||____\r\n" + 
        		" ///////////\\\r\n" + 
        		"///////////  \\\r\n" + 
        		"|    _    |  |\r\n" + 
        		"|[] | | []|[]|\r\n" + 
        		"|   | |   |  |");
        
        //Enter Story
        System.out.println("You wake up in a cold sweat. You realize that you are out side."
        		+ " Infront of you, you see a white house with a widow that is cracked. "
        		+ "You can type USE, SEARCH, GO TO");
        
        //Make choice
        String Choses;
        while (true){
            // Prompt user
            System.out.println("Make a choice");
            // Get Input
            Choses = input.nextLine();
            if (Choses.equalsIgnoreCase("Go to window")) {
                break;
            }
           
            else if (Choses.equalsIgnoreCase("Search house")) {
            	System.out.println("You look all around the house an you see nothing");
                
               
            }
            else if (Choses.equalsIgnoreCase( "Go to door")) {
            	System.out.println("You go to the door and try to open it but it is locked");
            }
            
            if (Choses.equalsIgnoreCase( "KMS")) {
            	break;
            }
            else {
                System.out.println("That is not a good choice");
            }
            
        }
        //Decide where to put the user
        switch(Choses){
            case "Go to window":
                template1(input);
                break;
           
            case "go to window":
                template1(input);
                break;
            case "Go To window":
                template1(input);
                break;
            case "Go To Window":
                template1(input);
                break;
            case "KMS":
            	KMS(input);
            	break;

        }
    }
    //Second part of the story
    public static void template1(Scanner input) {
        //Enter Asci art
        System.out.println("0================================================0\r\n" + 
        		"|'.                    (|)                     .'|\r\n" + 
        		"|  '.                   |                    .'  |\r\n" + 
        		"|    '.                |O|                 .'    |\r\n" + 
        		"|      '. ____________/===\\_____________ .'      |\r\n" + 
        		"|        :            `\\\"/`  ______     :     .. |\r\n" + 
        		"|        :     mmmmmmm  V   |--%%--|    :   .'|| |\r\n" + 
        		"|        :     |  |  |      |-%%%%-|    :  |  || |\r\n" + 
        		"|        :     |--|--| @@@  |=_||_=|    :  I  || |\r\n" + 
        		"|        :     |__|__|@@@@@ |_\\__/_|    :  |  || |\r\n" + 
        		"|        :             \\|/   ____       :  |  || |\r\n" + 
        		"|        :;;       .'``(_)```\\__/````:  :  |  || |\r\n" + 
        		"|        :||___   :================:'|  :  | 0+| |\r\n" + 
        		"|        :||===)  | |              | |  :  |  || |\r\n" + 
        		"|        ://``\\\\__|_|______________|_|__:  I  || |\r\n" + 
        		"|      .'/'    \\' | '              | '   '.|  || |\r\n" + 
        		"|    .'           |                |       '. || |\r\n" + 
        		"|  .'                                        '|| |\r\n" + 
        		"|.' Spicer                                     '.|\r\n" + 
        		"0================================================0\r\n" + 
        		"");
        
        //Enter Story
        System.out.println("You enter the house and and you see a table but you could probly see more if you take time to. ");
        
        //Make choice
        String Choses;
        while (true){
            // Prompt user
            System.out.println("Make a choice");
            // Get Input
            Choses = input.nextLine();
            
            if (Choses.equalsIgnoreCase("Go to Basement")) {
                break;
            }
            else if (Choses.equalsIgnoreCase("Search table")) {
                System.out.println("You find a sword. You keep it safe because you might need it later");
            }
            else if (Choses.equalsIgnoreCase( "Search room")) {
                System.out.println("You see that there is strairs that go down to a BASEMENT");    
            }
            
            else {
                System.out.println("That is not a good choise");
            }
            
        }
      //Decide where to put the user
        switch(Choses){
            case "Go To Basement":
                template2(input);
                break;
            case "Go To basement":
                template2(input);
                break;
           
                
            case "Go to basement":
                template2(input);
                break;
            case "go to basement":
                template2(input);
                break;
            case "GO TO BASEMENT":
                template2(input);
                break;
            case "KMS":
            	KMS(input);
            	break;

        }
    }
    //The third part of the story
    public static void template2(Scanner input) {
        //Enter Asci art
        System.out.println(" __________________________________________________________________\r\n" + 
        		"|__________________________________________________________________|\r\n" + 
        		"| __     __   _  _ _ _||_|_|_|_|_|_|_|_|_|_|_| __ _ _  _ _ _  __ _ |\r\n" + 
        		"||  |__ |--|_| || |_| |_|_|_|_|_|_|_|_|_|_|_|||xx| | ||~|~| ||  | ||\r\n" + 
        		"||==|  ||--| |~||-| |=||_|_|_|_|_|_|_|_|_|_|_||  |=|=|| | |~||==|~||\r\n" + 
        		"||  |==||  |=| || | | |_|_|_|_|_|_|_|_|_|_|_|||==|=|=||-|-|~||()|~||\r\n" + 
        		"||__|__||__|_|_||_|_|_||_|_|_|_|_|_|_|_|_|_|_||__|_|_||_|_|_||__|_||\r\n" + 
        		"|_____________________|_|_|_|_|_|_|_|_|_|_|_||_____________________|\r\n" + 
        		"| _ _ _ _ _ _ _ _ _ _ ||_|_|_|_|_|_|_|_|_|_|_| _ __ _ _  _ _ __  _ |\r\n" + 
        		"||~|~|~|~|~|~|~|~|~|~||_|_|_|_|_|_|_|_|_|_|_||| |  |_| ||$| |==|| ||\r\n" + 
        		"||*|*|*|*|*|*|*|*|*|*|||_|_|_|_|_|_|_|_|_|_|_||#|//|+|=||||~|xx||~||\r\n" + 
        		"||_|_|_|_|_|_|_|_|_|_||_|_|_|_|_|_|_|_|_|_|_|||_|__|_|_||_|_|__||_||\r\n" + 
        		"|==_==============,;,/________________________\\,;,==============_==|\r\n" + 
        		"| / \\            ;(;);                        ;(;);            / \\ |\r\n" + 
        		"|/___\\            =;============================;=            /___\\|\r\n" + 
        		"|  |  .-------.    [_|_|_]================[_|_|_]    .-------.  |  |\r\n" + 
        		"|  |  |       |    [__|__]       `(       [__|__]    |       |  |  |\r\n" + 
        		"|  |  |   *   |    [_|_|_] o     ) (    o [_|_|_]    |   *   |  |  |\r\n" + 
        		"|  |  |       |    [__|__] |    ( ) )   | [__|__]    |       |  |  |\r\n" + 
        		"|  |  ()_____  ()  [_|_|_] |---@@@@@@---| [_|_|_]  ()  _____()  |  |\r\n" + 
        		"|  |  ||_______||  [__|__]/!\\ @@@@@@@@ /!\\[__|__]  ||_______||  |  |\r\n" + 
        		"lc_|__||_______||_/______________________________\\_||_______||__|__|\r\n" + 
        		"  _|_ ||       |||________________________________|||       || _|_\r\n" + 
        		" `====||=======||==================================||=======||====`\r\n" + 
        		"`==================================================================`\r\n" + 
        		"====================================================================`\r\n" + 
        		"=====================================================================`");
        
        //Enter Story
        System.out.println("You go down stairs and you are amazed my how big it is down here. ");
        
        //Make choice
        String Choses;
        while (true){
            // Prompt user
            System.out.println("Make a choice");
            // Get Input
            Choses = input.nextLine();
           
            if (Choses.equalsIgnoreCase("Use book")) {
                System.out.println("You pick up one of the books and strat reading it. While you are reading the book the fire goes out"
                		+ "and you can go through the hole");
            	break;
            }
            if (Choses.equalsIgnoreCase("Go to fire")) {
                System.out.print("You try to go through the fire and you end up dieing. RIP ");
                break;
            }
            else if (Choses.equalsIgnoreCase( "Search room")) {
                System.out.println("You see books that are filled with knowledge and a fire that is blocking a hole in the wall");   
            }
            else {
                System.out.println("That is not a good choise");
            }
            
        }
      //Decide where to put the user
        switch(Choses){
            case "Use Book":
                template3(input);
                break;
          
            case "Use book":
                template3(input);
                break;
            case "use book":
                template3(input);
                break;
            case "USE BOOK":
                template3(input);
                break;
            case "Go To Fire":
                Fire(input);
                break;
            case "Go To fire":
                Fire(input);
                break;
            case "Go to fire":
                Fire(input);
                break;
            case "go to fire":
                Fire(input);
                break;
            case "GO TO FIRE":
                Fire(input);
                break;
            case "KMS":
            	KMS(input);
            	break;

        }
    }
    //The forth part of the story
    public static void template3(Scanner input) {
        //Enter Asci art
        System.out.println("                _________________\r\n" + 
        		"             ____/#################\\____\r\n" + 
        		"         ___/################,##########\\___\r\n" + 
        		"       _/################/##/ \\##\\##########\\_\r\n" + 
        		"      /#################/\\##| |##/\\###########\\\r\n" + 
        		"     /##################\\ \\#| |#/ /############\\\r\n" + 
        		"    |##DWB###############\\ \\| |/ /#########JRB##|\r\n" + 
        		"    |####################{{{\\ /}}}##############|\r\n" + 
        		"    |###################{{<.> <.>}}#############|\r\n" + 
        		"    |#####################{ | | }###############|\r\n" + 
        		"    |#####################{ | | }####_#######__#|\r\n" + 
        		"    |#####################/_| |_\\##_( )###__(  )_\r\n" + 
        		"    |####################{(_)_(_)}(  ` )_( '__ ` )\r\n" + 
        		"    |#####################{VV_VV}##(__( `)_(  )-` )\r\n" + 
        		"    |#####################\\^^))^/######(   )_')  )\r\n" + 
        		"    |######################--((-########( ' _)__)\r\n" + 
        		"    |########################))##########(__)###|\r\n" + 
        		"    |########################(##################|\r\n" + 
        		"    |###########################################|\r\n" + 
        		"    |###########################################|\r\n" + 
        		"    |###########################################|\r\n" + 
        		"    |###########################################|\r\n" + 
        		"\\ | /########| |################################| \\ | /\r\n" + 
        		"_\\|/|#######/   \\####################\\|/########|__\\|/___\r\n" + 
        		"            \\   /\r\n" + 
        		"             \\ /\r\n" + 
        		"              V\r\n" + 
        		"");
        
        //Enter Story
        System.out.println("You crawl through the hole and you are met in a big room with a dragon");
        
        //Make choice
        String Choses;
        while (true){
            // Prompt user
            System.out.println("Hurry And And Make a Choice (If you do not know what to do type in KMS)");
            // Get Input
            Choses = input.nextLine();
            if (Choses.equalsIgnoreCase( "Use Knowledge")) {
                System.out.println("You out smarted the dragon and he decided to kill himself");
            	break;    
            }
            if (Choses.equalsIgnoreCase("Use Sword")) {
                System.out.println("You pulled out your sword and had an epic battle with the dragon");
            	break;
            }
            if (Choses.equalsIgnoreCase("Use nothing")) {
               System.out.println("You sat and did nothing");
            	break;
            }
            else {
                System.out.println("That is not a good choise");
            }
            
        }
      //Decide where to put the user
        switch(Choses){
            case "Use Knowledge":
            	Knowledge(input);
                break;
            case "Use knowledge":
            	Knowledge(input);
                break;
           
                
            case "use knowledge":
                Knowledge(input);
                break;
            case "Use Sword":
                Sword(input);
                break;
            case "Use sword":
            	Sword(input);
                break;
            case "use sword":
            	Sword(input);
                break;
            case "Use Nothing":
                Nothing(input);
                break;
            case "Use nothing":
            	Nothing(input);
                break;
            case "use nothing":
            	Nothing(input);
                break;
            case "KMS":
            	KMS(input);
            	break;

        }
    }
    //The different endings
    public static void Knowledge(Scanner input) {
    	System.out.println("__  __               _       ___          \r\n" + 
    			"\\ \\/ /___  __  __   | |     / (_)___      \r\n" + 
    			" \\  / __ \\/ / / /   | | /| / / / __ \\     \r\n" + 
    			" / / /_/ / /_/ /    | |/ |/ / / / / /     \r\n" + 
    			"/_/\\____/\\__,_/     |__/|__/_/_/ /_/      \r\n" + 
    			"                                          ");
    }
    public static void Sword(Scanner input) {
    	System.out.println("__  __               _       ___          \r\n" + 
    			"\\ \\/ /___  __  __   | |     / (_)___      \r\n" + 
    			" \\  / __ \\/ / / /   | | /| / / / __ \\     \r\n" + 
    			" / / /_/ / /_/ /    | |/ |/ / / / / /     \r\n" + 
    			"/_/\\____/\\__,_/     |__/|__/_/_/ /_/      \r\n" + 
    			"                                          ");
    }
    public static void KMS(Scanner input) {
    	System.out.println("All of a sudden you are met with a lot of doubt and you end up pucnching your self to death");
    	System.out.println(" ________            ______          __\r\n" + 
    			" /_  __/ /_  ___     / ____/___  ____/ /\r\n" + 
    			"  / / / __ \\/ _ \\   / __/ / __ \\/ __  / \r\n" + 
    			" / / / / / /  __/  / /___/ / / / /_/ /  \r\n" + 
    			"/_/ /_/ /_/\\___/  /_____/_/ /_/\\__,_/   \r\n" + 
    			"                                        ");
    }
    public static void Fire(Scanner input) {
    	System.out.println(" ________            ______          __\r\n" + 
    			" /_  __/ /_  ___     / ____/___  ____/ /\r\n" + 
    			"  / / / __ \\/ _ \\   / __/ / __ \\/ __  / \r\n" + 
    			" / / / / / /  __/  / /___/ / / / /_/ /  \r\n" + 
    			"/_/ /_/ /_/\\___/  /_____/_/ /_/\\__,_/   \r\n" + 
    			"                                        ");
    }
    public static void Nothing(Scanner input) {
    	System.out.println("The Dragon Ate You");
    	System.out.println(" ________            ______          __\r\n" + 
    			" /_  __/ /_  ___     / ____/___  ____/ /\r\n" + 
    			"  / / / __ \\/ _ \\   / __/ / __ \\/ __  / \r\n" + 
    			" / / / / / /  __/  / /___/ / / / /_/ /  \r\n" + 
    			"/_/ /_/ /_/\\___/  /_____/_/ /_/\\__,_/   \r\n" + 
    			"                                        ");
    }


}
