package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩹ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5S8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C23503 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75983;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f75984;

    public C23503(Method method, int i) {
        this.f75983 = i;
        this.f75984 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23503)) {
            return false;
        }
        C23503 c23503 = (C23503) obj;
        return this.f75983 == c23503.f75983 && this.f75984.getName().equals(c23503.f75984.getName());
    }

    public final int hashCode() {
        return this.f75984.getName().hashCode() + (this.f75983 * 31);
    }
}
