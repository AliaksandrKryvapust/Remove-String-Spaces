public class Source {
    public static void main(String[] args) {
    String str = "8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println(noSpace(str).equals("8j8mBliB8gimjB8B8jlB"));
    }
    public static String noSpace(final String x) {
        return x.replaceAll(" ","");
    }
}
