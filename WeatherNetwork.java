public class WeatherNetwork {
    public static void main(String[] args) {
        int temp=-12;
        //String forecast;
        if(temp<=-1)
        {
            System.out.println("The forecast is freezing! stay home!");
        }
        else if(temp<=10)
        {
            System.out.println("The forecast is Chilly! wear a coat!");
        }
        else
        {
            System.out.println("It's warm. Go outside");
        }
    }
}
