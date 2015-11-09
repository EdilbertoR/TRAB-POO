package Cadastrar_Musicas_Discoteca;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Principal {

	public static void main(String[] args) { 
           
        
		Genero r = new Genero ("Rock",3);
		if(Conexaobd.inserir(r)!=0) {
			System.out.println("Genero inserido sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
                        
		}
                
                Genero s = new Genero ("Sertanejo",8);
		if(Conexaobd.inserir(s)!=0) {
			System.out.println("Genero inserido sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
		
                Genero re = new Genero ("Reggae",9);
		if(Conexaobd.inserir(re)!=0) {
			System.out.println("Genero inserido sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
		
                 Artista o= new Artista("MetallicA",9);
		if(Conexaobd.inserir(o)!=0) {
			System.out.println("Artista  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                Musica m = new Musica ("Sad But True",12,12);
		if(Conexaobd.inserir(m)!=0) {
			System.out.println("Artista  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                
                
                Album f = new Album("Closse",1987);
		if(Conexaobd.inserir(f)!=0) {
			System.out.println("Album  inserido com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
		
		ResultSet res = Conexaobd.relatorio();
		if(res!=null) {
			try {
				while(res.next()) {
					System.out.println("Nome: "+res.getString("nome"));
//				
				}
			} catch (SQLException e) {
				System.out.println("falhad no registros!");
			}
		} else {
			System.out.println("sem registro!");
		}

	}
               
}

