import java.util.StringTokenizer;
import java.util.Arrays;

public class StringTokenizerExample1 {
	public static void main(String args[]) {
		StringTokenizer stok = new StringTokenizer(Arrays.toString(args),"[,]");
		while (stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}