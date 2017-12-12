import com.usst.mapper.CargoMapper;
import com.usst.pojo.Cargo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by 包杨 on 2017/11/13.
 */
public class TestOne {

    public static void main(String[] args) throws Exception {
        // 读取mybatis-config.xml文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 初始化mybatis，创建SqlSessionFactory类的实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建Session实例
        SqlSession session = sqlSessionFactory.openSession();
//       PersonMapper pm=session.getMapper(PersonMapper.class);
//        Person person=pm.ById(1)
//        System.out.println(person);
//        System.out.println(person.getCar());
//        session.commit();
//        session.close();

       CargoMapper cargomapper= session.getMapper(CargoMapper.class);

       Cargo cargo=cargomapper.ById(1);
       System.out.println(cargo.getName());
        session.commit();
        session.close();

    }
}
