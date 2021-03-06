package com.psddev.cms.view;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link ViewBindings} instead.
 */
@Deprecated
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ViewMappings {

    /**
     * Specifies the list of {@link com.psddev.cms.view.ViewMapping}
     * annotations to be applied.
     */
    ViewMapping[] value();
}
