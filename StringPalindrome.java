class Palindrome{

public static void main(String [] args){

String name="malayalam";

String res=null;

for(int i=name.length()-1; i>0;i--){

res=res+name.charAt(i);

}

if(name.equals(res)){

System.out.println("This is Palindrome");

}
else{

System.out.println("This is not a Palindrome");

}

}

}
