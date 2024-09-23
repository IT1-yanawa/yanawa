package com.app.yanawa.domain.matching;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class MatchingTimeVO {
    @EqualsAndHashCode.Include
    private Long id;
    private String matchingTime;
    private String runTime;
}
