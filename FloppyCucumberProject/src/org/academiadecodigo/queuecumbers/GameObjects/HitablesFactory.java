
package org.academiadecodigo.queuecumbers.GameObjects;


public class HitablesFactory {


    public static HitableObjects getNewHitable() {

        HitableTypes[] hitableTypes = HitableTypes.values();

        int random = (int) (Math.random() * hitableTypes.length);

        if (random == 0) {
            return new Enemies();
        } else {
            return new Collectibles();
        }
    }
}


