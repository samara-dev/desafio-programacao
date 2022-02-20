public class Desafio2 {
    
    public static void main(String[] args) {
        Integer minimoDeCaracteres = 6;
        String senhaDebora = "Yaz";
                
        Boolean atingiuMinimoDeCaracteres = (senhaDebora.length() - minimoDeCaracteres) > 0;
        
        if(!atingiuMinimoDeCaracteres) {
            System.out.println(minimoDeCaracteres - senhaDebora.length());
        }
    }
}
