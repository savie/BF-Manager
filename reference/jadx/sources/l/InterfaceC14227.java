package l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: l.ܳۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB98 */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC14227 {
    EnumC9288 cls() default EnumC9288.AUTOMATIC;

    EnumC4430 elementType() default EnumC4430.ANY;

    int index() default 0;

    Class listElementType() default Object.class;

    boolean optional() default false;

    int tagNumber() default -1;

    EnumC2936 tagging() default EnumC2936.NORMAL;

    EnumC4430 type();
}
