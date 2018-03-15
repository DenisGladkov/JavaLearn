package com.company;

public class Main {
    //private static int mas[] = new int[11];
    private static int mas[]={3, 6,9,56,78,25,1,0,3,7};
    //заполнение массива случайными числами
    /*private void mas_create() {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
    }*/

    //вывод массива
    private void ShowMas(){
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Элемент [" + (i + 1) + "]: " + mas[i]);
        }
    }

    //сумма элементов массива
    private void sum_mas() {
        int sum = 0;
        for (int i=0; i<mas.length; i++){
            sum += mas[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    //максимамальный элемент массива
    private void max_mas(){
        int max=mas[0];
        for(int i=0; i<mas.length; i++){
            if (mas[i]>max){
                max=mas[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
    }

    //минимальный элемент массива
    private void min_mas(){
        int min=mas[0];
        for(int i=0; i<mas.length; i++){
            if (mas[i]<min){
                min=mas[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
    }

    //sort up
    private void SortMas(){
        for(int i=mas.length-1; i>0; i--){
            for(int j=0; j<i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
    }

    //Quick Sort
    private void QuickSort(int[] mas, int start, int end) {
        int i = start;
        int j = end;
        int opora = mas[start + (end - start) / 2];
        do {
            while (mas[i] < opora) ++i;
            while (mas[j] > opora) --j;
            if (i <= j) {
                int tmp = mas[i];
                mas[i] = mas[j];
                mas[j] = tmp;
                i++;
                j--;
            }
        } while (i <= j);

        if (start < j) QuickSort(mas, start, j);
        if (i < end) QuickSort(mas, i, end);
    }


        public static void main (String[]args){
            Main a=new Main();
            int start = 0;
            int end = mas.length - 1;

            //a.mas_create();
            a.ShowMas();
            a.sum_mas();
            a.max_mas();
            a.min_mas();
            //a.SortMas();
            //System.out.println("Отсортированный массив по возрастанию: ");
            a.ShowMas();

            System.out.println("Отсортированный массив по QuickSort: ");
            a.QuickSort(mas, start, end);
            a.ShowMas();
        }
    }
