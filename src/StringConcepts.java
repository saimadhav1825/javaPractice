public class StringConcepts {
    public static void main(String[] args) {
        stringSample();
    }

    static void stringSample(){
        String s="string";
        String s1=new String("string");
        String another="string";
        if(s.equals(another)){
            System.out.println(s==another);
        }else {
            System.out.println(s==s1);
        }
    }
}
