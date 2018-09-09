package nc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import nc.annotations.PhoneAnnotation;

public class PhoneValidator implements ConstraintValidator<PhoneAnnotation, String>{

	public boolean isValid(String value, ConstraintValidatorContext context) {
		return (value !=null) && (value.matches("[0-9]+")) && (value.length()==10);
	}

}
