public class TestaBanco {
    public static void main (String[] args){
        
        AcessaBanco João = new AcessaBanco();
        João.setLogin("joaomecat");
        
        João.setCon(true);
        
        System.out.println(João.getLogin());
        
        if(João.getCon() == true){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
