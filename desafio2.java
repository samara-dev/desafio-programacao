public class Desafio2 {
    
    public static void main(String[] args) {
        boolean atingiuMinimoDeCaracteres = verificaSenha("Yaz");
        if(!atingiuMinimoDeCaracteres) {
            System.out.println(minimoDeCaracteres - senhaDebora.length());
        }
    }

    public static void verificaSenha(String senhaDebora) {
        Integer minimoDeCaracteres = 6;
        return (senhaDebora.length() - minimoDeCaracteres) > 0;
    }
}
