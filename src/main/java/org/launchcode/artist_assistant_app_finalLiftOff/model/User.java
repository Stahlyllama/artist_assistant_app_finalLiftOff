//package org.launchcode.artist_assistant_app_finalLiftOff.model;
//
//import org.hibernate.validator.constraints.Length;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import javax.persistence.*;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//
//
//@Entity
//@Table(name="user")
//public class User extends AbstractEntity {
//
//    @Column (name="first_name")
//    @Length(min=2, message="*Your first name must have at least 2 characters")
//    @NotEmpty(message="*Please enter your first name!")
//    private String firstName;
//
//    @Column (name="last_name")
//    @Length(min=2, message="*Your last name must have at least 2 characters")
//    @NotEmpty(message="*Please enter your last name!")
//    private String lastName;
//
//    @Column(name = "email")
//    @Email(message = "*Please provide a valid Email")
//    @NotEmpty(message = "*Please provide an email")
//    private String email;
//
//    @Column(name = "password")
//    @Length(min = 5, message = "*Your password must have at least 5 characters")
//    @NotEmpty(message = "*Please provide your password")
//    private String pwHash;
//
////    @Column(name="active")
////    private Boolean isActive;
////
////            @ManyToMany(cascade = CascadeType.MERGE)
////            @JoinTable(name = "user_role", joinColumns = @JoinColumn(name="user_id", inverseJoinColumns =@JoinColumn(name="roles_id")))
////            private Set<Roles> roles;
//
////    public User(String firstName, String lastName, String email/*, String role*/) {
////        // this.role = "";
////    }
//
//    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//
//    public User(String firstName, String lastName, String email, String password) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.pwHash = encoder.encode(password);
//      }
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
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public boolean isMatchingPassword(String password) {
//        return encoder.matches(password, pwHash);
//    }
//
//
//
//    //   public Set<Role> getRoles(){
////        return roles;
////    }
////    public void setRoles(Set<Role> roles) {
////        this.roles = roles;
////    }
//}
//
