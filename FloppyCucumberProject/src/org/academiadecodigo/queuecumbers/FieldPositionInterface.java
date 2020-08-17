package org.academiadecodigo.queuecumbers;

import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public interface FieldPositionInterface {



    int getCol(); // vai buscar Col

    int getRow(); // vai buscar Row



    void moveLeft(int num);

    void moveLeft(); // movimento para GameObjects
}
