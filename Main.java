package com.company;
import java.awt.*;
import java.util.*;

public class Main {



    public static void main(String[] args) {


//        System.out.println(pow());
//        divBy2And3();
//        System.out.println(stringStuff());
//        System.out.println(salaryStuff());
//        System.out.println(sumNum());
//        System.out.println(sameNumbers());
//        join([0.7, 0.7], [0.3, 0.4]);
        }
        // תרגיל 1
        public static void divBy2And3(){

            for (int i = 0; i < 1000; i++) {
                if (i % 2 == 0 && i % 3 == 0){
                    continue;
                }
                if (i % 2 == 0 || i % 3 == 0){
                    System.out.println(i);
                }
            }
        }


        // תרגיל 2
        public static int pow(){
            Scanner s = new Scanner(System.in);
            int a, b;
            System.out.println("enter the first number");
            a = s.nextInt();
            System.out.println("enter the second number");
            b = s.nextInt();
            s.close();
            System.out.println("ur number is:");
            return (int) Math.pow(a, b);

        }


        // תרגיל 3
        public static String stringStuff(){
            int cnt = 1;
            Scanner s = new Scanner(System.in);
            System.out.println("type in stuff");
            String a = s.nextLine();
            s.close();
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' '){
                    cnt++;
                }
            }
            return ("you have " + cnt + " words");
        }


        // תרגיל 4
        public static int salaryStuff(){

            int afterTax = 0;
            Scanner s = new Scanner(System.in);
            System.out.println("type in ur salary");
            int salary = s.nextInt();
            if (salary <= 6290){
                afterTax = salary - (salary / 10);
            }
            if (salary >= 6291 && salary <=9030){
                afterTax = salary - (salary / 100) * 14;
            }
            if (salary >= 9031 && salary <= 14490){
                afterTax = salary - (salary / 100) * 20;
            }
            if (salary >= 14491 && salary <= 20140){
                afterTax = salary - (salary / 100) * 31;
            }
            if (salary >= 20141 && salary <= 41910){
                afterTax = salary - (salary / 100) * 35;
            }
            if (salary >= 41911 && salary <= 53970){
                afterTax = salary - (salary / 100) * 47;
            }
            if (salary >= 53971){
                afterTax = salary - (salary / 100) * 50;
            }

            System.out.println("ur salary after tax is:");
            return afterTax;
        }


        // תרגיל 5
        public static int sumNum(){
            int arr[] = new int[0],sum = 0;
            for (int a = 0; a < arr.length; a++) {
                sum += a;
            }
            return sum;
        }


        //תרגיל 6
        public static int sameNumbers(){

            int arr[] = new int[0],cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == arr[i]){
                        cnt++;
                    }
                }
            }
            return cnt;
        }

        //תרגיל 7
        public static void join(Point a[], Point b[]){
            int one, cnt = 0;
            one = a.length + b.length;
            Point c[] = new Point[one];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
                cnt++;
            }
            for (int i = one - a.length; i < one; i++) {
                c[cnt++] = b[i];
            }
        }

    // תרגיל  8
    public static void sharpestSlope(Point[] x){
        Point a = x[0];
        Point b = x[0];
        double sharpest = x[0].slope(x[1]);
        for (Point t:x) {
            for (int i = 0; i < x.length; i++){
                if (t.slope(x[i])>= sharpest){
                    a = t;
                    b = x[i];
                }
            }
        }
        System.out.println("x1 is "+ a.x + " y1 is "+ a.y+" x2 is "+b.x+" y2 is "+b.y);
    }

    // תרגיל  9
    public static ArrayList<Date> sortDates(Date[] dates){
        ArrayList<Date> list = new ArrayList<Date>();
        Collections.addAll(list, dates);
        list.sort(new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {return o1.dateInDays().compareTo(o2.dateInDays());}
        });
        return list;
    }
    // תרגיל 10
    public static ArrayList<Date> Averageearly(ArrayList<ArrayList<Date>> listOfDateLists){
        boolean first = true;
        int smallest = 0;
        int total = 0;
        ArrayList<Date> earliest = listOfDateLists.get(0);
        for (ArrayList<Date> dateList:listOfDateLists) {
            for (Date d:dateList) {
                total += (int) d.dateInDays();
            }
            if(total/dateList.size()<smallest || first){
                smallest = total/dateList.size();
                earliest = dateList;
                first = false;
            }
            total=0;
        }
        return earliest;
    }
}