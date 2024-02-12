import rars.AssemblyException;
import rars.SimulationException;
import rars.api.Options;
import rars.api.Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RARSInterface
{

    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }

        Options op = new Options();
        op.startAtMain = true;
        op.maxSteps = 1000000;

        Program p = new Program(op);

        try {
            p.assembleString(sb.toString());
        } catch (AssemblyException ae){
            throw new RuntimeException(ae);
        }

        p.setup(null, "");
        // Potentially set memory or registers here
        try {
            System.out.println(p.simulate());
        } catch (SimulationException se){
            throw new RuntimeException(se);
        }
        // check any final register or memory state
        System.out.println(p.getRegisterValue("a0"));

    }

}
