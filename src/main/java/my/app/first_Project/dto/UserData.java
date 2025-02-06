package my.app.first_Project.dto;

import lombok.*;

@Getter
@Setter
@ToString
//@RequiredArgsConstructor
public class UserData {
    private String userName;
    private int userAge;
    private String userAddress;
//
//    public UserData(String userName, int userAge) {
//        this.userName = userName;
//        this.userAge = userAge;
//    }
//    getter,setter,toString
//    기본 생성자,전체생성자,일부생성자

//    @AllArgsConstructor(전체)
//    =
//    public UserData(String userName, int userAge, String userAddress) {
//        this.userName = userName;
//        this.userAge = userAge;
//        this.userAddress = userAddress;
//    }

//    @NoArgsConstructor (아무것도 없는것)
//    =
//    public UserData() {
//    }

//    @RequiredArgsConstructor(필요에 따라)
//    =
//    public UserData(String userName) {
//        this.userName = userName;

//    public UserData(String userName, int userAge) {
//        this.userName = userName;
//        this.userAge = userAge;
//    }
//    @AllArgsConstructor
//    @NoArgsConstructor
//    @RequiredArgsConstructor
//    @Getter
//    @Setter
//    @Data = getter,setter,tostring ,requiredargsconstructor,equalsandhashcode (한꺼번에 설정해주는 )
//    @ToString
//    @EqualsAndHashCode
}
