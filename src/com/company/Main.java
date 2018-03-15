package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {
    private int mas[] = new int[11];

    //заполнение массива случайными числами
    private void mas_create() {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
    }

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

    //quick sort
    /*private void QuickSort(){
        int a=
        for(int i=mas.length-1; i>0; i--){
            for(int j=0; j<i; j++) {
                if (mas[j] > mas[5]) {
                    int tmp = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = tmp;
                }
            }
        }
    }*/

    public class QuickSort {

        public static void quickSort(int[] array, int low, int high) {
            if (array.length == 0)
                return;//завершить выполнение если длина массива равна 0

            if (low >= high)
                return;//завершить выполнение если уже нечего делить

            // выбрать опорный элемент
            int middle = low + (high - low) / 2;
            int opora = array[middle];

            // разделить на подмассивы, который больше и меньше опорного элемента
            int i = low, j = high;
            while (i <= j) {
                while (array[i] < opora) {
                    i++;
                }

                while (array[j] > opora) {
                    j--;
                }

                if (i <= j) {//меняем местами
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            // вызов рекурсии для сортировки левой и правой части
            if (low < j)
                quickSort(array, low, j);

            if (high > i)
                quickSort(array, i, high);
        }


        public static void main (String[]args){
            Main a=new Main();

            a.mas_create();
            a.ShowMas();
            a.sum_mas();
            a.max_mas();
            a.min_mas();
            a.SortMas();
            System.out.println("Отсортированный массив по возрастанию: ");
            a.ShowMas();
            a.QuickSort();
            System.out.println("Отсортированный массив по QuickSort: ");
            a.ShowMas();
        }
    }
