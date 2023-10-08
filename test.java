public class test {
    public static void main(String[] args) {
        livre l1=new livre("ali","fOlen","java",100,12,0);
        livre l2=new livre();
        System.out.println("id="+ l1.id+" nom: "+ l1.nom+" preNom: "+ l1.preNom+" titre: "+ l1.titre+" prix: "+ l1.priX);
        System.out.println("nombre des livre :"+livre.cont);
    }
}
