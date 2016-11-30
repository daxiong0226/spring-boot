package cn.dx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by IntelliJ IDEA.
 * User: Liu Xiongwei
 * Date: 2016-11-30
 * Time: 14:26
 * Description:
 * To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
@EnableTransactionManagement
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
