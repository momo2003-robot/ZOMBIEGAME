package board;
import actors.*;
import equipements.*;
import java.util.*;

public class BoardMain {
    
    public static void main(String[] args) {
    	System.out.println("-----------------------Plateau--------------------" );
        if(args.length != 2) {
            System.out.println("Usage: java BoardMain <height> <width>");
            return;
        }
        int height, width;

        try {
            height = Integer.parseInt(args[0]);
            width = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integer values for height and width.");
            return;
        }
        if(width < 5 || height < 5) {
            System.out.println("The width and height values must be greater than or equal to 5.");
            return;
        }
        Board board = new Board(width, height);
        board.printBoard();
        
        Role fighter = new FighterRole();
        Role healer = new HealerRole();
       
        
        Survivor survivor1 = new Survivor(board.getMainCrossroad(),"survivor1");
        survivor1.addRole(fighter);
        survivor1.addRole(healer);
        System.out.println("------------------Création des survivants-----------------" +'\n');
        System.out.println(survivor1.toString());
        
        Survivor survivor2 = new Survivor(board.getMainCrossroad(), "survivor2");
        survivor2.addRole(healer);
        System.out.println(survivor2.toString());
        
        RunnersZ runner = new RunnersZ(board.getMainCrossroad(),"zombie1");
        ToughZ tough = new ToughZ(board.getMainCrossroad(), "zombie2");
        System.out.println("-------------------Création des zombies-------------------" + '\n');
        System.out.println(runner.toString());
        System.out.println(tough.toString());
        System.out.println("-------------------Création des équipements---------------" +'\n');
        Axe axe = new Axe();
        ChainSaw chainsaw = new ChainSaw();
        System.out.println(axe.toString());
        System.out.println(chainsaw.toString());
        Map1 map1 = new Map1();
        MasterKey mkey= new MasterKey();
        System.out.println(map1.toString());
        System.out.println(mkey.toString());
        System.out.println("------------------Attribution des équipements aux acteurs----------" +'\n');
        survivor1.addToBackpack(axe);
        survivor1.addToBackpack(map1);
        System.out.println(survivor1.toString());
        
        System.out.println("-----------------Contenu des cases-----------------" +'\n');
        board.getCell(1,1).addSurvivors(survivor1);
        board.getCell(1,1).addSurvivors(survivor2);
        board.getCell(1,1).addEquipements(map1);
        
        board.getCell(4,4).addZombie(tough);
        board.getCell(4,4).addEquipements(chainsaw);
        System.out.println(board.getCell(1,1).toString());
        System.out.println(board.getCell(4,4).toString());
    }
}