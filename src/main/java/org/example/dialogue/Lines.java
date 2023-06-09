package org.example.dialogue;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Lines {

    private static final Map<Integer, List<String>> masterLines = new LinkedHashMap<>();
    private static final Map<Integer, List<String>> protagonistLines = new LinkedHashMap<>();
    static {
        masterLines.put(0, Arrays.asList("Думаешь, ты сможешь уничтожить меня?! Уничтожить! Меня?"));
        masterLines.put(1, Arrays.asList("Так что же будет дальше? Ты примкнешь к Единству или сдохнешь здесь? Примкнешь или сдохнешь! Примкнешь или сдохнешь!"));
        masterLines.put(2, Arrays.asList("Отлично. Твои таланты пригодятся. Но сначала ты должен рассказать мне все о своем Убежище."));
        masterLines.put(3, Arrays.asList("Я покорю его и превращу всех его чистокровных людей в мутантов. Они дадут мне армию, которая мне нужна, чтобы принести мир во всю пустошь."));
        masterLines.put(4, Arrays.asList("Да будет так. Твои руки сами вырыли себе могилу. Могила! Могила!", "Я не должен ничего тебе доказывать! Доказывать."));
        masterLines.put(5, Arrays.asList("Очень требовательно для человека в твоем шатком положении. Но я уважаю твои пожелания."));
        masterLines.put(6, Arrays.asList("Единство породит расу Создателя. Создателя! Создателя! Тех, кто способен выжить и даже процветать в пустоши. Пока между нами есть различия, мы будем рвать друг-друга на куски, сражаясь друг с другом. Нам нужна единая раса. Раса! Раса! Одна цель. Цель! Цель! Один народ. . . двигаться вперед к нашей судьбе. Судьба.",
                "Конечно. Мутанты лучше всего приспособлены для выживания в современном мире. Кто еще? Гули? Пожалуйста. Увольте. Они уже навлекли ядерную\n" +
                        "смерть всем нам. Это будет эпоха мутантов. Мутанты."));
        masterLines.put(7, Arrays.asList("Все, кто будет сопротивляться, да. И все те, кто потребуются для Единства, тоже. Остальным будет позволено доживать свои дни, но под контролем и защитой Единства. Но никто не будет размножаться, ибо они будут последними представителями своей расы."));
        masterLines.put(8, Arrays.asList("Какая?"));
        masterLines.put(9, Arrays.asList("Мне пока не нужен весь мир. Когда я превращу всех твоих соседей по Убежищу в мутантов, мои силы станут слишком велики, чтобы кто-либо мог противостоять мне! Но не волнуйся, тебе уже будет все-равно. Равно! Равно!",
                "Абсурд! Вирус ВРЭ-2 не разрушает репродуктивные органы тех, кого он мутирует."));
        masterLines.put(10, Arrays.asList("У тебя есть доказательства?"));
        masterLines.put(11, Arrays.asList("Это ничего не доказывает! Ты заплатишь за свою наглость. Платить!"));
        masterLines.put(12, Arrays.asList("Я должен переварить эту информацию. Один момент . . . Теперь я понимаю. Ты принес мне правдоподобную подделку. Ты придумал это, чтобы одурачить меня. Одурачить! Меня!"));
        masterLines.put(13, Arrays.asList("Вы заплатите за то, что сделали! Платить! Сделали!", "Но этого не может быть. Это означало бы, что вся моя работа была напрасной. Все, что я пытался сделать, обернулось. . . неудачей! Этого не может быть. Быть. Быть. Быть."));
        masterLines.put(14, Arrays.asList("Да. Больше предметов. Думаю начать с вас. Делать! Делать!", "Я . . . не думаю, что я могу продолжать. Продолжать? Делать то, что я делал во имя прогресса и исцеления. Это было безумие. Я вижу это сейчас. Безумие. Безумие? Нет никакой надежды. Уходи сейчас, уходи, пока еще есть надежда. . .",
                "Верю, что так и будет. Не двигайся.", "Мои ученые уверяют меня, что все в порядке. Что вы на это скажете? Сказать! Сказать!"));
        masterLines.put(15, Arrays.asList("Один момент. Он недоступен. Он должен быть мертв, и я могу догадаться, кто его убил. Убит! Убийство!", "Он все отрицает. И он говорит, что знает, кто пустил этот слух. . .", "Кажется, я знаю, кто лжец. Лжец!", "Разумно. Один момент. Вы уверены? А как насчет других самок? Не может быть. Быть."));
        masterLines.put(16, Arrays.asList("Боюсь, что без каких-либо доказательств я не могу вам поверить. Теперь ты присоединишься к моей армии мутантом или умрешь! Умереть! Присоединиться!"));
        masterLines.put(17, Arrays.asList("Твой юмор тебя сейчас не спасет. Ты принимаешь мое предложение или нет? Нет! Принимай!"));
        masterLines.put(18, Arrays.asList("Радиация на нас не действует. Вирус FEV делает нас невосприимчивыми. Твой аргумент слаб, как и ты.", "О, я думаю, вы ошибаетесь. Но на всякий случай я прикажу изучить этот вопрос. После того, как я позаботился о тебе. Забота. Забота!", "Моя единственная проблема - это ты. Так ты будешь работать на Единство или нет?"));
        masterLines.put(19, Arrays.asList("Они будут наказаны за свою наглость."));
        masterLines.put(20, Arrays.asList("Конечно, нет. Большинству будет предложен шанс стать мутантом. Те, кто откажутся от этой возможности, будут стерилизованы и отпущены. Те, кто сопротивляется, будут казнены."));
        masterLines.put(21, Arrays.asList("Мы все предвзяты, не так ли? Каждый из нас больше заботится о наших индивидуальных сообществах, чем о других людях. Мы не изменились, и я вам еще кое-что скажу. . ."));
        masterLines.put(22, Arrays.asList("Мы не изменимся. Нет, если только мы не принадлежим к одному народу. Один. Один. Один. Одна гонка. Один. Один. Один. Единство позволит нам выйти за рамки этих мелких забот и заняться решением серьезных проблем. Вы хотите быть частью этого, не так ли? Часть. Не."));
        masterLines.put(23, Arrays.asList("Конечно! Мутанты выживут! Мутанты перестроят этот мир! И только как мутант, тебе будет позволено жить! Жить. Умереть!"));
        masterLines.put(24, Arrays.asList("Я не злодей. Ты понятия не имеешь, кто я и для чего существует Единство."));
        masterLines.put(25, Arrays.asList("Мне не нужно тебе ничего доказывать. Используя твою логику, мне надо доказать, что я не злодей. Было бы безнадежным делом объяснять это тебе.", "О? Пожалуйста, что это может быть за план?"));
        masterLines.put(26, Arrays.asList("Возможно, ты не шутишь. Это не имеет значения, но пока я отпускаю тебя.", "Вы лжете. Это будет последняя ложь, которую ты скажешь.", "Один момент, пока я просматриваю вашу историю. Возможно, вы говорите правду. Охранники! Отведите этого человека к ядру реактора. Решите проблему, пока не стало слишком поздно.",
                "Сомневаюсь, что даже ВРЭ тебе поможет. Почему я говорю? Вряд ли вы даже понимаете. . .", "Вы, должно быть, шутите.", "Мое терпение почти на исходе. Так ты присоединишься к Единству или нет? Присоединиться. Нет!"));
        masterLines.put(27, Arrays.asList("Отлично. Тогда ты можешь умереть здесь и сейчас!", "Вы обезвредили устройство. Отличный. Скажи мне, ты хочешь что-нибудь сказать перед тем, как я тебя убью?"));
        masterLines.put(28, Arrays.asList("Нет. Нет нет нет.", "Я Мастер. Я не обязан вам отвечать.", "Я здесь не для того, чтобы отвечать на ваши вопросы. Ты здесь, чтобы ответить на мой.", "Как только я узнаю местонахождение твоего хранилища, я выполню свое предназначение! Судьба! Судьба! Судьба!", "Ты думаешь, что сможешь меня уничтожить!? Разрушать! Мне?"));



        protagonistLines.put(1, Arrays.asList("Мне вас не одолеть. Я присоединяюсь к вам.", "Если вы сможете доказать мне, что ваше Единство - лучший путь для человечества, тогда я помогу вам.", "А давай ты сдохнешь, а потом я уйду?", "О, сегодня кто-то умрет, и это не я. У меня есть план.", "Угу. Ли."));
        protagonistLines.put(2, Arrays.asList("Почему?", "Хорошо. Я расскажу тебе все, что ты хочешь знать."));
        protagonistLines.put(3, Arrays.asList("Извините, мне не очень нравится этот план.", "Звучит разумно. Давай сделаем это."));
        protagonistLines.put(4, Arrays.asList("Ваше эго требует, чтобы вы сказали мне. У всех злодеев есть эта странная потребность все объяснять.", "Я не могу быть уверен, что вы представляете лучшее будущее, пока вы не докажете мне это."));
        protagonistLines.put(5, Arrays.asList("Ну, скажи мне."));
        protagonistLines.put(6, Arrays.asList("Конечно, эта раса - мутанты.", "Надеюсь, мы не будем в конечном итоге выглядеть как вы.", "Ты хочешь превратить всех остальных в мутантов.", "Ты такой фанатик.", "А что насчет тех, кто пойдет против тебя?"));
        protagonistLines.put(7, Arrays.asList("Есть загвоздка с вашим планом.", "Похоже, у вас все под контролем. Я присоединяюсь.", "Я думаю, что вы, все вы, спятили, и мне нужно остановить вас прямо сейчас."));
        protagonistLines.put(8, Arrays.asList("Вы не учли меня! Я останавливаю вас прямо здесь и сейчас!", "Вы не сможете захватить весь мир.", "Я тут узнал, что ваши мутанты стерильны."));
        protagonistLines.put(9, Arrays.asList("Возможно, когда-то вирус не стерилизовал людей, но теперь так и происходит.", "Ты говорил об этом с кем-нибудь из своих мутантов?", "Может быть, все дело в том, что дополнительное излучение."));
        protagonistLines.put(10, Arrays.asList("Конечно, есть! Смотри . . .", "Поверь мне на слово, такое случается.", "Спроси своих собственных мутантов."));
        protagonistLines.put(11, Arrays.asList("Я должен переварить эту информацию. Один момент."));
        protagonistLines.put(12, Arrays.asList("Что!? Я не понимаю, я думал, что это правильно!", "Вы лжете! Вы отрицаете имеющиеся у вас факты!"));
        protagonistLines.put(13, Arrays.asList("Извините, это не ваш вариант. Ваша раса вымрет после этого поколения.", "Может быть, можно что-то сделать. Возможно, вам нужно больше испытуемых."));
        protagonistLines.put(14, Arrays.asList("Ты не думал спросить у женщины-мутанта?", "Спроси у одного из своих лейтенантов.", "Они тебя боятся. Думаешь, они скажут тебе правду?"));
        protagonistLines.put(15, Arrays.asList("Извините, ваша раса обречена.", "Извините, что я злорадствую . . . Я же говорил!"));
        protagonistLines.put(16, Arrays.asList("Лучше быть мертвым, чем таким, как ты.", "Это значит отказаться от всего, что я знаю, но я присоединюсь."));
        protagonistLines.put(17, Arrays.asList("Нет.", "Хорошо, это лучше, чем умереть. . ."));
        protagonistLines.put(18, Arrays.asList("Нет.", "Конечно."));
        protagonistLines.put(19, Arrays.asList("Вы хотите убить их всех?", "Тогда я должен остановить вас прямо сейчас!"));
        protagonistLines.put(20, Arrays.asList("Ты просто больная шавка. Пора тебя усыпить.", "Хмм, я не очень-то люблю казнить. . . Я присоединяюсь."));
        protagonistLines.put(21, Arrays.asList("Что это?"));
        protagonistLines.put(22, Arrays.asList("Вы меня убедили. Я присоединюсь к Единству.", "Я хочу часть тебя. . . твою голову!"));
        protagonistLines.put(23, Arrays.asList("Жить!", "Умри!", "Все, что тебя волнует, это твои мутанты и их Единство."));
        protagonistLines.put(24, Arrays.asList("Тогда расскажи мне, для чего.", "Ты злодей. Ты просто отрицаешь свои внутренние чувства."));
        protagonistLines.put(25, Arrays.asList("Я собираюсь взорвать ядерное устройство в этом Убежище. Скоро он взорвется, и вы попадете в ад!", "Я убью вас, и вам будет трудно продолжать осуществлять ваш план, верно?", "Я убедил Братство Стали вторгнуться в это место, если меня схватят и не освободят. Они будут здесь в любой момент."));
        protagonistLines.put(26, Arrays.asList("Да.", "Нет."));
        protagonistLines.put(27, Arrays.asList("Да, теперь я могу присоединиться к вам?", "Даже мертвый, я все равно буду выглядеть лучше, чем вы."));
        protagonistLines.put(28, Arrays.asList("Да!"));

    }
    public List<String> getProtagonistLinesByLevel(int dialogueLevel){
        return protagonistLines.get(dialogueLevel);
    }

    public List<String> getMasterLinesByLevel(int dialogueLevel){
        return masterLines.get(dialogueLevel);
    }

    public Map<Integer, List<String>> getMasterLines(){
        return masterLines;
    }
    public Map<Integer, List<String>> getProtagonistLines(){
        return protagonistLines;
    }

}
