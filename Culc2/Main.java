package command.Culc2;

import java.util.ArrayList;

import command.Culc2.mods.Plus.*;

public class Main {

    
    // mods
    PLus plus = new PLus();
    


    public void execute_command(String command){
        String[] args = command.split(" ", 2);
        ArrayList<String> exe;
        String comm = "";

        for(char argg : args[1].toCharArray()){
            String arg = String.valueOf(argg);
            if(arg != "[" || arg != "]" || arg != "," || arg != " "){
                comm += arg;
                // exe.add(arg);
            }else if(arg != "[" || arg != "]"){
                exe.add(comm);
                comm = "";
            }else{
                for(String Command_mod : exe){
                    String[] mod = Command_mod.split("{");
                    String exe_mod = mod[0];
                    String us;
                    for(char exe_moD : mod[1].toCharArray()){ if(String.valueOf(exe_moD) != "}"){ us += String.valueOf(exe_moD);}}
                    if(exe_mod == "plus"){plus.execute(us);}



                    
                    
                }
            }
        }
    }
}
