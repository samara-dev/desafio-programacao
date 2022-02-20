public class Desafio2Test {

    @Test
    public void deveValidarSenha() {
        String senhaSobTeste = "#$sss344";
        assertTrue(Desafio2.verificaSenha(senhaSobTeste));
    }

    @Test
    public void deveInvalidarSenha() {
        String senhaSobTeste = "123";
        assertFalse(Desafio2.verificaSenha(senhaSobTeste));
    }
}