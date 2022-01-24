public class Test{

    public static void main(String []args){
        StringBuilder builder = new StringBuilder("Test zamiany slowa $ w stringu ");
        int offset = builder.length();
        builder.append("dodatkowy napis");
        builder.insert(offset, "res=");
        System.out.println(builder);
    }
}
