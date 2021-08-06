package org.hibernate.validator.referenceguide.chapter06.crossparameter;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ScriptAssertObjectValidator implements
		ConstraintValidator<ScriptAssert, Object> {

	@Override
	public void initialize(ScriptAssert constraintAnnotation) {
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		return false;
	}
}
