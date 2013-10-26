package game.entidade;

import game.entidade.Loot;
//import java.util.ArrayList;


/**
 * @author Bruno
 *
 */
public abstract class Inimigo {

        /**
         * 
         */
        public String nome;
        public int lvl;
        public String tipo;
        public int spe;
        public Loot loot;
        public int hp;
        public int atk;        
        public int def;
        
        public Inimigo() {
        }
        
        public abstract int getDef();

        public abstract Loot getLoot();
                
        public abstract String getNome();
        
        public abstract int getAtk();
        
        public abstract int getHp();
        
        
        
}