package io.micronaut.docs.ioc.validation.custom


// tag::imports[]
import edu.umd.cs.findbugs.annotations.NonNull
import edu.umd.cs.findbugs.annotations.Nullable
import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.*
// end::imports[]

// tag::class[]
class DurationPatternValidator implements ConstraintValidator<DurationPattern, CharSequence> {
    @Override
    boolean isValid(
            @Nullable CharSequence value,
            @NonNull AnnotationValue<DurationPattern> annotationMetadata,
            @NonNull ConstraintValidatorContext context) {
        return value == null || value.toString() ==~ /^PT?[\d]+[SMHD]{1}$/
    }
}
// end::class[]

