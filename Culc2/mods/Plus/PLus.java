package command.Culc2.mods.Plus;

public class PLus {
    public void execute(String args){
        String[] numbers = args.split(",");
        int sum = 0;

        for(String arg : numbers){
            sum += Integer.parseInt(arg);
        }
        // return sum;
        System.out.println(sum);

    }
}
