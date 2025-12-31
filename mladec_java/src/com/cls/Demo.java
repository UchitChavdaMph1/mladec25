package com.cls;

class Demo {
    static void show() {
        System.out.println("Static Method");
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
        
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length); 
    }
}