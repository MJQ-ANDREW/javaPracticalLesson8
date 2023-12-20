package mirea.javaLessons.practical8;

public class Main {
    public static void main(String[] args) {
        //TriangularSequence(4, 1, 1);
        //FromAToB(3, 6);
        //FromAToB(8, 2);
        //SumOfDigits(12345, 0);
        //Digits(123456789);
    }

    public static void TriangularSequence(int maxVal, int tekVal, int kolvoTek){
        if(tekVal == maxVal && kolvoTek == tekVal){
            System.out.print(tekVal);
            return;
        }
        else if(kolvoTek == tekVal){
            System.out.print(tekVal + " ");
            TriangularSequence(maxVal, tekVal + 1, 1);
        }
        else{
            System.out.print(tekVal + " ");
            TriangularSequence(maxVal, tekVal, kolvoTek + 1);
        }
    }

    public static void FromAToB(int a, int b){
        if(a < b){
            System.out.print(a + " ");
            FromAToB(a + 1, b);
        }
        else if (a > b){
            System.out.print(a + " ");
            FromAToB(a - 1, b);
        }
        else{
            System.out.print(a);
            return;
        }
    }

    public static void SumOfDigits(int n, int sum){
        if(n > 10){
            sum += n % 10;
            SumOfDigits(n / 10, sum);
        }
        else{
            System.out.println(sum + n);
            return;
        }
    }

    public static void Digits(int n){
        if(n > 10){
            System.out.print(n % 10 + " ");
            Digits(n / 10);
        }
        else{
            System.out.println(n);
            return;
        }
    }
}
