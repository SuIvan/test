import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author : ivan
 * @version : v1.00
 * @CreationDate : 2018/11/10 10:58
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see ：[相关类/方法]
 */
public class Test {


  public static void main(String[] args){
      String condition = StringUtils.substringBefore(entity.getApplyCondition(),"=");
      for (Map.Entry<String, String> entry : workFlowStartViewEntity.getApplyCertificateParams().entrySet()){
          if (entry.getKey().equals(condition) && condition.contains(entry.getValue())){
              processDefinityKey =entity.getProcessDefiniteKey();
          }
      }
  }


    private void newfunction(){
      System.out.println("new function");
    }

    private void test1(){
      System.out.println("this is for test push function");
    }

    private void test2(){
      System.out.println("this is test for dev branch");
    }
}
