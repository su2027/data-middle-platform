package com.wxf.system.config.web;

import com.wxf.system.config.web.converters.StringToEnumConverterFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Web全局配置
 *
 * @author hujun@ztgame.com
 * @since  2022/11/2 19:48
 */
@Configuration
public class GlobalWebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(new StringToEnumConverterFactory());
    }

}
