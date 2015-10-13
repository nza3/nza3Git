public class tests {

   public static void main(String[] args) {

int a =22;
int b;
int c;
if (a % 2 != 0)
{
    b = a * 2 - 6;
    if (a == b)
        c = a + b;
    else if (a < b)
        c = b - a;
         else
        c = 25;
} else if (a < 6) {
    b = 3 * a;
    c = b / 2;
} else if (a > 20) {
    c = 5;
    b = a - 3;
    
    if ((b > c) && (b < c)) {
        a = 2 * c - 1;
    } else if ((b > c) || (b < c)) {
        a = 3 - b;
    } else {
        a = b / c;
    }
}
else
{
    c = 6 * a;
    b = a + c;
}

System.out.println(a);
System.out.println(b);
System.out.println(c);
   }

}