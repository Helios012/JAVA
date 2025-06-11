class AgeException extends Exception{
	AgeException(String s){
		super(s);
	}
}
public class CustomException{
	static void validate(int age) throws AgeException{
		if(age<18)
			throw new AgeException("Can't vote");
		else
			System.out.println("Can Vote");
	}
	public static void main(String args[]) throws AgeException{
		validate(17);
}
}

