class person
{
    public static void main(String[] args) {
        String fname=args[0];
        String lname=args[1];
        float wt=Float.parseFloat(args[2]);
        float ht=Float.parseFloat(args[3]);
        float BMI=wt/(ht*ht);
        System.out.println("Fname="+fname+"\nLname="+lname+"\nWeight="+wt+"\nHeight="+ht+"\nBMI="+BMI);
    }
}