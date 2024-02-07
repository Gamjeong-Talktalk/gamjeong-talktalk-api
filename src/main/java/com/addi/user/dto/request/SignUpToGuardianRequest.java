package com.addi.user.dto.request;


import com.addi.user.domain.Guardian;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SignUpToGuardianRequest {

    String ID;
    String password;
    String name;
    String phoneNumber;
    String organization;

    public Guardian toEntity(){
        return Guardian.builder()
                .ID(ID)
                .password(password)
                .name(name)
                .phoneNumber(phoneNumber)
                .organization(organization)
                .build();
    }

}
