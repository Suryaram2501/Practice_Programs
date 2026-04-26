public class palindrome {
    public static void main(String[] args) {
        String name = "Ramkumar";
        String reversd = "";
        for(int i = name.length()-1;i>=0;i--)
        {
            reversd = reversd + name.charAt(i);

        }
        if (reversd.equalsIgnoreCase(name)){
            System.out.println(name+" is a palindrome");

        }
        else {
            System.out.println(name + " is not a palindrome");
        }
    }
}
