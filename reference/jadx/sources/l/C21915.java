package l;

import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.᩸᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3Y1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21915 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Field f71106;

    public C21915(Field field) {
        this.f71106 = field;
        field.setAccessible(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48728(AbstractC19611 abstractC19611, Serializable serializable) {
        try {
            this.f71106.set(abstractC19611, serializable);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48727(AbstractC19611 abstractC19611, int i) {
        try {
            this.f71106.set(abstractC19611, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
