package lab0;

import java.util.List;

/**
 * Created by chenglongwei on 2/18/16.
 */
public interface Greeter {
    // names of the authors
    void setNames(List<String> names);

    String getGreeting();
}
