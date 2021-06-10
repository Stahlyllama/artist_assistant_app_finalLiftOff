//package org.launchcode.artist_assistant_app_finalLiftOff.model.dto;
//
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//public class RegisterFormDTO extends LoginFormDTO {
//    @NotBlank (message="")
//    @NotNull
//    @Size(min=2, max =30, message = "First Name has to be 2-30 characters")
//    private String firstName;
//
//    @NotBlank (message="")
//    @NotNull
//    @Size (min=2, max =30, message = "First Name has to be 2-30 characters")
//    private String lastName;
//
//    @NotBlank
//    @NotNull
//    @Size(min = 5, max = 30, message = "Invalid password. Must be between 5 and 30 characters.")
//    private String verifyPassword;
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getVerifyPassword() {
//        return verifyPassword;
//    }
//
//    public void setVerifyPassword(String verifyPassword) {
//        this.verifyPassword = verifyPassword;
//    }
//}
//
