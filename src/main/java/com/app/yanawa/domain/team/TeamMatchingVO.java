package com.app.yanawa.domain.team;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class TeamMatchingVO {
    @EqualsAndHashCode.Include
    private Long id;
    private Long tryTeamId;
    private Long matchingId;
    private String createDate;
    private String updateDate;
}
