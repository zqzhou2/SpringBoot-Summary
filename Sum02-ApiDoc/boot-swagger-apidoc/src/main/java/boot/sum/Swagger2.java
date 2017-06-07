package boot.sum;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by zqzhou2 on 2017/6/7.
 */

/**
 * Swagger2配置类
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    /**
     * select().apis()来控制哪些接口被展示（除了被@ApiIgnore指定的请求）
     * @return
     */
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("boot.sum.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建api基本信息
     * @return
     */
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful API Doc")
                .description("本示例参考现有Spring Boot相关技术博客")
                .termsOfServiceUrl("https://github.com/zqzhou2")
                .contact("zqzhou")
                .version("1.0")
                .build();
    }
}
