package com.app.yanawa.domain.freewrite;

<<<<<<< HEAD

=======
>>>>>>> a71cca4e631d4857e8c42a9c3d6e093fd9495d9b
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
}