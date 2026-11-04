package l;

/* JADX INFO: renamed from: l.ۚۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes2.dex */
public class C5393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f18884;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f18885;

    public C5393(Object obj, Object obj2) {
        this.f18884 = obj;
        this.f18885 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5393)) {
            return false;
        }
        C5393 c5393 = (C5393) obj;
        return C5224.m15713(this.f18884, c5393.f18884) && C5224.m15713(this.f18885, c5393.f18885);
    }

    public final int hashCode() {
        Object obj = this.f18884;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f18885;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "<" + this.f18884 + "," + this.f18885 + ">";
    }
}
