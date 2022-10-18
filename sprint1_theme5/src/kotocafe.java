public class kotocafe {

    public static void main(String[] args) {


        Kotiki vasya = new Kotiki("Vasya", 26, "black");
        System.out.println(vasya.name + " " + vasya.color);
        vasya.sayHello(); // без static
        Kotiki.sayHi(); // со static
    }
}
