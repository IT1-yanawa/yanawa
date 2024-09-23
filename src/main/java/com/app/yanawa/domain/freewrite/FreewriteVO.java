package com.app.yanawa.domain.freewrite;

<<<<<<< HEAD
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class FreewriteVO {

    @EqualsAndHashCode.Include
    private Long id;
    private String postTitle;
    private String postContent;
    private Long userId;
    private String createdDate;
    private String updatedDate;
    private int postReadCount;
    private int replyCount;
=======
public class FreewriteVO {
>>>>>>> 7f318cfe218b61a06e15c2301ab7f94d75b427d3
}
