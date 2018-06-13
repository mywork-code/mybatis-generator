package thinking.in.java.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xiaohai on 2018/3/12.
 */
public class Groups {
    public static final String POEM = "Twas bring,and thie slithy toves" +
            "Did gyre and gimble in the wabe." +
            "All misy were the borogoves," +
            "And the mome raths outgrabe." +
            "" +
            "Beware the Jabberwock, my son," +
            "The jaws that bite,the claws that catch." +
            "Beware the Jubjub bird, and shun" +
            "The frumious Bandersnatch.";

    public static void main(String[] args) {
        String regex = "(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$";
        Matcher m = Pattern.compile(regex).matcher(POEM);
        while (m.find()){
            for (int j=0; j<=m.groupCount(); j++){
                System.out.println("["+m.group()+"]");
            }
        }

    }
}
