package CoreJava.day16basics;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a,b) -> a+b;

        System.out.println(add.calculate(3,5));

        Calculator add1 = (a,b) -> MathOperations.addition(a,b);

        System.out.println(add1.calculate(3,9));

        Calculator addMR = MathOperations::addition;
        System.out.println(addMR.calculate(19, 21));


        Calculate1 mult = (a,b) -> {
            return MathOperations.multiply(a,b);
        };
        System.out.println(mult.multiplication(4,5));

        Calculate1 multMR = MathOperations::multiply;
        System.out.println(multMR.multiplication(6,7));

        // Validate isPos = (num) -> {
        //     return num > 0;
        // };
        // System.out.println(isPos.validate(5));

        MathOperations mathOps = new MathOperations();
        Validate isPosLam = (num) -> {
            return mathOps.isPositive(num);
        }; 
        System.out.println(isPosLam.validate(-3));

        Validate isPosMR = mathOps::isPositive;
        System.out.println(isPosMR.validate(10));


        StringOperations len = (str) -> str.length();
        System.out.println(len.operate("Himanshu")); 

        StringOperations lenMR = String::length;
        System.out.println(lenMR.operate("Tech"));

        StringOperations hash = (str) -> str.hashCode();

        StringOperations hashMr = String::hashCode;
        System.out.println(hash.operate("Himanshu"));
        System.out.println(hashMr.operate("Himanshu"));


        Creator<User> c1 = (user) -> {
            return new User(user);
        };

        User u = c1.create("Himamshu");
        System.out.println(u.getName());

        Creator<User> c2 = User::new;
        User u2 = c2.create("SHENU");
        System.out.println(u2.getName());


        Creator<Product> c3 = Product::new;
        Product p = c3.create("Laptop");
        System.out.println(p.getName());

    }
}
