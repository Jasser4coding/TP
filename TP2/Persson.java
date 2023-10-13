public class Persson {
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
        Persson p1=new Persson();
        p1.setname("jasser");
        p1.setFirstName("jlassi");
        p1.datenaiss(12,2,2001);
        System.out.println(p1.AgeEn2023());
    }

}
