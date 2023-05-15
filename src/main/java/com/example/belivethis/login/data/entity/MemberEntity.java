package com.example.belivethis.login.data.entity;

import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
public class MemberEntity extends BaseTimeEntity{
    @Id @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45, unique = true)
    private String email;

    @Column(length = 45)
    private String nickname;

    private int age;

    @Column(length = 100)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public void encodePassword(PasswordEncoder passwordEncoder){
        this.password = passwordEncoder.encode(password);
    }

    public void addUserAuthority() {
        this.role = Role.USER;
    }

    public boolean checkPassword(PasswordEncoder passwordEncoder, String password) {
        return passwordEncoder.matches(password, this.password);
    }

    public String getUsername() {
        return this.email;
    }



//    {
//        "email": "test@qq.com",
//            "nickname": "awefaa",
//            "age": 55,
//            "password": "1111qqqq!",
//            "checkedPassword": "1111qqqq!",
//            "role": "ADMIN"
//    }
}
