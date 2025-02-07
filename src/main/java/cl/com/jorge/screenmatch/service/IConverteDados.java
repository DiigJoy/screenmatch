package cl.com.jorge.screenmatch.service;
//Se crea el iconvertedados para manipular varios datos de fuentes diferentes
public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); //Recibe un retorno que no esta definido, a classe serve para converter na classe indicada
}
