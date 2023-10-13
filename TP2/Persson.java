public class Person {
    String name;
    String Firstname;
    int daynaiss;
    int monthnaiss;
    int yearnaiss;

    void setname(String name){
        this.name=name;
    }
    void setFirstName(String Firstname){
        this.Firstname=Firstname;
    }
    void datenaiss(int dd , int mm , int yy){
        this.daynaiss=dd;
        this.monthnaiss=mm;
        this.yearnaiss=yy;

    }
    int AgeEn2023(){
        return (2023-yearnaiss);

    }
    public static void main(String[] args){
        Person p1=new Person();
        p1.setname("jasser");
        p1.setFirstName("jlassi");
        p1.datenaiss(5,1,2004);

        System.out.println("name : "+p1.name);
        System.out.println("name : "+p1.Firstname);
        System.out.println("date de naissance : "+p1.daynaiss+"/"+p1.monthnaiss+"/"+p1.yearnaiss);
        System.out.println("age : "+p1.AgeEn2023());
    }

}
