//package org.launchcode.artist_assistant_app_finalLiftOff.model;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
//import java.util.Objects;
//
//@MappedSuperclass
//public abstract class AbstractEntity {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "user_id")
//    private int id;
//
//    public int getId() {
//        return id;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        AbstractEntity entity = (AbstractEntity) o;
//        return id == entity.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//}
