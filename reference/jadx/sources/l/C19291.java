package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩵ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5S8 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C19291 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f62257;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Method f62258;

    public C19291(Method method, int i) {
        this.f62257 = i;
        this.f62258 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19291)) {
            return false;
        }
        C19291 c19291 = (C19291) obj;
        return this.f62257 == c19291.f62257 && this.f62258.getName().equals(c19291.f62258.getName());
    }

    public final int hashCode() {
        return this.f62258.getName().hashCode() + (this.f62257 * 31);
    }
}
