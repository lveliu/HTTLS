package httl.engine;

import httl.Engine;
import httl.Template;
import org.junit.Test;

import java.io.IOError;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by Administrator on 2015/5/19.
 */
public class TestEngine {

    @Test
    public void testOne() throws IOException,ParseException{
        Engine engine = Engine.getEngine();
        Template template = engine.getTemplate("/templates/smoking.html");
        System.out.print(template);
    }

}
