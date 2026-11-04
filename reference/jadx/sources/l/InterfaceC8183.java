package l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: l.۟᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: DB98 */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC8183 {
    EnumC10419 cls() default EnumC10419.AUTOMATIC;

    EnumC9673 elementType() default EnumC9673.ANY;

    int index() default 0;

    Class listElementType() default Object.class;

    boolean optional() default false;

    int tagNumber() default -1;

    EnumC1471 tagging() default EnumC1471.NORMAL;

    EnumC9673 type();
}
