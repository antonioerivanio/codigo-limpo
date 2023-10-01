package br.com.tce.ce.gov.codigolLimpo.cap01NomesSignificativos;

import java.util.ArrayList;
import java.util.List;

public class NomeQueReveleSeuProposito2 {
    public List<Cell> getFlaggedCells(){
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : flaggedCells)
            if(cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }

}
