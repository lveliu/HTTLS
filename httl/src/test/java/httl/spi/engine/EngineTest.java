package httl.spi.engine;

import com.alibaba.fastjson.JSON;
import httl.Engine;
import httl.Template;
import httl.test.model.Book;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/8/6.
 */
public class EngineTest {

    @Test
    public void engineTest() {
        Engine engine = Engine.getEngine();
        for (int i= 0; i < 10000;i++) {
            try {
                List<Book> books = new ArrayList<Book>();
                Book book = new Book();
                book.setTitle("hahah");
                books.add(book);
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("books", books);
                Template template = engine.parseTemplate(engine.getTemplate("smoking.httl").getSource());
                //System.out.print(template.toString());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

}
