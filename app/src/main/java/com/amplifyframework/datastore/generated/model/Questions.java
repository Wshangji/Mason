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
  public static final QueryField PRO6_1 = field("Questions", "pro6_1");
  public static final QueryField PRO6_2 = field("Questions", "pro6_2");
  public static final QueryField PRO7_1 = field("Questions", "pro7_1");
  public static final QueryField PRO7_2 = field("Questions", "pro7_2");
  public static final QueryField PRO7_3 = field("Questions", "pro7_3");
  public static final QueryField PRO7_4 = field("Questions", "pro7_4");
  public static final QueryField PRO8_1 = field("Questions", "pro8_1");
  public static final QueryField PRO8_2 = field("Questions", "pro8_2");
  public static final QueryField PRO8_3 = field("Questions", "pro8_3");
  public static final QueryField PRO8_4 = field("Questions", "pro8_4");
  public static final QueryField PRO8_5 = field("Questions", "pro8_5");
  public static final QueryField PRO9_1 = field("Questions", "pro9_1");
  public static final QueryField PRO9_2 = field("Questions", "pro9_2");
  public static final QueryField PRO9_3 = field("Questions", "pro9_3");
  public static final QueryField PRO9_4 = field("Questions", "pro9_4");
  public static final QueryField PRO9_5 = field("Questions", "pro9_5");
  public static final QueryField UPDATED_AT = field("Questions", "updatedAt");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String name;
  private final @ModelField(targetType="String") String pro1;
  private final @ModelField(targetType="String") String pro2;
  private final @ModelField(targetType="String") String pro3;
  private final @ModelField(targetType="String") String pro4;
  private final @ModelField(targetType="String") String pro5;
  private final @ModelField(targetType="String") String pro6_1;
  private final @ModelField(targetType="String") String pro6_2;
  private final @ModelField(targetType="String") String pro7_1;
  private final @ModelField(targetType="String") String pro7_2;
  private final @ModelField(targetType="String") String pro7_3;
  private final @ModelField(targetType="String") String pro7_4;
  private final @ModelField(targetType="String") String pro8_1;
  private final @ModelField(targetType="String") String pro8_2;
  private final @ModelField(targetType="String") String pro8_3;
  private final @ModelField(targetType="String") String pro8_4;
  private final @ModelField(targetType="String") String pro8_5;
  private final @ModelField(targetType="String") String pro9_1;
  private final @ModelField(targetType="String") String pro9_2;
  private final @ModelField(targetType="String") String pro9_3;
  private final @ModelField(targetType="String") String pro9_4;
  private final @ModelField(targetType="String") String pro9_5;
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
  
  public String getPro6_1() {
      return pro6_1;
  }
  
  public String getPro6_2() {
      return pro6_2;
  }
  
  public String getPro7_1() {
      return pro7_1;
  }
  
  public String getPro7_2() {
      return pro7_2;
  }
  
  public String getPro7_3() {
      return pro7_3;
  }
  
  public String getPro7_4() {
      return pro7_4;
  }
  
  public String getPro8_1() {
      return pro8_1;
  }
  
  public String getPro8_2() {
      return pro8_2;
  }
  
  public String getPro8_3() {
      return pro8_3;
  }
  
  public String getPro8_4() {
      return pro8_4;
  }
  
  public String getPro8_5() {
      return pro8_5;
  }
  
  public String getPro9_1() {
      return pro9_1;
  }
  
  public String getPro9_2() {
      return pro9_2;
  }
  
  public String getPro9_3() {
      return pro9_3;
  }
  
  public String getPro9_4() {
      return pro9_4;
  }
  
  public String getPro9_5() {
      return pro9_5;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  private Questions(String id, String name, String pro1, String pro2, String pro3, String pro4, String pro5, String pro6_1, String pro6_2, String pro7_1, String pro7_2, String pro7_3, String pro7_4, String pro8_1, String pro8_2, String pro8_3, String pro8_4, String pro8_5, String pro9_1, String pro9_2, String pro9_3, String pro9_4, String pro9_5, Temporal.DateTime updatedAt) {
    this.id = id;
    this.name = name;
    this.pro1 = pro1;
    this.pro2 = pro2;
    this.pro3 = pro3;
    this.pro4 = pro4;
    this.pro5 = pro5;
    this.pro6_1 = pro6_1;
    this.pro6_2 = pro6_2;
    this.pro7_1 = pro7_1;
    this.pro7_2 = pro7_2;
    this.pro7_3 = pro7_3;
    this.pro7_4 = pro7_4;
    this.pro8_1 = pro8_1;
    this.pro8_2 = pro8_2;
    this.pro8_3 = pro8_3;
    this.pro8_4 = pro8_4;
    this.pro8_5 = pro8_5;
    this.pro9_1 = pro9_1;
    this.pro9_2 = pro9_2;
    this.pro9_3 = pro9_3;
    this.pro9_4 = pro9_4;
    this.pro9_5 = pro9_5;
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
              ObjectsCompat.equals(getPro6_1(), questions.getPro6_1()) &&
              ObjectsCompat.equals(getPro6_2(), questions.getPro6_2()) &&
              ObjectsCompat.equals(getPro7_1(), questions.getPro7_1()) &&
              ObjectsCompat.equals(getPro7_2(), questions.getPro7_2()) &&
              ObjectsCompat.equals(getPro7_3(), questions.getPro7_3()) &&
              ObjectsCompat.equals(getPro7_4(), questions.getPro7_4()) &&
              ObjectsCompat.equals(getPro8_1(), questions.getPro8_1()) &&
              ObjectsCompat.equals(getPro8_2(), questions.getPro8_2()) &&
              ObjectsCompat.equals(getPro8_3(), questions.getPro8_3()) &&
              ObjectsCompat.equals(getPro8_4(), questions.getPro8_4()) &&
              ObjectsCompat.equals(getPro8_5(), questions.getPro8_5()) &&
              ObjectsCompat.equals(getPro9_1(), questions.getPro9_1()) &&
              ObjectsCompat.equals(getPro9_2(), questions.getPro9_2()) &&
              ObjectsCompat.equals(getPro9_3(), questions.getPro9_3()) &&
              ObjectsCompat.equals(getPro9_4(), questions.getPro9_4()) &&
              ObjectsCompat.equals(getPro9_5(), questions.getPro9_5()) &&
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
      .append(getPro6_1())
      .append(getPro6_2())
      .append(getPro7_1())
      .append(getPro7_2())
      .append(getPro7_3())
      .append(getPro7_4())
      .append(getPro8_1())
      .append(getPro8_2())
      .append(getPro8_3())
      .append(getPro8_4())
      .append(getPro8_5())
      .append(getPro9_1())
      .append(getPro9_2())
      .append(getPro9_3())
      .append(getPro9_4())
      .append(getPro9_5())
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
      .append("pro6_1=" + String.valueOf(getPro6_1()) + ", ")
      .append("pro6_2=" + String.valueOf(getPro6_2()) + ", ")
      .append("pro7_1=" + String.valueOf(getPro7_1()) + ", ")
      .append("pro7_2=" + String.valueOf(getPro7_2()) + ", ")
      .append("pro7_3=" + String.valueOf(getPro7_3()) + ", ")
      .append("pro7_4=" + String.valueOf(getPro7_4()) + ", ")
      .append("pro8_1=" + String.valueOf(getPro8_1()) + ", ")
      .append("pro8_2=" + String.valueOf(getPro8_2()) + ", ")
      .append("pro8_3=" + String.valueOf(getPro8_3()) + ", ")
      .append("pro8_4=" + String.valueOf(getPro8_4()) + ", ")
      .append("pro8_5=" + String.valueOf(getPro8_5()) + ", ")
      .append("pro9_1=" + String.valueOf(getPro9_1()) + ", ")
      .append("pro9_2=" + String.valueOf(getPro9_2()) + ", ")
      .append("pro9_3=" + String.valueOf(getPro9_3()) + ", ")
      .append("pro9_4=" + String.valueOf(getPro9_4()) + ", ")
      .append("pro9_5=" + String.valueOf(getPro9_5()) + ", ")
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
      null,
      null,
      null,
      null,
      null,
      null,
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
      pro6_1,
      pro6_2,
      pro7_1,
      pro7_2,
      pro7_3,
      pro7_4,
      pro8_1,
      pro8_2,
      pro8_3,
      pro8_4,
      pro8_5,
      pro9_1,
      pro9_2,
      pro9_3,
      pro9_4,
      pro9_5,
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
    BuildStep pro6_1(String pro6_1);
    BuildStep pro6_2(String pro6_2);
    BuildStep pro7_1(String pro7_1);
    BuildStep pro7_2(String pro7_2);
    BuildStep pro7_3(String pro7_3);
    BuildStep pro7_4(String pro7_4);
    BuildStep pro8_1(String pro8_1);
    BuildStep pro8_2(String pro8_2);
    BuildStep pro8_3(String pro8_3);
    BuildStep pro8_4(String pro8_4);
    BuildStep pro8_5(String pro8_5);
    BuildStep pro9_1(String pro9_1);
    BuildStep pro9_2(String pro9_2);
    BuildStep pro9_3(String pro9_3);
    BuildStep pro9_4(String pro9_4);
    BuildStep pro9_5(String pro9_5);
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
    private String pro6_1;
    private String pro6_2;
    private String pro7_1;
    private String pro7_2;
    private String pro7_3;
    private String pro7_4;
    private String pro8_1;
    private String pro8_2;
    private String pro8_3;
    private String pro8_4;
    private String pro8_5;
    private String pro9_1;
    private String pro9_2;
    private String pro9_3;
    private String pro9_4;
    private String pro9_5;
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
          pro6_1,
          pro6_2,
          pro7_1,
          pro7_2,
          pro7_3,
          pro7_4,
          pro8_1,
          pro8_2,
          pro8_3,
          pro8_4,
          pro8_5,
          pro9_1,
          pro9_2,
          pro9_3,
          pro9_4,
          pro9_5,
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
     public BuildStep pro6_1(String pro6_1) {
        this.pro6_1 = pro6_1;
        return this;
    }
    
    @Override
     public BuildStep pro6_2(String pro6_2) {
        this.pro6_2 = pro6_2;
        return this;
    }
    
    @Override
     public BuildStep pro7_1(String pro7_1) {
        this.pro7_1 = pro7_1;
        return this;
    }
    
    @Override
     public BuildStep pro7_2(String pro7_2) {
        this.pro7_2 = pro7_2;
        return this;
    }
    
    @Override
     public BuildStep pro7_3(String pro7_3) {
        this.pro7_3 = pro7_3;
        return this;
    }
    
    @Override
     public BuildStep pro7_4(String pro7_4) {
        this.pro7_4 = pro7_4;
        return this;
    }
    
    @Override
     public BuildStep pro8_1(String pro8_1) {
        this.pro8_1 = pro8_1;
        return this;
    }
    
    @Override
     public BuildStep pro8_2(String pro8_2) {
        this.pro8_2 = pro8_2;
        return this;
    }
    
    @Override
     public BuildStep pro8_3(String pro8_3) {
        this.pro8_3 = pro8_3;
        return this;
    }
    
    @Override
     public BuildStep pro8_4(String pro8_4) {
        this.pro8_4 = pro8_4;
        return this;
    }
    
    @Override
     public BuildStep pro8_5(String pro8_5) {
        this.pro8_5 = pro8_5;
        return this;
    }
    
    @Override
     public BuildStep pro9_1(String pro9_1) {
        this.pro9_1 = pro9_1;
        return this;
    }
    
    @Override
     public BuildStep pro9_2(String pro9_2) {
        this.pro9_2 = pro9_2;
        return this;
    }
    
    @Override
     public BuildStep pro9_3(String pro9_3) {
        this.pro9_3 = pro9_3;
        return this;
    }
    
    @Override
     public BuildStep pro9_4(String pro9_4) {
        this.pro9_4 = pro9_4;
        return this;
    }
    
    @Override
     public BuildStep pro9_5(String pro9_5) {
        this.pro9_5 = pro9_5;
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
    private CopyOfBuilder(String id, String name, String pro1, String pro2, String pro3, String pro4, String pro5, String pro6_1, String pro6_2, String pro7_1, String pro7_2, String pro7_3, String pro7_4, String pro8_1, String pro8_2, String pro8_3, String pro8_4, String pro8_5, String pro9_1, String pro9_2, String pro9_3, String pro9_4, String pro9_5, Temporal.DateTime updatedAt) {
      super.id(id);
      super.name(name)
        .pro1(pro1)
        .pro2(pro2)
        .pro3(pro3)
        .pro4(pro4)
        .pro5(pro5)
        .pro6_1(pro6_1)
        .pro6_2(pro6_2)
        .pro7_1(pro7_1)
        .pro7_2(pro7_2)
        .pro7_3(pro7_3)
        .pro7_4(pro7_4)
        .pro8_1(pro8_1)
        .pro8_2(pro8_2)
        .pro8_3(pro8_3)
        .pro8_4(pro8_4)
        .pro8_5(pro8_5)
        .pro9_1(pro9_1)
        .pro9_2(pro9_2)
        .pro9_3(pro9_3)
        .pro9_4(pro9_4)
        .pro9_5(pro9_5)
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
     public CopyOfBuilder pro6_1(String pro6_1) {
      return (CopyOfBuilder) super.pro6_1(pro6_1);
    }
    
    @Override
     public CopyOfBuilder pro6_2(String pro6_2) {
      return (CopyOfBuilder) super.pro6_2(pro6_2);
    }
    
    @Override
     public CopyOfBuilder pro7_1(String pro7_1) {
      return (CopyOfBuilder) super.pro7_1(pro7_1);
    }
    
    @Override
     public CopyOfBuilder pro7_2(String pro7_2) {
      return (CopyOfBuilder) super.pro7_2(pro7_2);
    }
    
    @Override
     public CopyOfBuilder pro7_3(String pro7_3) {
      return (CopyOfBuilder) super.pro7_3(pro7_3);
    }
    
    @Override
     public CopyOfBuilder pro7_4(String pro7_4) {
      return (CopyOfBuilder) super.pro7_4(pro7_4);
    }
    
    @Override
     public CopyOfBuilder pro8_1(String pro8_1) {
      return (CopyOfBuilder) super.pro8_1(pro8_1);
    }
    
    @Override
     public CopyOfBuilder pro8_2(String pro8_2) {
      return (CopyOfBuilder) super.pro8_2(pro8_2);
    }
    
    @Override
     public CopyOfBuilder pro8_3(String pro8_3) {
      return (CopyOfBuilder) super.pro8_3(pro8_3);
    }
    
    @Override
     public CopyOfBuilder pro8_4(String pro8_4) {
      return (CopyOfBuilder) super.pro8_4(pro8_4);
    }
    
    @Override
     public CopyOfBuilder pro8_5(String pro8_5) {
      return (CopyOfBuilder) super.pro8_5(pro8_5);
    }
    
    @Override
     public CopyOfBuilder pro9_1(String pro9_1) {
      return (CopyOfBuilder) super.pro9_1(pro9_1);
    }
    
    @Override
     public CopyOfBuilder pro9_2(String pro9_2) {
      return (CopyOfBuilder) super.pro9_2(pro9_2);
    }
    
    @Override
     public CopyOfBuilder pro9_3(String pro9_3) {
      return (CopyOfBuilder) super.pro9_3(pro9_3);
    }
    
    @Override
     public CopyOfBuilder pro9_4(String pro9_4) {
      return (CopyOfBuilder) super.pro9_4(pro9_4);
    }
    
    @Override
     public CopyOfBuilder pro9_5(String pro9_5) {
      return (CopyOfBuilder) super.pro9_5(pro9_5);
    }
    
    @Override
     public CopyOfBuilder updatedAt(Temporal.DateTime updatedAt) {
      return (CopyOfBuilder) super.updatedAt(updatedAt);
    }
  }
  
}
