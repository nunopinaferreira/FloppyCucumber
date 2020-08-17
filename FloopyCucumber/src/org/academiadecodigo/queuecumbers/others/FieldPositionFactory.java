package org.academiadecodigo.queuecumbers.others;

import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.queuecumbers.GameObjects.Player;

public class FieldPositionFactory  {



    public static FieldPosition createNewPosition() {  // static porque queremos que seja accessível por parte de outras libraries
        FieldPosition position = new FieldPosition();
        return position;
    }

    public static FieldPosition createNewPosition(int col, int row) { // aceita argumentos para diferenciar, e porque é para o player
        FieldPosition position = new FieldPosition(col, row);
        return position;
    }

    public static FieldPosition createNewPosition(int row) {
        FieldPosition position = new FieldPosition(row);
        return position;
    }


}
