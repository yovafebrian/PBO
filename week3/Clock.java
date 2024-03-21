package week3;

public class Clock {
    public static void main(String[] args) {
       
      ClockDisplay waktu = new ClockDisplay(29,59);
      waktu.timeTick();
       System.out.println("jam sekarang " + waktu.getTime());

    }
}