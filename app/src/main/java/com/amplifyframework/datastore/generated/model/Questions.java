package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Questions type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Questions", authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "owner", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.DELETE, ModelOperation.UPDATE })
})
public final class Questions implements Model {
  public static final QueryField ID = field("Questions", "id");
  public static final QueryField NAME = field("Questions", "name");
  public static final QueryField PRO1 = field("Questions", "pro1");
  public static final QueryField PRO2 = field("Questions", "pro2");
  public static final QueryField PRO3 = field("Questions", "pro3");
  public static final QueryField PRO4 = field("Questions", "pro4");
  public static final QueryField PRO5 = field("Questions", "pro5");
  public static final QueryField PRO6 = field("Questions", "pro6");
  public static final QueryField PRO7 = field("Questions", "pro7");
  public static final QueryField UPDATED_AT = field("Questions", "updatedAt");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String name;
  private final @ModelField(targetType="String") String pro1;
  private final @ModelField(targetType="String") String pro2;
  private final @ModelField(targetType="String") String pro3;
  private final @ModelField(targetType="String") String pro4;
  private final @ModelField(targetType="String") String pro5;
  private final @ModelField(targetType="String") String pro6;
  private final @ModelField(targetType="String") String pro7;
  private final @ModelField(targetType="AWSDateTime") Temporal.DateTime updatedAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  public String getId() {
      return id;
  }
  
  public String getName() {
      return name;
  }
  
  public String getPro1() {
      return pro1;
  }
  
  public String getPro2() {
      return pro2;
  }
  
  public String getPro3() {
      return pro3;
  }
  
  public String getPro4() {
      return pro4;
  }
  
  public String getPro5() {
      return pro5;
  }
  
  public String getPro6() {
      return pro6;
  }
  
  public String getPro7() {
      return pro7;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  private Questions(String id, String name, String pro1, String pro2, String pro3, String pro4, String pro5, String pro6, String pro7, Temporal.DateTime updatedAt) {
    this.id = id;
    this.name = name;
    this.pro1 = pro1;
    this.pro2 = pro2;
    this.pro3 = pro3;
    this.pro4 = pro4;
    this.pro5 = pro5;
    this.pro6 = pro6;
    this.pro7 = pro7;
    this.updatedAt = updatedAt;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Questions questions = (Questions) obj;
      return ObjectsCompat.equals(getId(), questions.getId()) &&
              ObjectsCompat.equals(getName(), questions.getName()) &&
              ObjectsCompat.equals(getPro1(), questions.getPro1()) &&
              ObjectsCompat.equals(getPro2(), questions.getPro2()) &&
              ObjectsCompat.equals(getPro3(), questions.getPro3()) &&
              ObjectsCompat.equals(getPro4(), questions.getPro4()) &&
              ObjectsCompat.equals(getPro5(), questions.getPro5()) &&
              ObjectsCompat.equals(getPro6(), questions.getPro6()) &&
              ObjectsCompat.equals(getPro7(), questions.getPro7()) &&
              ObjectsCompat.equals(getUpdatedAt(), questions.getUpdatedAt()) &&
              ObjectsCompat.equals(getCreatedAt(), questions.getCreatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getPro1())
      .append(getPro2())
      .append(getPro3())
      .append(getPro4())
      .append(getPro5())
      .append(getPro6())
      .append(getPro7())
      .append(getUpdatedAt())
      .append(getCreatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Questions {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("name=" + String.valueOf(getName()) + ", ")
      .append("pro1=" + String.valueOf(getPro1()) + ", ")
      .append("pro2=" + String.valueOf(getPro2()) + ", ")
      .append("pro3=" + String.valueOf(getPro3()) + ", ")
      .append("pro4=" + String.valueOf(getPro4()) + ", ")
      .append("pro5=" + String.valueOf(getPro5()) + ", ")
      .append("pro6=" + String.valueOf(getPro6()) + ", ")
      .append("pro7=" + String.valueOf(getPro7()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()))
      .append("}")
      .toString();
  }
  
  public static NameStep builder() {
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
  public static Questions justId(String id) {
    return new Questions(
      id,
      null,
      null,
      null,
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
      name,
      pro1,
      pro2,
      pro3,
      pro4,
      pro5,
      pro6,
      pro7,
      updatedAt);
  }
  public interface NameStep {
    BuildStep name(String name);
  }
  

  public interface BuildStep {
    Questions build();
    BuildStep id(String id);
    BuildStep pro1(String pro1);
    BuildStep pro2(String pro2);
    BuildStep pro3(String pro3);
    BuildStep pro4(String pro4);
    BuildStep pro5(String pro5);
    BuildStep pro6(String pro6);
    BuildStep pro7(String pro7);
    BuildStep updatedAt(Temporal.DateTime updatedAt);
  }
  

  public static class Builder implements NameStep, BuildStep {
    private String id;
    private String name;
    private String pro1;
    private String pro2;
    private String pro3;
    private String pro4;
    private String pro5;
    private String pro6;
    private String pro7;
    private Temporal.DateTime updatedAt;
    @Override
     public Questions build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Questions(
          id,
          name,
          pro1,
          pro2,
          pro3,
          pro4,
          pro5,
          pro6,
          pro7,
          updatedAt);
    }
    
    @Override
     public BuildStep name(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        return this;
    }
    
    @Override
     public BuildStep pro1(String pro1) {
        this.pro1 = pro1;
        return this;
    }
    
    @Override
     public BuildStep pro2(String pro2) {
        this.pro2 = pro2;
        return this;
    }
    
    @Override
     public BuildStep pro3(String pro3) {
        this.pro3 = pro3;
        return this;
    }
    
    @Override
     public BuildStep pro4(String pro4) {
        this.pro4 = pro4;
        return this;
    }
    
    @Override
     public BuildStep pro5(String pro5) {
        this.pro5 = pro5;
        return this;
    }
    
    @Override
     public BuildStep pro6(String pro6) {
        this.pro6 = pro6;
        return this;
    }
    
    @Override
     public BuildStep pro7(String pro7) {
        this.pro7 = pro7;
        return this;
    }
    
    @Override
     public BuildStep updatedAt(Temporal.DateTime updatedAt) {
        this.updatedAt = updatedAt;
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
    private CopyOfBuilder(String id, String name, String pro1, String pro2, String pro3, String pro4, String pro5, String pro6, String pro7, Temporal.DateTime updatedAt) {
      super.id(id);
      super.name(name)
        .pro1(pro1)
        .pro2(pro2)
        .pro3(pro3)
        .pro4(pro4)
        .pro5(pro5)
        .pro6(pro6)
        .pro7(pro7)
        .updatedAt(updatedAt);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder pro1(String pro1) {
      return (CopyOfBuilder) super.pro1(pro1);
    }
    
    @Override
     public CopyOfBuilder pro2(String pro2) {
      return (CopyOfBuilder) super.pro2(pro2);
    }
    
    @Override
     public CopyOfBuilder pro3(String pro3) {
      return (CopyOfBuilder) super.pro3(pro3);
    }
    
    @Override
     public CopyOfBuilder pro4(String pro4) {
      return (CopyOfBuilder) super.pro4(pro4);
    }
    
    @Override
     public CopyOfBuilder pro5(String pro5) {
      return (CopyOfBuilder) super.pro5(pro5);
    }
    
    @Override
     public CopyOfBuilder pro6(String pro6) {
      return (CopyOfBuilder) super.pro6(pro6);
    }
    
    @Override
     public CopyOfBuilder pro7(String pro7) {
      return (CopyOfBuilder) super.pro7(pro7);
    }
    
    @Override
     public CopyOfBuilder updatedAt(Temporal.DateTime updatedAt) {
      return (CopyOfBuilder) super.updatedAt(updatedAt);
    }
  }
  
}
