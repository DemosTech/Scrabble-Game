package King_Sammy;
import java.util.*;
public class ScrambleGame {

	/**
	 * @param args
	 */
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	 final String[] sportTerms ={"basketball","referee","linesman","penalty","Goal","Umpire","dribble",
			 "score","referee","keeper","player","penalty","kick","foul","jersey","striker",
             "umpire","tennis","pitch","coach","bat","cricket","football","opponent","tackle","offside"};
	final  String[] techTerms= {"google","apple","windows","Stack","youtube","android","java",
			"microsoft","oracle","linux","uber","dropbox","amazon","spacex"};
	final String[] bibleTerms = {"eden","golgotha","sinai","bethlehem","righteousness","ecclesiastes","patmos",
			"lucifer","methusaleh","abednego","pharisee","saducee"};
	
	String separator = "****************************";
	System.out.println(separator);
	System.out.print("Welcome to the Scrabble Game!!!");
	System.out.println("Enter choice:");
	System.out.println("1. Sport");
	System.out.println("2. Technology");
	System.out.println("3. Bible");
	
	int choice = input.nextInt();
	
	switch(choice){
		case 1: startGame(sportTerms);
		break;
		case 2: startGame(techTerms);
		break;
		case 3: startGame(bibleTerms);
		
			
	}
	
	
	System.out.println(separator);


	}	
	public static void startGame(String arr[]){ 
		String word, ansa; int point = 0; int count = 0;
	System.out.println("How many questions do you want? ");
	int no = input.nextInt();
	
	while(count<no){
	word = arr[rand.nextInt(arr.length)];
	System.out.println(shuffle(word));
	System.out.println("Enter correct word for the scrambled word above:");
	 ansa = input.next();

	if(ansa.equalsIgnoreCase(word)){
		System.out.println("Correct!");
		point=point+10;
	}
	else{
		System.out.println("Wrong. Answer is "+ word);

	}
	count++;
	}
	System.out.println("You answered "+ no +" questions\nYou had "+ point +" points");
	
	}
	
	
	
	
	public static String shuffle(String s){
		String[] scram = s.split("");
		List<String> letters = Arrays.asList(scram);
		Collections.shuffle(letters);
		
		StringBuilder sb = new StringBuilder(s.length());
		for(String c : letters){
			sb.append(c);
		}
		return sb.toString();
	

	}
}