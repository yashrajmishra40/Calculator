package calculator;

public static class Calculator{
    public static int addititon(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if(b == 0) return 0;
        return a / b;
    }

    public static void main(String[] args) {
        int result = 0;
        int a = 4, b = 7;

        while (true){
            switch (condition) {
                case "add"{
                    result = addititon(a,b);
                }

                case "sub"{
                    result = subtraction(a,b);
                }

                case "div"{
                    result = division(a,b);
                }

                case "mul" {
                    result = multiplication(a,b);
                }

                case "exit" {
                    break;
                }
            }

        }
    }
}


