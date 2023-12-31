package org.example;

import java.util.ArrayList;

public class Storage {
    private ArrayList<String> quoteList;

    Storage() {
        quoteList = new ArrayList<>();
        quoteList.add("Начинать всегда стоит с того, что сеет сомнения. \n\nБорис Стругацкий.");
        quoteList.add("80% успеха - это появиться в нужном месте в нужное время.\n\nВуди Аллен");
        quoteList.add("Мы должны признать очевидное: понимают лишь те,кто хочет понять.\n\nБернар Вербер");
        quoteList.add("Если президенты не могут делать этого со своими женами, они делают " +
                "это со своими странами.\n\nИосиф Бродский");
        quoteList.add("Уважать всякого человека, как самого себя, и поступать с ним, как мы желаем, чтобы с нами поступали," +
                " — выше этого нет ничего.\n\nКонфуций");
        quoteList.add("Все мы гении. Но если вы будете судить рыбу по её способности взбираться на дерево," +
                " она проживёт всю жизнь, считая себя дурой. \n\nАльберт Эйнштейн");
        quoteList.add("Безвыходным мы называем положение, выход " +
                "из которого нам не нравится.\n\nСтанислав Ежи Лец");
        quoteList.add("Жизнь состоит не в том, чтобы найти себя. Жизнь состоит " +
                "в том, чтобы создать себя.\n\nДжордж Бернард Шоу\n");
        quoteList.add("Пройдите мимо нас и " +
                "простите нам наше счастье.\n\nФёдор Михайлович Достоевский");
        quoteList.add("Задумчивая душа склоняется к одиночеству.\n\nОмар Хайям");
        quoteList.add("Уметь выносить одиночество и получать " +
                "от него удовольствие — великий дар.\n\nДжордж Бернард Шоу");
        quoteList.add("Когда уходите на пять минут,\n" +
                "Не забывайте оставлять тепло в ладонях.\n" +
                "В ладонях тех, которые вас ждут,\n" +
                "В ладонях тех, которые вас помнят...\n\nОмар Хайям");
        quoteList.add("Глуп тот человек, который никогда не " +
                "меняет своего мнения.\n\nУинстон Черчилль");
        quoteList.add("Дайте человеку всё, чего он желает, и в ту же минуту он почувствует, " +
                "что это всё не есть всё.\n\nИммануил Кант");
        quoteList.add("Проблема этого мира в том, что глупцы и фанатики слишком уверены в себе, " +
                "а умные люди полны сомнений.\n\nБертран Рассел");
        quoteList.add("У всякого безумия есть своя логика.\n\nУильям Шекспир");
        quoteList.add("Секрет быть скучным состоит в умении рассказать о себе всё.\n\nОскар Уайльд");
        quoteList.add("Настоящий друг с тобой, когда ты не прав. Когда ты прав, всякий будет с тобой.\n\nМарк Твен");
        quoteList.add("Лучше быть одной, чем несчастной с кем-то.\n\nМэрилин Монро");
        quoteList.add("Окружающим легко сказать: «Не принимай близко к сердцу». Откуда им знать, какова " +
                "глубина твоего сердца? И где для него — близко?\n\nЭльчин Сафарли");
        quoteList.add("Влюбляешься ведь только в чужое, родное — любишь.\n\nМарина Ивановна Цветаева");
        quoteList.add("Мы не хозяева собственной жизни. Мы связаны с другими прошлым и настоящим. И каждый проступок, " +
                "как и каждое доброе дело, " +
                "рождают новое будущее.\n\nОблачный атлас (Cloud Atlas)");


    }

    String getRandQuote() {
        //получаем случайное значение в интервале от 0 до самого большого индекса
        int randValue = (int) (Math.random() * quoteList.size());
        //Из коллекции получаем цитату со случайным индексом и возвращаем ее
        return quoteList.get(randValue);
    }
}
