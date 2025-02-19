public class methodOverloading{
    double calculateSalary(double basic){
        return basic;
    }
    
    double calculateSalary(double basic, double da){
        return basic+da;
    }

    double calculateSalary(double basic, double da, double hra){
        return basic+da+hra;
    }
    public static void main(String[] args){
        methodOverloading sc=new methodOverloading();
        double basic=600000;
        double da=90000;
        double hra=7500;
        System.out.println("Salary with basic only:" +sc.calculateSalary(basic));
        System.out.println("Salary with basic and da:" +sc.calculateSalary(basic,da));
        System.out.println("Salary with basic, da and hra:" +sc.calculateSalary(basic,da,hra));
     }
}


    

