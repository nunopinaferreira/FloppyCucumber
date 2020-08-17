package org.academiadecodigo.queuecumbers.Game;

public class Score {

    int totalScore = 0;

    public void setScore(int score){ // recebe um int de pontuação de um Collectible, e altera o score actual
        totalScore += score;

    }

    public int getScore(){  // retorna o valor do score total
        return this.totalScore;
}

}
