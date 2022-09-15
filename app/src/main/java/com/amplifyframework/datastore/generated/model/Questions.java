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
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
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
  public static final QueryField PRO7 = field("Questions", "pro7");
  public static final QueryField PRO8 = field("Questions", "pro8");
  public static final QueryField PRO9 = field("Questions", "pro9");
  public static final QueryField PRO10_1 = field("Questions", "pro10_1");
  public static final QueryField PRO10_2 = field("Questions", "pro10_2");
  public static final QueryField PRO10_3 = field("Questions", "pro10_3");
  public static final QueryField PRO10_4 = field("Questions", "pro10_4");
  public static final QueryField PRO11_1 = field("Questions", "pro11_1");
  public static final QueryField PRO11_2 = field("Questions", "pro11_2");
  public static final QueryField PRO11_3 = field("Questions", "pro11_3");
  public static final QueryField PRO11_4 = field("Questions", "pro11_4");
  public static final QueryField PRO11_5 = field("Questions", "pro11_5");
  public static final QueryField PRO12_1 = field("Questions", "pro12_1");
  public static final QueryField PRO12_2 = field("Questions", "pro12_2");
  public static final QueryField PRO12_3 = field("Questions", "pro12_3");
  public static final QueryField PRO12_4 = field("Questions", "pro12_4");
  public static final QueryField PRO12_5 = field("Questions", "pro12_5");
  public static final QueryField UPDATED_AT = field("Questions", "updatedAt");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String name;
  private final @ModelField(targetType="String") String pro1;
  private final @ModelField(targetType="String") String pro2;
  private final @ModelField(targetType="String") String pro3;
  private final @ModelField(targetType="String") String pro4;
  private final @ModelField(targetType="String") String pro5;
  private final @ModelField(targetType="String") String pro6_1;
  private final @ModelField(targetType="String") String pro6_2;
  private final @ModelField(targetType="String") String pro7;
  private final @ModelField(targetType="String") String pro8;
  private final @ModelField(targetType="String") String pro9;
  private final @ModelField(targetType="String") String pro10_1;
  private final @ModelField(targetType="String") String pro10_2;
  private final @ModelField(targetType="String") String pro10_3;
  private final @ModelField(targetType="String") String pro10_4;
  private final @ModelField(targetType="String") String pro11_1;
  private final @ModelField(targetType="String") String pro11_2;
  private final @ModelField(targetType="String") String pro11_3;
  private final @ModelField(targetType="String") String pro11_4;
  private final @ModelField(targetType="String") String pro11_5;
  private final @ModelField(targetType="String") String pro12_1;
  private final @ModelField(targetType="String") String pro12_2;
  private final @ModelField(targetType="String") String pro12_3;
  private final @ModelField(targetType="String") String pro12_4;
  private final @ModelField(targetType="String") String pro12_5;
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
  
  public String getPro7() {
      return pro7;
  }
  
  public String getPro8() {
      return pro8;
  }
  
  public String getPro9() {
      return pro9;
  }
  
  public String getPro10_1() {
      return pro10_1;
  }
  
  public String getPro10_2() {
      return pro10_2;
  }
  
  public String getPro10_3() {
      return pro10_3;
  }
  
  public String getPro10_4() {
      return pro10_4;
  }
  
  public String getPro11_1() {
      return pro11_1;
  }
  
  public String getPro11_2() {
      return pro11_2;
  }
  
  public String getPro11_3() {
      return pro11_3;
  }
  
  public String getPro11_4() {
      return pro11_4;
  }
  
  public String getPro11_5() {
      return pro11_5;
  }
  
  public String getPro12_1() {
      return pro12_1;
  }
  
  public String getPro12_2() {
      return pro12_2;
  }
  
  public String getPro12_3() {
      return pro12_3;
  }
  
  public String getPro12_4() {
      return pro12_4;
  }
  
  public String getPro12_5() {
      return pro12_5;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  private Questions(String id, String name, String pro1, String pro2, String pro3, String pro4, String pro5, String pro6_1, String pro6_2, String pro7, String pro8, String pro9, String pro10_1, String pro10_2, String pro10_3, String pro10_4, String pro11_1, String pro11_2, String pro11_3, String pro11_4, String pro11_5, String pro12_1, String pro12_2, String pro12_3, String pro12_4, String pro12_5, Temporal.DateTime updatedAt) {
    this.id = id;
    this.name = name;
    this.pro1 = pro1;
    this.pro2 = pro2;
    this.pro3 = pro3;
    this.pro4 = pro4;
    this.pro5 = pro5;
    this.pro6_1 = pro6_1;
    this.pro6_2 = pro6_2;
    this.pro7 = pro7;
    this.pro8 = pro8;
    this.pro9 = pro9;
    this.pro10_1 = pro10_1;
    this.pro10_2 = pro10_2;
    this.pro10_3 = pro10_3;
    this.pro10_4 = pro10_4;
    this.pro11_1 = pro11_1;
    this.pro11_2 = pro11_2;
    this.pro11_3 = pro11_3;
    this.pro11_4 = pro11_4;
    this.pro11_5 = pro11_5;
    this.pro12_1 = pro12_1;
    this.pro12_2 = pro12_2;
    this.pro12_3 = pro12_3;
    this.pro12_4 = pro12_4;
    this.pro12_5 = pro12_5;
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
              ObjectsCompat.equals(getPro7(), questions.getPro7()) &&
              ObjectsCompat.equals(getPro8(), questions.getPro8()) &&
              ObjectsCompat.equals(getPro9(), questions.getPro9()) &&
              ObjectsCompat.equals(getPro10_1(), questions.getPro10_1()) &&
              ObjectsCompat.equals(getPro10_2(), questions.getPro10_2()) &&
              ObjectsCompat.equals(getPro10_3(), questions.getPro10_3()) &&
              ObjectsCompat.equals(getPro10_4(), questions.getPro10_4()) &&
              ObjectsCompat.equals(getPro11_1(), questions.getPro11_1()) &&
              ObjectsCompat.equals(getPro11_2(), questions.getPro11_2()) &&
              ObjectsCompat.equals(getPro11_3(), questions.getPro11_3()) &&
              ObjectsCompat.equals(getPro11_4(), questions.getPro11_4()) &&
              ObjectsCompat.equals(getPro11_5(), questions.getPro11_5()) &&
              ObjectsCompat.equals(getPro12_1(), questions.getPro12_1()) &&
              ObjectsCompat.equals(getPro12_2(), questions.getPro12_2()) &&
              ObjectsCompat.equals(getPro12_3(), questions.getPro12_3()) &&
              ObjectsCompat.equals(getPro12_4(), questions.getPro12_4()) &&
              ObjectsCompat.equals(getPro12_5(), questions.getPro12_5()) &&
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
      .append(getPro7())
      .append(getPro8())
      .append(getPro9())
      .append(getPro10_1())
      .append(getPro10_2())
      .append(getPro10_3())
      .append(getPro10_4())
      .append(getPro11_1())
      .append(getPro11_2())
      .append(getPro11_3())
      .append(getPro11_4())
      .append(getPro11_5())
      .append(getPro12_1())
      .append(getPro12_2())
      .append(getPro12_3())
      .append(getPro12_4())
      .append(getPro12_5())
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
      .append("pro7=" + String.valueOf(getPro7()) + ", ")
      .append("pro8=" + String.valueOf(getPro8()) + ", ")
      .append("pro9=" + String.valueOf(getPro9()) + ", ")
      .append("pro10_1=" + String.valueOf(getPro10_1()) + ", ")
      .append("pro10_2=" + String.valueOf(getPro10_2()) + ", ")
      .append("pro10_3=" + String.valueOf(getPro10_3()) + ", ")
      .append("pro10_4=" + String.valueOf(getPro10_4()) + ", ")
      .append("pro11_1=" + String.valueOf(getPro11_1()) + ", ")
      .append("pro11_2=" + String.valueOf(getPro11_2()) + ", ")
      .append("pro11_3=" + String.valueOf(getPro11_3()) + ", ")
      .append("pro11_4=" + String.valueOf(getPro11_4()) + ", ")
      .append("pro11_5=" + String.valueOf(getPro11_5()) + ", ")
      .append("pro12_1=" + String.valueOf(getPro12_1()) + ", ")
      .append("pro12_2=" + String.valueOf(getPro12_2()) + ", ")
      .append("pro12_3=" + String.valueOf(getPro12_3()) + ", ")
      .append("pro12_4=" + String.valueOf(getPro12_4()) + ", ")
      .append("pro12_5=" + String.valueOf(getPro12_5()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()))
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
      pro7,
      pro8,
      pro9,
      pro10_1,
      pro10_2,
      pro10_3,
      pro10_4,
      pro11_1,
      pro11_2,
      pro11_3,
      pro11_4,
      pro11_5,
      pro12_1,
      pro12_2,
      pro12_3,
      pro12_4,
      pro12_5,
      updatedAt);
  }
  public interface BuildStep {
    Questions build();
    BuildStep id(String id);
    BuildStep name(String name);
    BuildStep pro1(String pro1);
    BuildStep pro2(String pro2);
    BuildStep pro3(String pro3);
    BuildStep pro4(String pro4);
    BuildStep pro5(String pro5);
    BuildStep pro6_1(String pro6_1);
    BuildStep pro6_2(String pro6_2);
    BuildStep pro7(String pro7);
    BuildStep pro8(String pro8);
    BuildStep pro9(String pro9);
    BuildStep pro10_1(String pro10_1);
    BuildStep pro10_2(String pro10_2);
    BuildStep pro10_3(String pro10_3);
    BuildStep pro10_4(String pro10_4);
    BuildStep pro11_1(String pro11_1);
    BuildStep pro11_2(String pro11_2);
    BuildStep pro11_3(String pro11_3);
    BuildStep pro11_4(String pro11_4);
    BuildStep pro11_5(String pro11_5);
    BuildStep pro12_1(String pro12_1);
    BuildStep pro12_2(String pro12_2);
    BuildStep pro12_3(String pro12_3);
    BuildStep pro12_4(String pro12_4);
    BuildStep pro12_5(String pro12_5);
    BuildStep updatedAt(Temporal.DateTime updatedAt);
  }
  

  public static class Builder implements BuildStep {
    private String id;
    private String name;
    private String pro1;
    private String pro2;
    private String pro3;
    private String pro4;
    private String pro5;
    private String pro6_1;
    private String pro6_2;
    private String pro7;
    private String pro8;
    private String pro9;
    private String pro10_1;
    private String pro10_2;
    private String pro10_3;
    private String pro10_4;
    private String pro11_1;
    private String pro11_2;
    private String pro11_3;
    private String pro11_4;
    private String pro11_5;
    private String pro12_1;
    private String pro12_2;
    private String pro12_3;
    private String pro12_4;
    private String pro12_5;
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
          pro7,
          pro8,
          pro9,
          pro10_1,
          pro10_2,
          pro10_3,
          pro10_4,
          pro11_1,
          pro11_2,
          pro11_3,
          pro11_4,
          pro11_5,
          pro12_1,
          pro12_2,
          pro12_3,
          pro12_4,
          pro12_5,
          updatedAt);
    }
    
    @Override
     public BuildStep name(String name) {
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
     public BuildStep pro7(String pro7) {
        this.pro7 = pro7;
        return this;
    }
    
    @Override
     public BuildStep pro8(String pro8) {
        this.pro8 = pro8;
        return this;
    }
    
    @Override
     public BuildStep pro9(String pro9) {
        this.pro9 = pro9;
        return this;
    }
    
    @Override
     public BuildStep pro10_1(String pro10_1) {
        this.pro10_1 = pro10_1;
        return this;
    }
    
    @Override
     public BuildStep pro10_2(String pro10_2) {
        this.pro10_2 = pro10_2;
        return this;
    }
    
    @Override
     public BuildStep pro10_3(String pro10_3) {
        this.pro10_3 = pro10_3;
        return this;
    }
    
    @Override
     public BuildStep pro10_4(String pro10_4) {
        this.pro10_4 = pro10_4;
        return this;
    }
    
    @Override
     public BuildStep pro11_1(String pro11_1) {
        this.pro11_1 = pro11_1;
        return this;
    }
    
    @Override
     public BuildStep pro11_2(String pro11_2) {
        this.pro11_2 = pro11_2;
        return this;
    }
    
    @Override
     public BuildStep pro11_3(String pro11_3) {
        this.pro11_3 = pro11_3;
        return this;
    }
    
    @Override
     public BuildStep pro11_4(String pro11_4) {
        this.pro11_4 = pro11_4;
        return this;
    }
    
    @Override
     public BuildStep pro11_5(String pro11_5) {
        this.pro11_5 = pro11_5;
        return this;
    }
    
    @Override
     public BuildStep pro12_1(String pro12_1) {
        this.pro12_1 = pro12_1;
        return this;
    }
    
    @Override
     public BuildStep pro12_2(String pro12_2) {
        this.pro12_2 = pro12_2;
        return this;
    }
    
    @Override
     public BuildStep pro12_3(String pro12_3) {
        this.pro12_3 = pro12_3;
        return this;
    }
    
    @Override
     public BuildStep pro12_4(String pro12_4) {
        this.pro12_4 = pro12_4;
        return this;
    }
    
    @Override
     public BuildStep pro12_5(String pro12_5) {
        this.pro12_5 = pro12_5;
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
    private CopyOfBuilder(String id, String name, String pro1, String pro2, String pro3, String pro4, String pro5, String pro6_1, String pro6_2, String pro7, String pro8, String pro9, String pro10_1, String pro10_2, String pro10_3, String pro10_4, String pro11_1, String pro11_2, String pro11_3, String pro11_4, String pro11_5, String pro12_1, String pro12_2, String pro12_3, String pro12_4, String pro12_5, Temporal.DateTime updatedAt) {
      super.id(id);
      super.name(name)
        .pro1(pro1)
        .pro2(pro2)
        .pro3(pro3)
        .pro4(pro4)
        .pro5(pro5)
        .pro6_1(pro6_1)
        .pro6_2(pro6_2)
        .pro7(pro7)
        .pro8(pro8)
        .pro9(pro9)
        .pro10_1(pro10_1)
        .pro10_2(pro10_2)
        .pro10_3(pro10_3)
        .pro10_4(pro10_4)
        .pro11_1(pro11_1)
        .pro11_2(pro11_2)
        .pro11_3(pro11_3)
        .pro11_4(pro11_4)
        .pro11_5(pro11_5)
        .pro12_1(pro12_1)
        .pro12_2(pro12_2)
        .pro12_3(pro12_3)
        .pro12_4(pro12_4)
        .pro12_5(pro12_5)
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
     public CopyOfBuilder pro7(String pro7) {
      return (CopyOfBuilder) super.pro7(pro7);
    }
    
    @Override
     public CopyOfBuilder pro8(String pro8) {
      return (CopyOfBuilder) super.pro8(pro8);
    }
    
    @Override
     public CopyOfBuilder pro9(String pro9) {
      return (CopyOfBuilder) super.pro9(pro9);
    }
    
    @Override
     public CopyOfBuilder pro10_1(String pro10_1) {
      return (CopyOfBuilder) super.pro10_1(pro10_1);
    }
    
    @Override
     public CopyOfBuilder pro10_2(String pro10_2) {
      return (CopyOfBuilder) super.pro10_2(pro10_2);
    }
    
    @Override
     public CopyOfBuilder pro10_3(String pro10_3) {
      return (CopyOfBuilder) super.pro10_3(pro10_3);
    }
    
    @Override
     public CopyOfBuilder pro10_4(String pro10_4) {
      return (CopyOfBuilder) super.pro10_4(pro10_4);
    }
    
    @Override
     public CopyOfBuilder pro11_1(String pro11_1) {
      return (CopyOfBuilder) super.pro11_1(pro11_1);
    }
    
    @Override
     public CopyOfBuilder pro11_2(String pro11_2) {
      return (CopyOfBuilder) super.pro11_2(pro11_2);
    }
    
    @Override
     public CopyOfBuilder pro11_3(String pro11_3) {
      return (CopyOfBuilder) super.pro11_3(pro11_3);
    }
    
    @Override
     public CopyOfBuilder pro11_4(String pro11_4) {
      return (CopyOfBuilder) super.pro11_4(pro11_4);
    }
    
    @Override
     public CopyOfBuilder pro11_5(String pro11_5) {
      return (CopyOfBuilder) super.pro11_5(pro11_5);
    }
    
    @Override
     public CopyOfBuilder pro12_1(String pro12_1) {
      return (CopyOfBuilder) super.pro12_1(pro12_1);
    }
    
    @Override
     public CopyOfBuilder pro12_2(String pro12_2) {
      return (CopyOfBuilder) super.pro12_2(pro12_2);
    }
    
    @Override
     public CopyOfBuilder pro12_3(String pro12_3) {
      return (CopyOfBuilder) super.pro12_3(pro12_3);
    }
    
    @Override
     public CopyOfBuilder pro12_4(String pro12_4) {
      return (CopyOfBuilder) super.pro12_4(pro12_4);
    }
    
    @Override
     public CopyOfBuilder pro12_5(String pro12_5) {
      return (CopyOfBuilder) super.pro12_5(pro12_5);
    }
    
    @Override
     public CopyOfBuilder updatedAt(Temporal.DateTime updatedAt) {
      return (CopyOfBuilder) super.updatedAt(updatedAt);
    }
  }
  
}
