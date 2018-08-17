
/** 
 * Java Level 2 Lesson 2 Homework
 * 
 * @author Kuzmenko Anastasiya 
 * @version 2018-08-17
 * */


class HW1Lesson2{

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 *  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
    static void convertArray(){
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i : array){
            if(i == 0) i = 1;
            else i = 0;
        System.out.print(i + " ");
        }
    }

/**
 * 2. Задать пустой целочисленный массив размером 8. 
 * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
 */
    static void fillArray(){
        int[] array = new int[8];
        for(int i = 0; i < array.length; i++){
            array[i] = i*3;
            System.out.print(array[i] + " ");
        }
    }

/**
 *3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, 
 * и числа меньшие 6 умножить на 2; 
*/
    static void changeArray(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i : array){
            if(i < 6) i *= 2;
            System.out.print(i + " ");
        }
    }
    
/**
 * Создать квадратный двумерный целочисленный массив (количество строк 
 * и столбцов одинаковое), и с помощью цикла(-ов) заполнить 
 * его диагональные элементы единицами;
 * */
    static void fillDiagonal(){
        int array[][] = new int [4][4];
        for (int i = 0; i < array.length; i++){
            array[i][array.length-i-1] = 1;
            array[i][i] = 1;
        }
        for(int i : array[0]){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : array[1]){
            System.out.print(i + " ");
        }
        
        System.out.println();
        for(int i : array[2]){
            System.out.print(i + " ");
        }
        
        System.out.println();
        for(int i : array[3]){
            System.out.print(i + " ");
        }
    }

/**
 * 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы 
 * (без помощи интернета);
 * */
    static void findMinMax(){
        int[] array = {1, 5, 3, 200, 11, 4, 5, 2, 4, 8, 9, 10};
        int min = array[0];
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max) max = array[i];
            if(array[i] < min) min = array[i];
        }
        System.out.println("MIN = " + min + " MAX = " + max );
    }

/**
 * 6. Написать метод, в который передается не пустой одномерный 
 * целочисленный массив, метод должен вернуть true если в массиве 
 * есть место, в котором сумма левой и правой части массива равны.
*/
    static void divideArray(int[] array){
        int sumi = 0, sumj = 0;
        boolean answer = false;
        for(int i = 0, j = array.length-1; i < array.length && j != 0; i++, j--){
            sumi += array[i];
            sumj += array[j];
            if(sumi ==  sumj) answer = true;
        }
        System.out.println(answer);
    }

    public static void main(String[] args){
      
        System.out.println("Результат выполнения метода convertArray():");
        convertArray();
        System.out.println();
        
        System.out.println("Результат выполнения метода fillArray():");
        fillArray();
        System.out.println();
        
        System.out.println("Результат выполнения метода changeArray():");
        changeArray();
        System.out.println();
        
        System.out.println("Результат выполнения метода fillDiagonal(): ");
        fillDiagonal();
        System.out.println(); 
        
        System.out.println("Результат выполнения метода findMinMax():");
        findMinMax();
        
        System.out.println("Результат выполнения метода divideArray():");
        divideArray(new int[] {1, 1, 1, 1, 2, 1});



    }
}
