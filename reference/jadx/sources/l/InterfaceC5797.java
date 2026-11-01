package l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: alphabetic */
/* JADX WARN: Method from annotation default annotation not found: asm */
/* JADX INFO: renamed from: l.ۛۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: EAVL */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC5797 {
    String[] ignores() default {};

    Class mappingTo() default Void.class;

    EnumC16381 naming() default EnumC16381.CamelCase;

    String[] orders() default {};

    EnumC9326[] parseFeatures() default {};

    Class[] seeAlso() default {};

    EnumC3984[] serialzeFeatures() default {};

    String typeKey() default "";

    String typeName() default "";
}
