package nc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import nc.validator.FieldsValueMatchValidator;

@Constraint(validatedBy=FieldsValueMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldsValueMatch {
	String message() default "Les valeurs de champs doivent correspondre!";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
	String field();
	String fieldMatch();
	
	@Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        FieldsValueMatch[] value();
    }
}
