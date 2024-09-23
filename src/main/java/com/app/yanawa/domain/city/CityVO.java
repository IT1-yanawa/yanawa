package com.app.yanawa.domain.city;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class CityVO {
    @EqualsAndHashCode.Include
    private Long id;
    private String cityName;
}
