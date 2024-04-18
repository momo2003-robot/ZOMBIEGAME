package actions;

import board.*;
import actors.Survivor;
import equipements.Equipment;
import listchooser.ListChooser;
import listchooser.InteractiveListChooser;

public class TakeEquipement extends Action {
    private Survivor survivor;

    public TakeEquipement() {
        super(1);
    }

    @Override
    public void execute(Survivor s) {
        Cell currentCell = s.getCell();
        if (currentCell.getEquipements().isEmpty()) {
            System.out.println("Aucun équipement n'est à prendre dans cette case.");
        }
        ListChooser<Equipment> chooser = new InteractiveListChooser<>();
        Equipment chosenEquipment = chooser.choose("Quel équipement vous voulez prendre ?", currentCell.getEquipements());
        
        if (chosenEquipment != null) {
            System.out.println(s + " a pris l'équipement : " + chosenEquipment);
            currentCell.getEquipements().remove(chosenEquipment);
            survivor.addToBackpack(chosenEquipment);            
        } else {
            System.out.println(s + " n'a pas pris d'équipement.");
        }
       
    
    }
}
