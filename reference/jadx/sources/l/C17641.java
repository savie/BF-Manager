package l;

/* JADX INFO: renamed from: l.ܿ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes4.dex */
public class C17641 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f56076;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f56077;

    public C17641(Object obj, Object obj2) {
        this.f56076 = obj;
        this.f56077 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17641)) {
            return false;
        }
        C17641 c17641 = (C17641) obj;
        return C13530.m33066(this.f56076, c17641.f56076) && C13530.m33066(this.f56077, c17641.f56077);
    }

    public final int hashCode() {
        Object obj = this.f56076;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f56077;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "<" + this.f56076 + "," + this.f56077 + ">";
    }
}
