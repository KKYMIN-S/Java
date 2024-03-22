package Java_;

public class printf_formatting {
    public static void main(String[] args){
        for(int n=0; n<=32;n++){
            String n_bin_str = String.format("%08d", Integer.parseInt(Integer.toBinaryString(n))); // 2진수 문자열로 포맷
            System.out.printf("%2d %#03o, %#04X %8s\n", n, n, n, n_bin_str);
        }
    }
}