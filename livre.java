import com.sun.jdi.PathSearchingVirtualMachine;
import jdk.dynalink.beans.StaticClass;

import java.security.PublicKey;
import java.util.Scanner;

public class livre {
    String nom,preNom,titre;
    int id;
    static int cont;
    float priX;
public livre(String no,String pr,String t,int i,float p,static int cont){

    this.nom=no;
    this.preNom=pr;
    this.titre=t;
    this.id=i;
    this.priX=p;
    cont++;


    }
    public livre(){}
        public static void main(String[] args) {
            livre l1=new livre("ali","fOlen","java",100,12,0);
            livre l2=new livre();
            l1.affiche();
            System.out.println("nombre livre :"+livre.cont);


    }


    public void affiche(){
        System.out.println("id="+ this.id+" nom: "+this.nom+" preNom: "+this.preNom+" titre: "+ this.titre+" prix: "+this.priX);

    }
}
