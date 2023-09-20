package equipamentos.Program;

import equipamentos.Iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        //atribuindo os valores para somente o IPHONE
        // Adiciona aba no navegador
        iphone.adicionarNovaAba();
        System.out.println();
        // Atende ligação
        iphone.atender();
        System.out.println();
        // Atualiza página do navegador
        iphone.atualizarPagina();
        System.out.println();
        // Liga pelo telefone
        iphone.ligar();
        System.out.println();
        // Exibe a página do navegador
        iphone.exibirPagina();
        System.out.println();
        // Pausa a música do aplicativo músical
        iphone.pausar();
        System.out.println();
        // Toca musica no aplicativo músical
        iphone.tocar();
        System.out.println();
        // Inicia um correio de voz pelo telefone
        iphone.iniciarCorreioVoz();
        System.out.println();
        // Seleciona música no aplicativo músical
        iphone.selecionarMusica();
    }
}
