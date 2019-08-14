package com.jetictors.example.swagger.config;

import com.jetictors.example.swagger.property.SwaggerProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Desc           :  swagger配置类
 * Author         :  Jetictors
 * Time           :  2019/8/14 10:41
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    private SwaggerProperty property;

    private ApiInfo apiInfo(){

        Contact contact = new Contact(property.getContactName(), property.getContactUrl(), property.getContactEmail());

        return new ApiInfoBuilder().title(property.getTitle())
                .description(property.getDesc())
                .version(property.getVersion())
                .termsOfServiceUrl(property.getTermsOfServiceUrl())
                .license(property.getLicense())
                .licenseUrl(property.getLicenseUrl())
                .contact(contact)
                .build();
    }

    @Bean
    public Docket swaggerApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName(property.getGroupName())
                .directModelSubstitute(LocalDate.class, String.class).genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
//                .globalResponseMessage(RequestMethod.POST, customerResponseMessage())
//                .globalResponseMessage(RequestMethod.GET, customerResponseMessage())
                .forCodeGeneration(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage(property.getBasePackage()))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

//    private List<ResponseMessage> customerResponseMessage() {
//        List<ResponseMessage> list = new ArrayList<>();
//        list.add(new ResponseMessageBuilder().code(200).message("请求成功").build());
//        list.add(new ResponseMessageBuilder().code(201).message("资源创建成功").build());
//        list.add(new ResponseMessageBuilder().code(204).message("服务器成功处理了请求，但不需要返回任何实体内容").build());
//        list.add(new ResponseMessageBuilder().code(400).message("请求失败,具体查看返回业务状态码与对应消息").build());
//        list.add(new ResponseMessageBuilder().code(401).message("请求失败,未经过身份认证").build());
//        list.add(new ResponseMessageBuilder().code(405).message("请求方法不支持").build());
//        list.add(new ResponseMessageBuilder().code(415).message("请求媒体类型不支持").build());
//        list.add(new ResponseMessageBuilder().code(500).message("服务器遇到了一个未曾预料的状况,导致了它无法完成对请求的处理").build());
//        list.add(new ResponseMessageBuilder().code(503).message("服务器当前无法处理请求,这个状况是临时的，并且将在一段时间以后恢复").build());
//        return list;
//    }

}

