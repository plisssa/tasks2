import java.util.Arrays;
public class tasks2 {
    /**1*/
    public static String repeat(String s, int n){
        String result = "";
        for(char d : s.toCharArray()){//преобразует строку в массив символов. (временная переменная d принимает значение s)
            for(int j = 0; j < n; j++){
                result +=d;
            }
        }
        return result;
    }
    /**2*/
    public static int differenceMaxMin(int[] arr){ //из пакета java.util.Collections используем методы max и min. (массив arr)
        int max = arr[0];//инициализируем максимум, присваивается нулевое значение массива.
        int min = arr[0];//аналогично макс
        //конструкция foreach - используется для перебора элементов массива, списка т.д.
        for (int res : arr){ //цикл, в котором временная переменная в каждом витке цикла принимает значение элемента массива arr.
            if(res >= max) max = res;
            if(res <= min) min = res;
        }
        return max - min;
    }
    /**3*/
    public static boolean isAvgWhole(int[] arr){
        int sum = 0;
        for(int a : arr){//конструкция foreach - используется для перебора элементов массива, списка т.д.
            //временная переменная принимает значение элемента массива arr.
            sum += a;
        }
        double result = (double)sum/arr.length; //для дробных чисел используем тип double + делим сумму на длину массива
        return result == (int)result;//истина если равны и ложь если нет
    }
    //!
    /**4*/
    public static int[] cumulativeSum(int[] arr){
        int[] result = new int[arr.length]; //Создает объект типа int[] (целые числа): контейнер на длину массива типа int
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            result[i] = sum;
        }
        return result;
    }
    /**5*/
    public static int getDecimalPlaces(String s){
        int res = s.indexOf('.'); //indexOf() - найти в строке . и её индекс
        if (res == -1) return 0;
        return s.length() - res - 1; //длина строки без целой части и без точки
    }
    /**6*/
    public static int Fibonacci(int n){ // 1 1 2 3 5 8 13 21 34 55 89 144 233 377
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else  {
            return Fibonacci(n - 1) + Fibonacci(n - 2);//через рекурсию
        }
    }
    /**7*/
    public static boolean isValid(String s){
        if(s.length() != 5) return false;//проверка на длину строки
        return s.chars().allMatch(Character :: isDigit);//метод allMatch для проверки нецифровых цифр, регулярное выражение
        // Character.isDigit() возвращает значение true, если переданный символ цифра. , ссылка на метод (не статич)
    }
    /**8*/
    public static boolean isStrangePair(String first, String second){
        if(first.length() == 0 && second.length() == 0) return true;//странная пара
        return (first.charAt(0) == second.charAt(second.length() - 1)) && (second.charAt(0) == first.charAt(first.length() - 1));
        //charAt(index)-вытащить определенный символ в определенной строке
    }

    /**9*/
    public static boolean isPrefix(String s1, String s2){
        for(int i = 0; i < (s2.length() - 1); i++){
            if(s2.charAt(i) != s1.charAt(i)) return false;//сравниваем соответствующие символы (по индексу)
        }
        return true;
    }
    public static boolean isSuffix(String s1, String s2){
        int res = s1.length() - s2.length() + 1;
        for(int i = res; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i - res + 1)) return false;//сравниваем соответствующие символы (по индексу)
        }
        return true;
    }
    /**10*/
    public static int boxSeq(int s){//+3 or -1
        int res = 0;
        for(int i = 0; i < s; i++){
            if(i % 2 == 0) res += 3;//проверка шага на четное/нечетное
            else res -= 1;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println("Задача№1");
        System.out.println("repeat(\"mice\", 5) = " + repeat("mice", 5));
        System.out.println("repeat(\"hello\", 3) = " + repeat("hello", 3));
        System.out.println("repeat(\"stop\", 1) = " + repeat("stop", 1));

        System.out.println("Задача№2");
        System.out.println("differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) = " + differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println("differenceMaxMin([44, 32, 86, 19]) = " + differenceMaxMin(new int[]{44, 32, 86, 19}));

        System.out.println("Задача№3");
        System.out.println("isAvgWhole([1, 3]) = " + isAvgWhole(new int[]{1, 3}));
        System.out.println("isAvgWhole([1, 2, 3, 4]) = " + isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println("isAvgWhole([1, 5, 6]) = " + isAvgWhole(new int[]{1, 5, 6}));
        System.out.println("isAvgWhole([1, 1, 1]) = " + isAvgWhole(new int[]{1, 1, 1}));
        System.out.println("isAvgWhole([9, 2, 2, 5]) = " + isAvgWhole(new int[]{9, 2, 2, 5}));

        System.out.println("Задача№4");
        System.out.println("cumulativeSum([1, 2, 3]) = " + Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println("cumulativeSum([1, -2, 3]) = " + Arrays.toString(cumulativeSum(new int[]{1, -2, 3})));
        System.out.println("cumulativeSum([3, 3, -2, 408, 3, 3]) = " + Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})));

        System.out.println("Задача№5");
        System.out.println("getDecimalPlaces(\"43.20\") = " + getDecimalPlaces("43.20"));
        System.out.println("getDecimalPlaces(\"400\") = " + getDecimalPlaces("400"));
        System.out.println("getDecimalPlaces(\"3.1\") = " + getDecimalPlaces("3.1"));

        System.out.println("Задача№6");
        System.out.println("Fibonacci(3) = " + Fibonacci(3));
        System.out.println("Fibonacci(7) = " + Fibonacci(7));
        System.out.println("Fibonacci(12) = " + Fibonacci(12));

        System.out.println("Задача№7");
        System.out.println("isValid(\"59001\") = " + isValid("59001"));
        System.out.println("isValid(\"853a7\") = " + isValid("853a7"));
        System.out.println("isValid(\"732 32\") = " + isValid("732 32"));
        System.out.println("isValid(\"393939\") = " + isValid("393939"));

        System.out.println("Задача№8");
        System.out.println("isStrangePair(\"ratio\", \"orator\") = " + isStrangePair("ratio", "orator"));
        System.out.println("isStrangePair(\"sparkling\", \"groups\") = " + isStrangePair("sparkling", "groups"));
        System.out.println("isStrangePair(\"bush\", \"hubris\") = " + isStrangePair("bush", "hubris"));
        System.out.println("isStrangePair(\"\", \"\") = " + isStrangePair("", ""));

        System.out.println("Задача№9");
        System.out.println("isPrefix(\"automation\", \"auto-\") = " + isPrefix("automation", "auto-"));
        System.out.println("isPrefix(\"retrospect\", \"sub-\") = " + isPrefix("retrospect", "sub-"));
        System.out.println("isPrefix(\"vocation\", \"pre-\") = " + isPrefix("vocation", "pre-"));
        System.out.println("isSuffix(\"arachnophobia\", \"-phobia\") = " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("isSuffix(\"rhinoplasty\", \"-plasty\") = " + isSuffix("rhinoplasty", "-plasty"));
        System.out.println("isSuffix(\"movement\", \"-ment\") = " + isSuffix("movement", "-ment"));

        System.out.println("Задача№10");
        System.out.println("boxSeq(0) = " + boxSeq(0));
        System.out.println("boxSeq(1) = " + boxSeq(1));
        System.out.println("boxSeq(2) = " + boxSeq(2));

    }
}
