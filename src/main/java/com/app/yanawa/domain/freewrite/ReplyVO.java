package com.app.yanawa.domain.freewrite;


import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class ReplyVO {

    @EqualsAndHashCode.Include
    private Long id;
    private String replyContent;
    private Long userId;
    private Long postId;
    private String createdDate;
    private String updatedDate;
<<<<<<< HEAD

}
=======
}
>>>>>>> a71cca4e631d4857e8c42a9c3d6e093fd9495d9b
