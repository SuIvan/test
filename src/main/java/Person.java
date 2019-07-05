import java.util.List;

/**
 * @author : ivan
 * @version : v1.00
 * @CreationDate : 2018/11/10 10:58
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see ：[相关类/方法]
 */
public class Person {
    private String name;
    List<String> string ;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getString() {
        return string;
    }

    public void setString(List<String> string) {
        this.string = string;
    }
}
