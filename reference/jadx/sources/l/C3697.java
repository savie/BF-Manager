package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۘۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes2.dex */
public final class C3697 implements Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f13496;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f13497;

    public C3697(Object obj, Object obj2) {
        this.f13496 = obj;
        this.f13497 = obj2;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3697)) {
            return false;
        }
        C3697 c3697 = (C3697) obj;
        Object obj2 = c3697.f13496;
        Object obj3 = this.f13496;
        if (obj3 == null) {
            zEquals = obj2 == null;
        } else {
            zEquals = obj3.equals(obj2);
        }
        if (zEquals) {
            Object obj4 = c3697.f13497;
            Object obj5 = this.f13497;
            if (obj5 == null) {
                zEquals2 = obj4 == null;
            } else {
                zEquals2 = obj5.equals(obj4);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C4758.m13213(C4758.m13214(C4758.m13214(0, this.f13496), this.f13497), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.f13496, this.f13497);
    }
}
