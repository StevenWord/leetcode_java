package com.company;

import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

public  class test1{

    int N;
    private  Stack<Integer> StackData;
    private  Stack<Integer> StackMin;


    void  test1(){
        this.StackData= new Stack<Integer>();
        this.StackMin=new Stack<Integer>();
    }


    public void push(int x) {
        if(this.StackMin.isEmpty()){
            this.StackData.push(x);
            this.StackMin.push(x);
        }
        else if(x<=this.getMin()){
            this.StackData.push(x);
            this.StackMin.push(x);
        }
        else{
            this. StackData.push(x);
        }
    }

    public void pop() {
        if(this.StackData.isEmpty()){
            throw new  RuntimeException("超时");
        }
        else if(this.StackData.peek()==this.getMin()){
            this.StackData.pop();
            this.StackMin.pop();
            System.out.println("1");
        }
        else {this.StackData.pop();}
    }

    public int getMin() {
        if(this.StackMin.isEmpty()){
            throw new  RuntimeException("超时");}
        else{
            return this.StackMin.peek();
        }
    }
 /*public static void main(String[] args){
        Main a=new Main();
        Scanner scanner=new Scanner(System.in);
        // int n = scanner.nextInt();
        int n = Integer.valueOf(scanner.nextLine());
         String string;
            for (int i = 0; i < n; i++) {
                string = scanner.nextLine();
                System.out.println(string);
               // if (string.equals("pop")) {
                if("pop".equals(string)){
                a.pop();
                } else if (string.equals("getMin")) {
                    System.out.println(a.getMin());
                } else {
                	//String[] tmpstr = string.split(" ");
                	//	                Integer integer = Integer.parseInt(tmpstr[tmpstr.length-1]);
                	//	                a.push(integer);
                	a.push(Integer.valueOf(string.split(" ")[1]));
                }
            }
     }*/

    public static void main(String [] args){
        test1 a=new test1();
        a.test1();
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String strs ;
        for(int i=0;i<n;i++){
            strs = sc.nextLine();
            if("pop".equals(strs)){
                a.pop();
            }else if("getMin".equals(strs)){
                System.out.println(a.getMin());
            }else{System.out.println(strs.split(" ")[1]);
                a.push(Integer.valueOf(strs.split(" ")[1]));

            }
        }

    }
}
