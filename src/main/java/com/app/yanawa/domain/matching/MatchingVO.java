package com.app.yanawa.domain.matching;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class MatchingVO {
    @EqualsAndHashCode.Exclude
    private Long postId;
    private String matchingStatus;
    private Long timeId;
    private Long teamId;
    private int timeCordinate;
    private int dateCordinate;
    private int localCityId;
    private int localCityDetail;
    private String createDate;
    private String updateDate;


}
