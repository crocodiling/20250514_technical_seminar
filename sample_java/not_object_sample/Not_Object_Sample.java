public class Not_Object_Sample {
    public static void main(String[] args) {
        // オブジェクト指向を使わないバージョン
        String Gojo_name = "Gojo Masaru";
        int Gojo_age = 28;

        String Geto_name = "Geto Satoru";
        int Geto_age = 27;
        

        System.out.println(Gojo_name+"と申します");
        System.out.println(Gojo_age+"歳です");

        System.out.println(Geto_name+"と申します");
        System.out.println(Geto_age+"歳です");

        System.out.println("Geto Satoruは誕生日を迎えて，28歳になりました");
        Geto_age =  28;
        System.out.println("Geto Satoruの年齢は" + Geto_age+"歳です");

    }
    

}