import com.usst.service.ProduceH5.ProducerForCostumer;

/**
 * Created by 包杨 on 2017/12/5.
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        ProducerForCostumer pfc=new ProducerForCostumer();
        String html=pfc.ProTable();
        System.out.println(html);
    }
}
