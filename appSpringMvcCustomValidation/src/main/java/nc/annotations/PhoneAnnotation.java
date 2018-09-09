package nc.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import nc.validator.PhoneValidator;

@Documented
@Constraint(validatedBy=PhoneValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneAnnotation {
	String message() default "Le numéro de téléphone doit avoir 10 chiffres";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
