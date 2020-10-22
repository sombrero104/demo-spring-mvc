package me.sombrero.demospringmvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Configuration + implements WebMvcConfigurer
 * 스프링부트에서 제공하는 스프링MVC 기존 설정 그대로 유지하면서 추가만 하는 것.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 포매터를 등록하기 위해 이곳에서 설정을 해도 되긴하지만,
     * 스프링부트를 사용할 때에는 빈으로만 등록을 해도 된다.
     * (WebMvcAutoConfiguration에서 BeanFactory 타입의 빈들을 읽어서 등록해주기 때문.)
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

}
