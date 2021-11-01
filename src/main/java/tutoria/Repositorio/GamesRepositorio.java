/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria.Repositorio;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tutoria.Interface.InterfaceGames;
import tutoria.Modelo.Games;

/**
 *
 * @author USUARIO
 */
@Repository
public class GamesRepositorio {
      @Autowired
    private InterfaceGames crud;
    

    public List<Games> getAll(){
        return (List<Games>) crud.findAll();       
    }
    
    public Optional <Games> getGames(int id){
        return crud.findById(id);
    }
    
    public Games save(Games games){
        return crud.save(games);
    }
     public void delete(Games games){
        crud.delete(games);
    }
    
}
