package cl.com.jorge.screenmatch.service;

import org.springframework.stereotype.Service;

//Se crea el iconvertedados para manipular varios datos de fuentes diferentes
@Service
public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); //Recibe un retorno que no esta definido, a classe serve para converter na classe indicada
}
