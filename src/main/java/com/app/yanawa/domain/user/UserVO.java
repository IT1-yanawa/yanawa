package com.app.yanawa.domain.user;

import lombok.*;
import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component
@Getter @ToString @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserVO implements Serializable {
    @EqualsAndHashCode.Include
    private Long id;
    private String userName;
    private String userEmail;
    private String userNickName;
    private String userPhone;
    private String userPassword;
    private String userGender;
    private int userPoint;
    private String userIntroduce;
    private String userSportKind;
    private String userPositionKind;
    private String userSportHistory;
    private String userBirth;
    private String createdDate;
    private String updatedDate;

    public UserDTO toDTO(){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setUserName(userName);
        userDTO.setUserEmail(userEmail);
        userDTO.setUserNickName(userNickName);
        userDTO.setUserPhone(userPhone);
        userDTO.setUserPassword(userPassword);
        userDTO.setUserGender(userGender);
        userDTO.setUserPoint(userPoint);
        userDTO.setUserIntroduce(userIntroduce);
        userDTO.setUserSportKind(userSportKind);
        userDTO.setUserPositionKind(userPositionKind);
        userDTO.setUserSportHistory(userSportHistory);
        userDTO.setUserBirth(userBirth);
        userDTO.setCreatedDate(createdDate);
        userDTO.setUpdatedDate(updatedDate);
        return userDTO;
    }
}