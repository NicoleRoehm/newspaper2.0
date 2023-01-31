package com.example.recyclerwiederholung_news.data

import com.example.recyclerwiederholung_news.R
import com.example.recyclerwiederholung_news.data.model.NewsArticle

class Repository {

    fun loadNews(): List<NewsArticle> {
        return listOf(
            NewsArticle(
                1,
                "Das neuste Update in RoK, die Spieler sind fassungslos",
                R.drawable.bild_30_01_23_um_14_05,
                "Deutschland",
                "23.01.2023",
                "Das Spiel RoK - Rise of Kingdoms gab ein neues Update raus. " +
                        "Die Spieler sind außer sich, das neue Gebäude sei nur was für " +
                        "Spieler die viel Geld investieren. Die Formationen bringen nicht" +
                        " den gewünschten Effekt, die Auffrüstung dauert sehr lange und das " +
                        "aufwerten kostet unmengen an Ressourcen. Viele Spieler haben " +
                        "das Spiel daraufhin verlassen. Einige meinten bei einer Umfrage, das" +
                        "sich das Spiel in den letzten Jahren sehr zum negativen verändert hätte." +
                        "Aber es gibt auch eingefleischte Zocker, die es nicht stört und trotzdem" +
                        "ihr Hobby nicht aufgeben wollen." +
                        "Wir verfolgen das ganze weiter und halten euch natürlich auf dem " +
                        "laufenden. ",
                mutableListOf("richtig mies", "es ist unerhört", "das ist das schlimmste Update")
            ),
            NewsArticle(
                2,
                "Die Top 10 gefährlichsten Tiere Deutschlands!",
                R.drawable.raubtier,
                "Deutschland",
                "23.01.2023",
                "auchtung achtung!\nDie fressen dich",
                mutableListOf("richtig mies")
            ),
            NewsArticle(
                3,
                "Wird künstliche Intelligenz uns bald alle ersetzen?!? Das sagen Wissenschaftler…",
                R.drawable.ai,
                "Welt",
                "26.01.2023",
                "glaubt doch niemand",
                mutableListOf("richtig mies")
            ),
            NewsArticle(
                4,
                "Die Hochhauspflicht - das Ende von Einfamilienhäusern? Lies alles dazu…",
                R.drawable.hochhaus,
                "Schweiz",
                "28.01.2023",
                "das ist ein Test",
                mutableListOf("richtig mies")
            ),
            NewsArticle(
                5,
                "Ist Leonardo Di Caprio der neue Spiderman? Hollywood spielt verrückt",
                R.drawable.leo,
                "USA",
                "30.01.2023",
                "Fände ich super",
                mutableListOf("richtig mies")
            ),
            NewsArticle(
                6,
                "Kommt bald Cast Away Teil 2? Tom Hanks leaked die Infos!",
                R.drawable.cast_away,
                "USA",
                "13.01.2023",
                "ojdifuiaberubfvchcbdskau jbhuhbuzbvuz",
                mutableListOf("richtig mies")
            )
        )
    }
}
