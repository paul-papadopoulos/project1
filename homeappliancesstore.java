public class homeappliancesstore {
    static String compname;
    static String compadress;
    static int    emp;

    public static void main(String[] args) {

        gs item1 = new gs();
        item1.setCompname(args[0]);
        item1.setCompadress (args[1]);
        item1.setEmp (Integer.parseInt(args[2]));


        compname = args[0];
        compadress = args[1];
        emp =Integer.parseInt(args[2]);

        if(compname == null ) {
            System.out.println("compname error");
        }

        if(compadress == null ) {
            System.out.println("compadress error");
        }

        System.out.println("compname = " + compname + '\n'
                + "compadress = " + compadress + '\n'
                + "emp = " + emp);


        System.out.println("gs compname = " + item1.getCompname() + '\n'
                + "gs compadress = " + item1.getCompadress() + '\n'
                + "gs emp = " + item1.getEmp());


    }

}