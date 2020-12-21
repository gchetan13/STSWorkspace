package com.dxc.banking.validator;

import java.util.Arrays;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.passay.LengthRule;
import org.passay.LowercaseCharacterRule;
import org.passay.PasswordData;
import org.passay.PasswordValidator;
import org.passay.RuleResult;
import org.passay.SpecialCharacterRule;
import org.passay.UppercaseCharacterRule;

import com.dxc.banking.annotation.ValidPassword;
import com.dxc.banking.models.UserCredentials;

public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String>{

	@Override
	public boolean isValid(String password, ConstraintValidatorContext context) {
		if(null!=password) {
		PasswordValidator validator = new PasswordValidator(Arrays.asList(
				new LengthRule(5,8),
				new UppercaseCharacterRule(1),
				new LowercaseCharacterRule(1),
				new SpecialCharacterRule(1)
				));
		  RuleResult result = validator.validate(new PasswordData(password));
	        if (result.isValid()) {
	            return true;
	        }
	        context.disableDefaultConstraintViolation();
	        context.buildConstraintViolationWithTemplate("Password should be atleat 5-8 charator long,has atleat 1 Uppercase,1 lowercase and 1 special charactor")
	          .addConstraintViolation();
		}
	        return false;
	}

}
