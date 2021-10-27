package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.temporal.Temporal;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Perception type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Perceptions")
public final class Perception implements Model {
  public static final QueryField ID = field("Perception", "id");
  public static final QueryField GENDER = field("Perception", "gender");
  public static final QueryField RACE = field("Perception", "race");
  public static final QueryField ETHNICITY = field("Perception", "ethnicity");
  public static final QueryField SES = field("Perception", "ses");
  public static final QueryField EIGENSTATES = field("Perception", "eigenstates");
  public static final QueryField USER = field("Perception", "perceptionUserId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String gender;
  private final @ModelField(targetType="String") String race;
  private final @ModelField(targetType="String") String ethnicity;
  private final @ModelField(targetType="String") String ses;
  private final @ModelField(targetType="String") String eigenstates;
  private final @ModelField(targetType="User") @BelongsTo(targetName = "perceptionUserId", type = User.class) User user;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getGender() {
      return gender;
  }
  
  public String getRace() {
      return race;
  }
  
  public String getEthnicity() {
      return ethnicity;
  }
  
  public String getSes() {
      return ses;
  }
  
  public String getEigenstates() {
      return eigenstates;
  }
  
  public User getUser() {
      return user;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Perception(String id, String gender, String race, String ethnicity, String ses, String eigenstates, User user) {
    this.id = id;
    this.gender = gender;
    this.race = race;
    this.ethnicity = ethnicity;
    this.ses = ses;
    this.eigenstates = eigenstates;
    this.user = user;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Perception perception = (Perception) obj;
      return ObjectsCompat.equals(getId(), perception.getId()) &&
              ObjectsCompat.equals(getGender(), perception.getGender()) &&
              ObjectsCompat.equals(getRace(), perception.getRace()) &&
              ObjectsCompat.equals(getEthnicity(), perception.getEthnicity()) &&
              ObjectsCompat.equals(getSes(), perception.getSes()) &&
              ObjectsCompat.equals(getEigenstates(), perception.getEigenstates()) &&
              ObjectsCompat.equals(getUser(), perception.getUser()) &&
              ObjectsCompat.equals(getCreatedAt(), perception.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), perception.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getGender())
      .append(getRace())
      .append(getEthnicity())
      .append(getSes())
      .append(getEigenstates())
      .append(getUser())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Perception {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("gender=" + String.valueOf(getGender()) + ", ")
      .append("race=" + String.valueOf(getRace()) + ", ")
      .append("ethnicity=" + String.valueOf(getEthnicity()) + ", ")
      .append("ses=" + String.valueOf(getSes()) + ", ")
      .append("eigenstates=" + String.valueOf(getEigenstates()) + ", ")
      .append("user=" + String.valueOf(getUser()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static BuildStep builder() {
      return new Builder();
  }
  
  /** 
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static Perception justId(String id) {
    return new Perception(
      id,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      gender,
      race,
      ethnicity,
      ses,
      eigenstates,
      user);
  }
  public interface BuildStep {
    Perception build();
    BuildStep id(String id);
    BuildStep gender(String gender);
    BuildStep race(String race);
    BuildStep ethnicity(String ethnicity);
    BuildStep ses(String ses);
    BuildStep eigenstates(String eigenstates);
    BuildStep user(User user);
  }
  

  public static class Builder implements BuildStep {
    private String id;
    private String gender;
    private String race;
    private String ethnicity;
    private String ses;
    private String eigenstates;
    private User user;
    @Override
     public Perception build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Perception(
          id,
          gender,
          race,
          ethnicity,
          ses,
          eigenstates,
          user);
    }
    
    @Override
     public BuildStep gender(String gender) {
        this.gender = gender;
        return this;
    }
    
    @Override
     public BuildStep race(String race) {
        this.race = race;
        return this;
    }
    
    @Override
     public BuildStep ethnicity(String ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }
    
    @Override
     public BuildStep ses(String ses) {
        this.ses = ses;
        return this;
    }
    
    @Override
     public BuildStep eigenstates(String eigenstates) {
        this.eigenstates = eigenstates;
        return this;
    }
    
    @Override
     public BuildStep user(User user) {
        this.user = user;
        return this;
    }
    
    /** 
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String gender, String race, String ethnicity, String ses, String eigenstates, User user) {
      super.id(id);
      super.gender(gender)
        .race(race)
        .ethnicity(ethnicity)
        .ses(ses)
        .eigenstates(eigenstates)
        .user(user);
    }
    
    @Override
     public CopyOfBuilder gender(String gender) {
      return (CopyOfBuilder) super.gender(gender);
    }
    
    @Override
     public CopyOfBuilder race(String race) {
      return (CopyOfBuilder) super.race(race);
    }
    
    @Override
     public CopyOfBuilder ethnicity(String ethnicity) {
      return (CopyOfBuilder) super.ethnicity(ethnicity);
    }
    
    @Override
     public CopyOfBuilder ses(String ses) {
      return (CopyOfBuilder) super.ses(ses);
    }
    
    @Override
     public CopyOfBuilder eigenstates(String eigenstates) {
      return (CopyOfBuilder) super.eigenstates(eigenstates);
    }
    
    @Override
     public CopyOfBuilder user(User user) {
      return (CopyOfBuilder) super.user(user);
    }
  }
  
}
