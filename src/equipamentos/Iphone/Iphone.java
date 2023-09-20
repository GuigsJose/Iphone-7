package equipamentos.Iphone;

import equipamentos.navegador.NavegadorInternet;
import equipamentos.reprodutorMusical.ReprodutorMusical;
import equipamentos.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página no Iphone...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página no Iphone...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Iphone...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no Itunes...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Itunes...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no Itunes...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
