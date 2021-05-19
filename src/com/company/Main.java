package com.company;


import java.io.IOException;

/*Делает в строку сразу результат на печать

    public static String getNetAddress(byte[] ip, byte[] mask) {
        String result = "";
        String promezh = "";
        for (int i = 0; i < 4; i++) {
            byte a = ip[i];
            byte b = mask[i];

            int c = a&b;

            String fromBinary = Integer.toBinaryString(c);
            if (fromBinary.length() > 8) {
                promezh = fromBinary.substring(24, 31);}
            else promezh = String.format("%8s", fromBinary).replace(" ", "0");

            result = result + promezh + " ";
        }
        return result;
    }*/
public class Main {
    public static void main(String[] args) throws IOException {
        int a = 3;
        int b = --a + (a++ * ++a);
        System.out.println(b);
    }


}





        /*String name = a.replaceAll("\\d", "").trim();
        String date = a.substring(name.length()+1, a.length());
        System.out.println(name);
        System.out.println(date);*/

        /*URL url = new URL("https://www.tradingview.com");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String a;
            while ((a = reader.readLine()) != null) {
                System.out.println(a);
            }
        }*/


        /*Работа с RegEx. Регулярными выражениями.

        String g = "word12 12 548 4 55555 6 4word word sdsdf sdfsdf \n, sfsfsfsfhjk dfsfsf\n";


        String[] b = g.split(" ");

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i].matches("^\\d+$") ) System.out.print(b[i] + "\n");
        }*/


        /*String[] v = g.split("\\W");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i].equals("word")) count++;
        }
        System.out.println(count);*/
       // System.out.println(g.replaceAll("[()1]", ""));

       /* String a = String.format("%020d", 5012567);
        System.out.println(a);
        System.out.println(String.format("Привет м%cр", 99));*/




       /* BufferedReader fileReader = new BufferedReader(new FileReader(start));
        int countLines = 0;
        while (fileReader.ready()) {
            fileReader.readLine();
            countLines++;
        }

        System.out.println("In this file " + countLines + " lines\n" );

        ArrayList<String> stringsFromFile = new ArrayList<>();
        String lineFromFile;

        try (BufferedReader reader = new BufferedReader(new FileReader(start))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        while ((lineFromFile = fileReader.readLine()) != null) {
            System.out.println(lineFromFile);
            System.out.println("Эпробел");
        }
       while (fileReader.ready()) {
            lineFromFile = fileReader.readLine();
            System.out.println("Эпробел");
            System.out.println(lineFromFile);
            stringsFromFile.add(lineFromFile);              //добавил строки из файла в список
        }

        for (String a : stringsFromFile
        ) {
            System.out.println(a);
        }

        ArrayList<String> idFromFile = new ArrayList<>();

        for (String a : stringsFromFile
        ) {
            String id = a.substring(0, 9);
            idFromFile.add(id);                    // добавил IDшники в список
        }

        for (String a : idFromFile
             ) {
            System.out.println(a);
        }
*/


       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        String[] halfURL = url.split("\\?");
        String a = halfURL[1];      //взяли правую часть урл и сделали строкой

        String[] clearParts = a.split("&"); //добавили в массив строки, в каждой часть урла с параметром

        for (String b : clearParts
             ) {
            String[] c = b.split("=");
            String d = c[0];
            System.out.print(d + " ");
        }

        System.out.print('\n');

        if (a.contains("obj")) {
            for (String b : clearParts          //запускаем цикл, который берет каждую отдельую часть урл
            ) {
                String[] c = b.split("=");  //разделяет эту часть по =
                for (String g : c
                     ) {
                    String d = c[0];    // Здесь будет лежать obj
                    String e = c[1];    // Здесь будет значение после параметра obj
                    if (d.equals("obj")) {
                        try { Main.alert(Double.parseDouble(e));}
                        catch (NumberFormatException j) { Main.alert(e); }
                        break;
                    }
                }
            }
        }
        Второрй вариант
         if (a.contains("obj")) {
            for (String b : clearParts          //запускаем цикл, который берет каждую отдельую часть урл
            ) {
                String[] c = b.split("=");  //разделяет эту часть по =
                for (String g : c
                ) {
                    String d = c[0];    // Здесь будет лежать obj
                    String e = c[1];    // Здесь будет значение после параметра obj
                    if (d.equals("obj")) {
                        try { Solution.alert(Double.parseDouble(e));}
                        catch (NumberFormatException j) { Solution.alert(e); }
                        break;
                    }
                }
            }
        } */

       /* String fileNamePart = "";
        ArrayList<String> list = new ArrayList<>();
        while (!(fileNamePart = reader.readLine()).equals("end")) {
            list.add(fileNamePart);
        }

        for (String a : list
             ) {
            System.out.println(a);
        }

        reader.close();*/



  /*  public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(100000);
        clock.interrupt();
        isStopped = true;
        System.out.println("The clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTikTak() throws InterruptedException {
            //add your code here - добавь код тут
            int i = 0;
            while (true) {
                i++;
                System.out.println(i + " Tik");
                Thread.sleep(1000);
                System.out.println(i + " Tak");
                Thread.sleep(1000);
            }
        }
    }
}

*/
        /*ArrayList<Human> allHumans = new ArrayList<>();
        allHumans.add(child1);
        allHumans.add(child2);
        allHumans.add(child3);

        allHumans.add(father);
        allHumans.add(mother);

        allHumans.add(grandFather1);
        allHumans.add(grandMother1);
        allHumans.add(grandFather2);
        allHumans.add(grandMother2);

        for (Human s : allHumans
        ) {
            System.out.println(s);
        }*/




    /*public static void main(String[] args) throws IOException {
        HashMap <Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Vasya");
        mapa.put(2, "Petya");
        mapa.put(3, "Slava");
        mapa.put(4, "Dasha");

        System.out.println("Получил get 3 " + mapa.get(3));
        System.out.println("Получил get 5 несуществующий " + mapa.get(5));
        System.out.println("Содержит ключ 3 " + mapa.containsKey(3));
        System.out.println("Задал несуществующий ключ " + mapa.containsKey(9));
        System.out.println("Задал несуществующее значение " + mapa.containsValue(" "));
        
        System.out.println("Карта/словарь целиком" + mapa);

        for (Map.Entry entry: mapa.entrySet()
             ) {
            System.out.println("Вывел через цикл " + entry);
        }

       Set<Integer> integerSet = mapa.keySet();
        for (Integer i:integerSet
             ) {
            System.out.println("Printing Set " + i);
        }

        ArrayList<String> list = new ArrayList<>(mapa.values());
        for (String s:list
             ) {
            System.out.println("Printing list " + s);
        }
    }
}*/
/*
    }

    public static class AntonVolodin{
        private String name;
        String surName;

        public AntonVolodin(String name, String surName){
            this.name = name;
            this.surName = surName;
        }
    }

    public static class Timoha extends AntonVolodin{
        public Timoha(String name, String surName) {
            super(name, surName);
        }

        String
    }
}*/

    /*    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] strings = string.split(" ");
        for (String s: strings) {
            System.out.println(s);
        }

        for (int i = 0; i < strings.length; i++) {
            String s+i = strings[i];
        }
     /*   String test = "My test string";
        String str = "Another sthing";
        System.out.println(str.indexOf("th"));*/




   /*  */


/* Рассчет индекса массы тела
        public static void main(String[] args) throws IOException {
                BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
                double weight = Double.parseDouble(bis.readLine());
                double height = Double.parseDouble(bis.readLine());

                Body.calculateMassIndex(weight, height);
        }

        public static class Body {
                public static void calculateMassIndex(double weight, double height) {
                        // напишите тут ваш код
                        double index = weight / (height * height);
                        if (index < 18.5) { System.out.println("Недовес: меньше чем 18.5"); }
                        if (index<25 & index>=18.5) {System.out.println("Нормальный: между 18.5 и 25");}
                        if (index<30 & index>=25) { System.out.println("Избыточный вес: между 25 и 30");}
                        if (index>=30) { System.out.println("Ожирение: 30 или больше");}
                }
        }   */


          /*      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
                int sum = 0;
                int x = 0;
                while (true) {
                        String s = buffer.readLine();
                        if (s.equals("сумма")) {
                                System.out.println(sum);
                                break;
                        }
                        else
                                x = Integer.parseInt(s);
                        sum += x;
                } */


         /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a<=b && a<=c) {

            if (b <= c) System.out.println(c + " " + b + " " + a);
            else System.out.println(b + " " + c + " " + a);
        }
        if (b<=a && b<=c) {
            if (a<=c) System.out.println(c + " " + a + " " + b);
            else System.out.println(a + " " + c + " " + b);
        }
        if (c<=a && c<=b) {
            if (b<=a)System.out.println(a + " " + b + " " + c);
            else System.out.println(b + " " + a + " " + c);
        }

         */





        /*
        for (int i=1; i<=10; i++)
        {
        String[] wordListOne = {"круглосуточный", "длинный", "обоюдный", "взаимный", "динамичный", "на основе вэб-технологий", "30000-футовый", "проникающий", "умный"};
        String[] wordLineTwo = {"уполномоченный", "трудный", "чистый продукт", "кластеризованый", "нестандартный ум", "выровненный", "ускоренный", "совместный", "использованный с выгодой"};
        String[] wordLineTree = {"выход из положения","портал", "талант", "пункт разгрузки", "период времени", "портал", "процесс", "талант", "тип структуры", "портал","уровень завоеванного внимания"};

        int oneLength = wordListOne.length;
        int twoLength = wordLineTwo.length;
        int treeLength = wordLineTree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*treeLength);
        String phrase = wordListOne[rand1] + " " + wordLineTwo[rand2] + " " + wordLineTree[rand3];

        System.out.println(i + " " + phrase);}
           */


      /*Так и не понял, как работает эта конструкция
        int x = 3023;
        int n = 0;
        int s = 0;
        for(;x>0;x = x / 10){
                        n = x % 10;
            System.out.print("Первая итерация ");
            System.out.println("x=" + x +  " n=" +n  + " s=" + s);
            if(n % 3 == 0){
                s += n;
                System.out.print("Вторая итерация ");
                System.out.println("x=" + x +  " n=" +n  + " s=" + s);
            }
        }    */











    /*Здесь я подставляю окончание к слову Рубль в правильном падеже при вводе цифр

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Введите число. Сумма денег в рублях");
        int a = Integer.parseInt(reader.readLine());
        int b = a%10;
        String c = "рубл";
        if (b==1) System.out.println(c+"ь");
        if (b>=2 && b<=4) System.out.println(c+"я");
        if (b>=5 ) System.out.println(c+"ей");
        if (b<1) System.out.println(c+"ей");

        */


    //Пытаюсь найти закроет отверстие или нет круглой картонкой
    /*public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
    System.out.println("Введите первую сторону отверстия");
    int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите вторую сторону отверстия");
    int b = Integer.parseInt(reader.readLine());;
        System.out.println("Введите Радиус");
    int r = Integer.parseInt(reader.readLine());;

    int d = r*r;
    int a1 = (int) Math.sqrt(d*d-b*b);
    int b1 = (int) Math.sqrt(d*d-a*a);

    if (d<Math.sqrt(a1*a1+b1*b1)) System.out.println("Не закроет");
    else System.out.println("Закроет");
      */


    // Ввод с клавиатуры
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader (System.in));
        String n = bufferedReader.readLine();
        System.out.println("Я буду зарабатывать $" + n + " в час");*/


        /*String name;
        String chislo;
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        chislo = scanner.next();
        System.out.println(name + " захватит мир через " + chislo + " лет. Му-ха-ха!");*/


        /* String name1;
        String name2;
        String name3;
        Scanner scanner = new Scanner(System.in);
        name1 = scanner.next();
        name2 = scanner.next();
        name3 = scanner.next();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

        */

    // Выводит на экран ввод переменной
        /*String a;
        int b;
        int c;
        System.out.println("Введите Имя");
        Scanner scanner = new Scanner(System.in);
        a = scanner.next();
        System.out.println("Введите число1");
        b = scanner.nextInt();
        System.out.println("Введите число2");
        c = scanner.nextInt();

        System.out.println(a + " получает " + b + " через " + c + " лет.");*/



        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);*/


