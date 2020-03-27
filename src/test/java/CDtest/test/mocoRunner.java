package CDtest.test;

import com.github.dreamhead.moco.HttpServer;
import com.github.dreamhead.moco.Runner;
import org.hamcrest.Matcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeClass;

import static com.github.dreamhead.moco.Moco.httpServer;
import static com.github.dreamhead.moco.Runner.runner;
import static org.hamcrest.CoreMatchers.is;


public class mocoRunner {

    private Runner runner;


    @BeforeClass
    public void setup(){
        HttpServer httpServer = httpServer(12306);
        httpServer.response("foo");
    }

}
