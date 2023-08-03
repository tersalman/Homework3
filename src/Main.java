public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte small = 1;
        short catBox = 30000;
        int big = 200000;
        long veryBig = 40000000L;
        float carrot = 2.3f;
        double orange = 5.7867905876;
        System.out.println("Значение переменной small с типом byte равно " + small);
        System.out.println("Значение переменной catBox с типом short равно " + catBox);
        System.out.println("Значение переменной big с типом int равно " + big);
        System.out.println("Значение переменной veryBig с типом long равно " + veryBig);
        System.out.println("Значение переменной carrot с типом float равно " + carrot);
        System.out.println("Значение переменной orange с типом double равно " + orange);


    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a1 = 27.12f;
        long a2 = 987678965549L;
        float a3 = 2.786f;
        short a4 = 569;
        short a5 = -159;
        short a6 = 27897;
        byte a7 = 67;

    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        byte allStudents =(byte) (ludmila + anna + ekaterina) ;
        short sheets = 480;
        short studentWorksheet = (short) (sheets / allStudents);
        System.out.println("На каждого ученика рассчитано " + studentWorksheet + " листов бумаги");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte bottleCreaterMachineIn1Min = 8;
        byte twentyMin = 20;
        short oneDay = 1440;
        int threeDays = oneDay * 3;
        int oneMonth = threeDays * 10;
        short bottlesIn20Min = (short) (bottleCreaterMachineIn1Min * twentyMin);
        int bottlesOneDay = bottleCreaterMachineIn1Min * oneDay;
        int bottlesInThreeDays = bottleCreaterMachineIn1Min * threeDays;
        int bottlesInMonth = bottleCreaterMachineIn1Min * oneMonth;
        System.out.println("За 20min машина произвела " + bottlesIn20Min + " штук бутылок.");
        System.out.println("За один день машина произвела " + bottlesOneDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesInThreeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок.");

    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte colorCan = 120;
        byte neededWhiteCans = 2;
        byte neededBrownCans = 4;
        byte cansForOneClass = (byte) (neededWhiteCans + neededBrownCans);
        byte numberOfClasses = (byte) (colorCan / cansForOneClass);
        byte havingWhiteColorCans = (byte) (numberOfClasses * neededWhiteCans);
        byte havingBrownColorCans = (byte) (numberOfClasses * neededBrownCans);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + havingWhiteColorCans + " банок белой краски и " + havingBrownColorCans + " банок коричневой краски.");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 80;
        byte milk100Ml = 105;
        byte iceCream = 100;
        byte egg = 70;
        short needsBnanas = (short) (banana * 5);
        short needsMilk = (short) (milk100Ml * 2);
        short needsIceCream = (short) (iceCream * 2);
        short needsEggs = (short) (egg * 4);
        float allInGramms = needsMilk + needsBnanas +needsEggs + needsIceCream;
        float allInKg =  allInGramms / 1000f;
        System.out.println("Коктейль в граммах будет весить " + allInGramms + "г, а в килограммах будет " + allInKg + "кг.");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int needGrToLost = 7000;
        short firstWayToLost = 250;
        short secondWayToLost = 500;
        int firstResult = needGrToLost / firstWayToLost;
        int secResult = needGrToLost / secondWayToLost;
        int averageDays = (firstResult + secResult) / 2;
        System.out.println("первый результат "+ firstResult + " дней, " + "второй результат "+ secResult + " дней, "+ "а среднее значение будет " + averageDays + " дней.");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int krisSalary = 76230;
        float yearsProcent = 0.10f;
        float mSalaryProcent = mashaSalary * yearsProcent;
        float dSalaryProcent = denisSalary * yearsProcent;
        float kSalaryProcent = krisSalary * yearsProcent;
        float mSalaryAfterGrowUp = mashaSalary + mSalaryProcent;
        float dSalaryAfterGrowUp = denisSalary + dSalaryProcent;
        float kSalaryAfterGrowUp = krisSalary + kSalaryProcent;
        float mYearsSalary = mashaSalary * 12;
        float dYearsSalary = denisSalary * 12;
        float kYearsSalary = krisSalary * 12;
        float mYearsSalaryAfterGrowUP = mSalaryAfterGrowUp * 12;
        float dYearsSalaryAfterGrowUP = dSalaryAfterGrowUp * 12;
        float kYearsSalaryAfterGrowUP = kSalaryAfterGrowUp * 12;
        float mYearsDiff = mYearsSalaryAfterGrowUP - mYearsSalary;
        float dYearsDiff = dYearsSalaryAfterGrowUP - dYearsSalary;
        float kYearsDiff = kYearsSalaryAfterGrowUP - kYearsSalary;
        System.out.println("Маша теперь получает " + mSalaryAfterGrowUp + "рублей. Годовой доход вырос на " + mYearsDiff);
        System.out.println("Денис теперь получает " + dSalaryAfterGrowUp + "рублей. Годовой доход вырос на " + dYearsDiff);
        System.out.println("Кристина теперь получает " + kSalaryAfterGrowUp + "рублей. Годовой доход вырос на " + kYearsDiff);





    }

}
