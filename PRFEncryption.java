import java.util.Hashtable;

public class PRFEncryption{
    private static Hashtable<Character,Character> PRF = new Hashtable<Character,Character>();

    public String Encrypt(String message){
        String ciphertext = "";
        for(int i = 0; i < message.length(); i++){
            char key = message.charAt(i);
            if(PRF.containsKey(key)){
                ciphertext += PRF.get(key);
            }
            int num = (int)(Math.random() * 26);
            char value = numToValue(num); // need to make sure value is not stored in PRF, cant map different keys to same value

        }
    }
    public String Decrypt(String ciphertext){

    }
    public static char numToValue(int index){
        char value = 'a';
        if(index == 0)
            value = 'a';
        if(index == 1)
            value = 'b';
        if(index == 2)
            value = 'c';
        if(index == 3)
            value = 'd';
        if(index == 4)
            value = 'e';
        if(index == 5)
            value = 'f';
        if(index == 6)
            value = 'g';
        if(index == 7)
            value = 'h';
        if(index == 8)
            value = 'i';
        if(index == 9)
            value = 'j';
        if(index == 10)
            value = 'k';
        if(index == 11)
            value = 'l';
        if(index == 12)
            value = 'm';
        if(index == 13)
            value = 'n';
        if(index == 14)
            value = 'o';
        if(index == 15)
            value = 'p';
        if(index == 16)
            value = 'q';
        if(index == 17)
            value = 'r';
        if(index == 18)
            value = 's';
        if(index == 19)
            value = 't';
        if(index == 20)
            value = 'u';
        if(index == 21)
            value = 'v';
        if(index == 22)
            value = 'w';
        if(index == 23)
            value = 'x';
        if(index == 24)
            value = 'y';
        if(index == 25)
            value = 'z';
        return value;
    }
}