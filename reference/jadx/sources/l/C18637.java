package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes4.dex */
public final class C18637 implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f60598;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f60599;

    public C18637(Object obj, Object obj2) {
        this.f60598 = obj;
        this.f60599 = obj2;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18637)) {
            return false;
        }
        C18637 c18637 = (C18637) obj;
        Object obj2 = c18637.f60598;
        Object obj3 = this.f60598;
        if (obj3 == null) {
            zEquals = obj2 == null;
        } else {
            zEquals = obj3.equals(obj2);
        }
        if (zEquals) {
            Object obj4 = c18637.f60599;
            Object obj5 = this.f60599;
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
        return C7103.m19444(C7103.m19445(C7103.m19445(0, this.f60598), this.f60599), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.f60598, this.f60599);
    }
}
