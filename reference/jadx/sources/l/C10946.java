package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10946 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f37217;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f37218;

    public C10946(Object obj, Object obj2) {
        this.f37217 = obj;
        this.f37218 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10946)) {
            return false;
        }
        C10946 c10946 = (C10946) obj;
        return C13638.equals(c10946.f37217, this.f37217) && C13638.equals(c10946.f37218, this.f37218);
    }

    public final int hashCode() {
        Object obj = this.f37217;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f37218;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f37217 + " " + this.f37218 + l.d;
    }
}
