package com.course.lessons;

import javax.swing.*;
import java.util.Arrays;

public class HomeWorkLesson4 {
    public static void main(String[] args) {

        //С помощью цикла foreach вывести в консоль цифры больше 0

        int[] nums = {-1, 2, 0, 5, -7, 6};

        for (int i : nums) {
            if (i > 0) {
                System.out.println(nums[i]);
            }
        }

        // С помощью цикла for со счетчиком вывести в консоль цифри меньше 0

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                System.out.println(nums[i]);
            }

        }


        //С помощью цикла for со счетчиком заменить отрицательные числа в масиве на 0
        int[] nums = {-1, 2, 0, 5, -7, 6};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
            System.out.println("array without negative values:" + nums[i]);
            ;
        }
    }

    //С помощью цикла for со счетчиком вывести в консоль сумму всех цифер
    int[] nums = {-1, 2, 0, 5, -7, 6};
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        sum = sum + nums[i];
    }
        System.out.println("sum:"+ sum);
    }







