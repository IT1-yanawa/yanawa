package com.app.yanawa.domain.applicant;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantVO {
    @EqualsAndHashCode.Include
    private Long id;
    private Long userId;
    private Long teamPostId;
    private String introduce;
    private String createdDate;
    private String updatedDate;
}
