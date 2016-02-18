package lab0;

import java.util.List;

/**
 * Created by chenglongwei on 2/18/16.
 */
public class Greeting implements Greeter {
    private List<String> names;
    @Override
    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String getGreeting() {
        return names.get(0);
    }
}
