//package capstondesign2.backend.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Bean
//    public MappingJackson2HttpMessageConverter jacksonConverter() {
//        return new MappingJackson2HttpMessageConverter();
//    }
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins(
//                        "http://localhost:5173",
//                        "http://localhost:5174",
//                        "https://pocusmate.vercel.app"
//                )
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                .allowedHeaders("*")
//                .allowCredentials(true);
//    }
//
//}
package capstondesign2.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public MappingJackson2HttpMessageConverter jacksonConverter() {
        return new MappingJackson2HttpMessageConverter();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        // 로컬 개발 환경
                        "http://localhost:5173",
                        "http://localhost:5174",
                        "http://localhost:3000",
                        "http://127.0.0.1:5173",

                        // 배포 환경 - 여기가 중요!
                        "https://pocusmate.vercel.app",
                        "https://pocusmate.ddns.net",  // 🔥 이 줄 추가!
                        "https://*.vercel.app",        // 서브도메인 대응

                        // Claude.ai artifact 환경 (혹시 모를 경우)
                        "https://claude.ai",
                        "null" // 로컬 파일 시스템에서의 요청
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600); // 🔥 pre-flight 캐시 시간 설정
    }
}