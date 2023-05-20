package edu.qc.seclass;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCustomString implements MyCustomStringInterface{

	private String myString;
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return this.myString;
	}

	@Override
	public void setString(String string) {
		// TODO Auto-generated method stub
		this.myString = string;
	}

	@Override
	public int countNumbers() {
		// TODO Auto-generated method stub
		
		int count = 0;
		if(this.myString.isEmpty()) {
			return 0;
		}
		
		else if(this.myString == null) {
			throw new NullPointerException(); 
		}
		
		Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(this.myString);
        while(m.find()) {
            count++;
        }
		return count;
	}


	
	@Override
	public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
		// TODO Auto-generated method stub
		String temp = this.myString;
		String ans = "";
		String outString = "";
        String tempTwo = "";
		if(temp == null && n > 0) {
			throw new NullPointerException();
		}
		
		if(n <= 0) {
			throw new IllegalArgumentException();
		}
		
		
		
		if(startFromEnd) {
			for(char c : temp.toCharArray()) {
				outString = c + outString;
			}
			temp = outString;
			
		}
		
		for(int i = n-1; i < this.myString.length(); i=i+n) {
			ans+=temp.charAt(i);
		}
		
		if(startFromEnd) {
			for(char c : ans.toCharArray()) {
				tempTwo = c + tempTwo;
			}
			ans = tempTwo;
		}
		
		
		return ans;
	}

	@Override
	public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
		// TODO Auto-generated method stub
		
		if(startPosition > endPosition) {
			throw new IllegalArgumentException();
		}
		
		if(startPosition <= endPosition && (startPosition < 1 || endPosition > this.myString.length())) {
			throw new MyIndexOutOfBoundsException();
		}
	        
		if((startPosition <= endPosition) && ((startPosition > 0 && endPosition > 0 && this.myString == null))){
			throw new NullPointerException();
		}
		
		else {
			StringBuffer ans = new StringBuffer();
            for(int i = 0; i < this.myString.length(); i++){
                if(Character.isDigit(myString.charAt(i)) && i >= startPosition-1 && i <= endPosition-1 ){
                    switch(myString.charAt(i)){
                        case '0' : 
                            ans.append("Zero");
                            break;
                        case '1' : 
                            ans.append("One");
                            break;
                        case '2' : 
                            ans.append("Two");
                            break;
                        case '3' : 
                            ans.append("Three");
                            break;
                        case '4' : 
                            ans.append("Four");
                            break;
                        case '5' : 
                            ans.append("Five");
                            break;
                        case '6' : 
                            ans.append("Six");
                            break;
                        case '7' : 
                            ans.append("Seven");
                            break;
                        case '8' : 
                            ans.append("Eight");
                            break;
                        case '9' : 
                            ans.append("Nine");
                            break;

                    }
                }
                else{
                    ans.append(this.myString.charAt(i));
                }
            }
            this.myString = ans.toString();
        }
    }
}


